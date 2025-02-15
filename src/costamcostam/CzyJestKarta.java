package costamcostam;
import java.util.Scanner;


public class CzyJestKarta {

    int opcja = 3;

    public class SprawdzPin extends CzyJestKarta {
        boolean kartaIn = false;
        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();

        String przelacznik = switch (opcja) {

            case (pin != 1234) -> 1 {



            }
            case 2 -> {


            }
            default -> throw new IllegalStateException("Unexpected value: " + opcja);
        }
    }
    
}