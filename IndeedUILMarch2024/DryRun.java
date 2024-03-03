import java.util.*;
import java.io.*;

public class DryRun {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("dryrun.dat"));
            int lnCount = in.nextInt();
            in.nextLine();
            for (int i = 0; i< lnCount; i++) {
                String ln = in.nextLine();
                System.out.println("Hello " + ln);
            }
    }
}