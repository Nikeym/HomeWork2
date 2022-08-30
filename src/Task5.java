import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        System.out.println((b * b - 4 * a * c >= 0) ? "Решение есть" : "Решения нет");

    }
}
