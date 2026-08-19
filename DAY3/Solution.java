import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;

        // First reversal
        int reversed1 = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed1 = reversed1 * 10 + digit;
            num = num / 10;
        }

        // Second reversal
        int reversed2 = 0;

        while (reversed1 > 0) {
            int digit = reversed1 % 10;
            reversed2 = reversed2 * 10 + digit;
            reversed1 = reversed1 / 10;
        }

        if (reversed2 == original) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}