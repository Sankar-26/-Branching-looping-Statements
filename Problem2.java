import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        //Read input from user
        Scanner obj = new Scanner(System.in);
        long x = obj.nextLong();

        // condition to check if the input is either Positive or Negative or neither
        if (x < 0) {
            System.out.println("Negative number");
        } else if (x >0) {
            System.out.println("Positive number");
        }else{
            System.out.println("Neither Positive nor Negative");
        }

    }
}
