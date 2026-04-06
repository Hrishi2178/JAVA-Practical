class Practical10 {

    static void pattern(int n) {

        // upper part
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < 2 * (n - i - 1); s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (int i = n - 2; i >= 0; i--) {
            for (int s = 0; s < 2 * (n - i - 1); s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(3);
    }
}