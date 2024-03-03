import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DryRun {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(new File("dryrun.dat"));
        for (int count = s.nextInt(); count > 0; count--) {
            System.out.println("I like " + s.next() + ".");
        }
    }
}
