public class Problem3 {
    public static void main(String[] args) {

        String x = "876";

        //using loop and string method(charAt()) to reverse the number
        for (int i = x.length() - 1; i >= 0; i--) {
            System.out.print(x.charAt(i));
        }

    }
}
