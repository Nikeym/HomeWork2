import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println(a < b + c && b < a + c && c < a + b);

    }
}
