package exper;

/**
 * @author E.Parominsky 02/04/2024 17:52
 */
public class CompareTwoInteger {

    public static void main(String[] args) {
        Integer i1 =  128;
        Integer i2 =  128;

        if(i1 == i2){
            System.out.println(">>>>>>>>>>>>>  ==");
        }
        if(((Integer)i1).equals((Integer) i2)){
            System.out.println(">>>>>>>>>>>>>  equals");
        }
    }
}
