import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Weights {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(new File("weights.dat"));
        for (int count = s.nextInt(); count > 0; count--) {
            double weight = (s.nextInt() - 45) / 2.0;
            System.out.print((int)(weight/45.0) + " 45");
            weight = weight - (int)(weight/45.0) * 45;

                if ((int)(weight/25.0) != 0)
                    System.out.print(" " +  (int)(weight/25.0) + " 25");
                
                weight = weight - (int)(weight/25.0) * 25;
                if ((int)(weight/10.0) != 0)
                    System.out.print(" " +  (int)(weight/10.0) + " 10");

                weight = weight - (int)(weight/10.0) * 10;
                if ((int)(weight/5.0) != 0)
                    System.out.print(" " +  (int)(weight/5.0) + " 5");

                weight = weight - (int)(weight/5) * 5;
                if ((int)(weight/2.5) != 0)
                    System.out.print(" " +  (int)(weight/2.5) + " 2.5");
            System.out.println();
        }
    }
}
