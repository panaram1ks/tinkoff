package exper;

/**
 * @author E.Parominsky 28/03/2024 17:39
 */
public class Challenge {

    Challenge(){
        System.out.print("Constructor, ");
    }

    static{
        System.out.print("Static, ");
    }

    {
        System.out.print("Instant, ");
    }

    public static void main(String[] args) {
        Challenge obj1 = new Challenge();
    }
}
