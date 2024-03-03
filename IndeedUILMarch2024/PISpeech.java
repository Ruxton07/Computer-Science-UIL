import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PISpeech {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("PISpeech.dat"));
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}