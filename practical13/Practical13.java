class Practical13 {
    public static void main(String[] args) {

        // Check arguments count
        if (args.length < 2) {
            System.out.println("Error: Please provide exactly 2 arguments.");
            return;
        }

        if (args.length > 2) {
            System.out.println("Warning: Extra arguments will be ignored.");
        }

        String charArg = args[0];
        String str = args[1];

        // Validate first argument
        if (charArg.length() != 1) {
            System.out.println("Error: First argument must be a single character.");
            return;
        }

        char ch = charArg.charAt(0);

        // Approach 1: Loop
        System.out.println("Using Loop:");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.print(ch + " ");
            }
        }

        // Approach 2: StringBuilder
        System.out.println("\nUsing StringBuilder:");
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ch) {
                sb.append(c).append(" ");
            }
        }
        System.out.println(sb.toString());

        // Approach 3: replace
        System.out.println("Using replace:");
        String replaced = str.replace(String.valueOf(ch), ch + " ");
        System.out.println(replaced);
    }
}