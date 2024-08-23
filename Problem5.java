import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        //Read input from user
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        //condition to check if the input and apply the discount
        if (x > 1000) {
            System.out.println(x - (x * 0.2) + " -- 20% discount");
        } else if (x >= 500) {
            System.out.println(x - (x * 0.1) + " -- 10% discount");
        } else {
            System.out.println(x + " -- No discount");
        }

    }
}
