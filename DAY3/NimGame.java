import java.util.Scanner;

public class NimGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n % 4 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        sc.close();
    }
}