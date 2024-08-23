public class Problem6 {
    public static void main(String[] args) {
        // Loop through each row
        for (int i = 1; i <= 5; i++) {
            // Loop through each column in the row
            for (int j = 1; j <= 5; j++) {
                // Print the appropriate number based on the current row and column
                if (j < i) {
                    System.out.print(6 - j);
                } else {
                    System.out.print(6 - i);
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}