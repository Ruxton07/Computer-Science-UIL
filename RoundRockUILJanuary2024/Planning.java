import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Planning {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("planning.dat"));
        int n = s.nextInt();
        s.nextLine();

        for (;n>0;n--) {
            ArrayList<Date> dates = new ArrayList<>();
            int d = s.nextInt();

            for (;d>0;d--) {
                String da = s.next();
                dates.add(new Date(da));
                s.nextLine();
            }
            Collections.sort(dates);

            for (Date date : dates) {
                if (date.getDay() == 6 || date.getDay() == 0) {
                    String[] parts = DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRANCE).format(date).split("/");
                    System.out.println(parts[1] + "/" + parts[0] + "/" + parts[2]);
                }
            }
            System.out.println();
        }
    }

}
