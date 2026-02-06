public class Fact {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Error: No factorial for a negative number.");
            return;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
