import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author E.Parominsky 12/03/2024 14:38
 */
public class PriceCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        boolean isInputIsNotCorrect = true;
        while (isInputIsNotCorrect) {
            try {
                if (scanner.hasNextLine()) {
                    inputStr = scanner.nextLine();
                }
                List<Integer> inputNumbers = Arrays.stream(inputStr.trim().split(" ")).map(str -> Integer.valueOf(str)).collect(Collectors.toList());
                if (inputNumbers.size() != 4) {
                    throw new IllegalArgumentException("Введено неверное количество чисел");
                }
                int mountCost = calculateSum(inputNumbers.get(0), inputNumbers.get(1), inputNumbers.get(2), inputNumbers.get(3));
                System.out.println(mountCost);
                isInputIsNotCorrect = false;
            } catch (NumberFormatException e) {
                System.out.println("Не является числом " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
    }

    public static int calculateSum(int mountCost, int includeTraffic, int overPrice, int planingTraffic) {
        int result = mountCost + ((planingTraffic - includeTraffic) * overPrice);
        return result > mountCost ? result : mountCost;
    }
}
