import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class coins {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world");
        Scanner sc = new Scanner(new File("coins.dat"));
        int datas = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < datas; i++) {
            int total = 0;
            int cointypes = sc.nextInt();
            sc.nextLine();
            String[][] coins = new String[cointypes][3];
            for (int j=0; j < cointypes; j++) {
                String[] line = sc.nextLine().split(" ");
                String cointype = line[0];
                coins[j][0] = cointype;
                //System.out.println(cointype);
                String coinval = line[1];
                coins[j][1] = coinval;
                //System.out.println(coinval);
                coins[j][2] = "0";
            }
            int desiredval = 0;
            int index = 0;
            desiredval = sc.nextInt();
            sc.nextLine();
            while (total < desiredval) {
                //System.out.println(total);
                if ((desiredval-total) >= Integer.parseInt(coins[index][1])) {
                    total += Integer.parseInt(coins[index][1]);
                    coins[index][2] = String.valueOf(Integer.parseInt(coins[index][2]) + 1);
                    //System.out.println(coins[index][2]);
                } else {
                    index++;
                }
            }
            for (int k = 0; k < coins.length; k++){
                System.out.print(coins[k][0] + ": " + coins[k][2] + " ");
            }
            System.out.println("");
        }
        

    }
}