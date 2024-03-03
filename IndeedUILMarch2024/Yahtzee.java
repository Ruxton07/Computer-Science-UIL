import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Yahtzee {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("yahtzee.dat"));

        
        while(scan.hasNext()){
            ArrayList<Integer> h = new ArrayList<Integer>();
            int s = scan.nextInt();
            for(int i = 0; i<5; i++){
                h.add(s%10);
                s /= 10;
            }
            int a = six(h);
            int b = three(h);
            int c = four(h);
            int d = fullhouse(h);
            int e = chance(h);
            int f = yah(h);
            System.out.print(Math.max(f,Math.max(e,Math.max(d,Math.max(c,Math.max(a,b))))));
            if(scan.hasNext()){
                System.out.println("");
            }
        }
        
    }
    public static int six(ArrayList<Integer> h){
        int counter = 0;
        for(int i : h ){
            if(i == 6){
                counter++;
            }
        }
        return 10 * counter;
    }
    public static int three(ArrayList<Integer> h){
        
        for(int i = 1; i <= 6; i++){
        int counter = 0;
        for(int x : h ){
            if(x == i){
                counter++;
            }
        }
        if(counter >= 3){
            return (i*counter)*2;
        }
    }
        return 0;
    }
    public static int four(ArrayList<Integer> h){
        for(int i = 1; i <= 6; i++){
            int counter = 0;
            for(int x : h ){
                if(x == i){
                    counter++;
                }
            }
            if(counter >= 4){
                return (i*counter)*3;
            }
        }
            return 0;
        }
        public static int fullhouse(ArrayList<Integer> h){
            int values = 0;
            for(int i = 1; i <= 6; i++){
                int counter = 0;
                for(int x : h ){
                    if(x == i){
                        counter++;
                    }
                }
                if(counter == 2){
                    values++;
                }
                if(counter == 3){
                    values++;
                }
            }
                if(values == 2){
                    return 75;
                }
                else{
                    return 0;
                }
            }
        public static int chance(ArrayList<Integer> h){
            Collections.sort(h);
            int sum = 0;
            for(int i = 4; i >= 1; i--){
               sum+=h.get(i);
            }
            return sum;
        }
        public static int yah(ArrayList<Integer> h){
           
           for(int i = 1; i <= 6; i++){
            int counter = 0;
            for(int x : h){
                if(x == i){
                    counter++;
                }
                if(counter == 5){
                    return 100;
                   }
            }
           }
           return 0;
        }

    

}