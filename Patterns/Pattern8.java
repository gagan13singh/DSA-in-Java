package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int c = i > n ? 2 * n - i : i;

            // spaces
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            // descending
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // ascending
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
