import java.util.Scanner;

public class functions {
    public static void main(String[] args){
        Scanner userScanner = new Scanner(System.in);


        System.out.println("please input the loan value:");
        int amount = userScanner.nextInt();

        double intrestCost = calcIntrestAmount(amount);

        System.out.println("A loan of $" + String.valueOf(amount) + " wiht 3.75 percent apr would cost $" + String.valueOf(intrestCost));

        userScanner.close();
    }

    public static double calcIntrestAmount(int loan){
        return loan * 1.0375d;
    }
}