import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class postfix {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("postfix.dat"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            Stack<Integer> nums = new Stack<Integer>();
            String[] ops = line.split(" ");
            for(String o: ops) {
                if (!(o.equals("*") || o.equals("-") || o.equals("+") || o.equals("/"))) {
                     nums.push(Integer.parseInt(o));
                } else {
                    int op1 = nums.pop();
                    int op2 = nums.pop();
                    if (o.equals("*")) {
                        nums.push(op2*op1);
                    } else if (o.equals("/")) {
                        nums.push((int)(op2/op1));
                    } else if (o.equals("-")) {
                        nums.push(op2-op1);
                    } else {
                        nums.push(op2+op1);
                    }
                }
            }
            System.out.println(nums.pop().toString());
        }
    }
}