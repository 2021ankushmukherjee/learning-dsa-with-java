class Patterns {

    public static void main(String[] args) {

        // Fill Square Pattern

        // int n = 10;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Hollow Square Pattern

        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Half Pyramid

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Inverted Half Pyramid

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
        
        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop -> Space print
            for (int j = 1; i <= j; j++) {
                System.out.print("");
            }

            // inner loop -> star print
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}