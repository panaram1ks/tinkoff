package exper;

/**
 * @author E.Parominsky 22/04/2024 14:05
 */
public class CheckStrings {
    public static void main(String[] args) {
        String house = " house";

        String mainStr = "Orange house";
        String newStr = "Orange" + house;

        String notInPool = new String("Orange") + " house";
        String notInPoolAll = new String("Orange house");

        if(mainStr.equals(newStr)){
            System.out.println("mainStr.equals(newStr) is true");
        }
        if(mainStr == newStr){
            System.out.println("mainStr == newStr is true");
        }

        if(mainStr.equals(notInPool)){
            System.out.println("mainStr.equals(notInPool) is true");
        }
        if(mainStr == notInPool){
            System.out.println("mainStr == notInPool is true");
        }

        if(mainStr.equals(notInPoolAll)){
            System.out.println("mainStr.equals(notInPoolAll) is true");
        }
        if(mainStr == notInPoolAll){
            System.out.println("mainStr == notInPoolAll is true");
        }

        String intern = notInPoolAll.intern();
        if(mainStr == notInPoolAll){
            System.out.println("mainStr == notInPoolAll is true");
        }
        if(mainStr == intern){
            System.out.println("mainStr == intern is true");
        }

        System.out.println();
    }
}
