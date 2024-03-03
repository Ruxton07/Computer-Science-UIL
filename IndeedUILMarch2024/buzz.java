import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class buzz {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("buzz.dat"));
        int n = scanner.nextInt();
        ArrayList<Integer> values = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            String s = "";
            int a = 0;
            int v = scanner.nextInt();
            if(contains_digit(v,7)){
                System.out.print("BUZZA ");
                a++;
            }
            if(contains_digit(v,3)){
                System.out.print("BUZZB ");
                a++;
            }
            if(v%9 == 0){
                System.out.print("BUZZC ");
                a++;
            }
            if(sum(v)%4 == 0){
                System.out.print("BUZZD ");
                a++;
            }
            if(a==0){
                System.out.print(v);
            }
            if(i != 4){
            System.out.println("");
            }
        }
        
        
    }
    public static boolean contains_digit(int a,int b){
        while(a != 0){
             if(a%10 == b){
                return true;
             }
             else{
                a = a/10;
             }
        }
        return false;
    }
    public static int sum(int a){
        int sum = 0;
        while(a != 0){
            sum += a%10;
            a = a/10;
        }
        return sum;
    }
}