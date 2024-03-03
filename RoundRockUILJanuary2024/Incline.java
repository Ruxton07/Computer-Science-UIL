import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Incline {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(new File("incline.dat"));
        int count = s.nextInt();
        s.nextLine();
        for (;count > 0; count--) {
            int size = s.nextInt();
            try {
                s.nextLine();
            } catch (Exception e) {

            }
            for (int i = 1; i <= size; i++) {
                for (int k = 0; k <= size-i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j<=i; j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            if (count > 1)
                System.out.println();
        }
    }   
}
