import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Volume {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(new File("volume.dat"));
        int count = s.nextInt();
        s.nextLine();
        for (;count > 0; count--) {
            System.out.println(s.nextInt() * s.nextInt() * s.nextInt());
            try {
                s.nextLine();
            } catch (Exception e) {}
        }
    }
}
