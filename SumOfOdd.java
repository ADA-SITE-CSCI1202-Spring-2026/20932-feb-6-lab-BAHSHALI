import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        input.close();
    }
}
