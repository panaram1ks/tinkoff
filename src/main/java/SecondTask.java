import org.w3c.dom.ranges.RangeException;

import java.util.Scanner;

/**
 * @author E.Parominsky 14/03/2024 14:33
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(scanner){
            if(scanner.hasNext()){
                String input = scanner.next();
                Integer inputNum = Integer.valueOf(input);
                if(inputNum >= 1 || inputNum <= (2 * Math.pow(10, 9))){
                    countCut(inputNum);
                } else {
                    throw new Exception();
                }

            }
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    private static int countCut(int amountOfPeople){
        if(amountOfPeople % 2 == 0){

        } else {
            int a = amountOfPeople - 1;
            int midle = a / 2;
        }
    }
}
