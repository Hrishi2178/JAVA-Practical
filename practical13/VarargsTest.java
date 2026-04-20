class VarargsTest {

    static void fun(String... s) {
        System.out.println("String version");
    }

    static void fun(int... i) {
        System.out.println("Int version");
    }

    public static void main(String[] args) {
        // fun(); // ERROR: ambiguous

        fun("Hello"); // String version
        fun(1, 2, 3); // Int version
    }
}