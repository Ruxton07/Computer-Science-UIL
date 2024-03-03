import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lisp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("lisp.dat"));
        scan.useDelimiter("(");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}