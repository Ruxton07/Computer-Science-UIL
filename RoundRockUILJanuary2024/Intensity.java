import java.io.File;
import java.util.Scanner;

public class Intensity {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("intensity.dat"));
        int e = 0;
        s.nextLine();
        while (s.hasNext()) {
            String s2 = s.next();
            if (s2.equals("END")) {
                if (e < 5)
                    System.out.println("needs more effort");
                else if (e < 6)
                    System.out.println("just right");
                else
                    System.out.println("junk volume");
                e = 0;
            }
            else
                e++;
            //System.out.println(s2);
        }
    }
}
