import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rack {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(new File("rack.dat"));
        int count = s.nextInt();
        s.nextLine();

        for (; count > 0; count--) {
            int nRows = s.nextInt();
            int nCols = s.nextInt();
            String bruh[][] = new String[nRows][nCols];
            s.nextLine();

            int goodRacks = 0;
            for (int r = 0; r < nRows; r++) {
                for (int c = 0; c < nCols; c++) {
                    // bruh[r][c] = s.next();
                    System.out.print(s.next());
                }
                s.nextLine();
                System.out.println();
            }
        }
    }
}
