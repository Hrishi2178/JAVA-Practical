class Sy2024bit036 {

    // Pattern 1
    static void pp1(int size) {

        for (int row = 1; row <= size; row++) {

            if (row != size) {

                // left stars
                for (int leftStar = 1; leftStar <= row; leftStar++) {
                    System.out.print("*");
                }

                // middle spaces
                for (int space = 1; space <= 2 * (size - row) - 1; space++) {
                    System.out.print(" ");
                }

                // right stars
                for (int rightStar = 1; rightStar <= row; rightStar++) {
                    System.out.print("*");
                }

                System.out.println();
            } else {
                // last row
                for (int star = 1; star <= 2 * size - 1; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    // Pattern 2
    static void pp2(int size) {

        for (int row = 1; row <= size; row++) {

            // leading spaces
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= size; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Pattern 3
    static void pp3(int size) {

        int number = 1;

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= row; col++, number++) {
                System.out.print(number);
            }

            System.out.println();
        }
    }

    // Pattern 4
    static void pp4(int size) {

        int middle = (size / 2) + 1;

        for (int row = 1; row <= size; row++) {

            if (row <= middle) {
                // upper half

                for (int space = 1; space <= middle - row; space++) {
                    System.out.print(" ");
                }

                int value = row;
                for (int count = 1; count <= row; count++) {
                    System.out.print(value + " ");
                    value++;
                }

            } else {
                // lower half

                for (int space = 1; space <= row - middle; space++) {
                    System.out.print(" ");
                }

                int value = size - row + 1;
                for (int count = 1; count <= size - row + 1; count++) {
                    System.out.print(value + " ");
                    value++;
                }
            }

            System.out.println();
        }
    }

    // Pattern 5
    static void pp5(int size) {

        int middle = (size / 2) + 1;

        for (int row = 1; row <= size; row++) {

            if (row <= middle) {

                for (int space = 1; space <= middle - row; space++) {
                    System.out.print(" ");
                }

                for (int plus = 1; plus <= row; plus++) {
                    System.out.print("+ ");
                }

            } else {

                for (int space = 1; space <= row - middle; space++) {
                    System.out.print(" ");
                }

                for (int plus = 1; plus <= size - row + 1; plus++) {
                    System.out.print("+ ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int size = 3;

        pp1(size);
        pp2(size);
        pp3(size);
        pp4(size);
        pp5(size);
    }
}
