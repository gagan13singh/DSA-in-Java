package Patterns;
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            // descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }

            // ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }

            // move to next line after full row
            System.out.println();
        }
    }
}
