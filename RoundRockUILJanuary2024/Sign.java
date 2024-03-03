import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sign {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(new File("sign.dat"));
        int count = s.nextInt();
        s.nextLine();
        for (;count > 0; count--) {
            String real = s.nextLine();
            for (int i = real.length()-1; i >= 0; i--) {
                System.out.print(real.charAt(i));
            }
            System.out.println();
        }
    }
}
