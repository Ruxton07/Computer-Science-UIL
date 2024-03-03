import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Security {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(new File("security.dat"));
        int count = s.nextInt();
        s.nextLine();
        for (; count > 0; count--) {
            String password = s.nextLine();
            boolean thumbsup = true;

            if (password.length() <= 8) {
                thumbsup = false;
            }

            boolean invalidFmt = false;
            boolean upper = false;
            boolean lower = false;
            boolean number = false;
            for (char c : password.toCharArray()) {
                if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '?')) {
                    invalidFmt = true;
                    break;
                }
                if (Character.isUpperCase(c)) {
                    upper = true;
                }
                if (Character.isLowerCase(c)) {
                    lower = true;
                }
                if (Character.isDigit(c)) {
                    number = true;
                }
            }

            if (thumbsup && !invalidFmt && upper && lower && number) {
                System.out.println("thumbs up");
            }
            else 
                System.out.println("thumbs down");

        }
    }   
}
