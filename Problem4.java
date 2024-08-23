import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        //Read input from user
        Scanner obj = new Scanner(System.in);

        int x = obj.nextInt();
        int y = obj.nextInt();
        int z = obj.nextInt();

        if (x < y && x < z) {
            System.out.println(x + " is the smallest number.");
        } else if (y < z) {
            System.out.println(y + " is the smallest number.");
        } else {
            System.out.println(z + " is the smallest number.");
        }

    }
}
