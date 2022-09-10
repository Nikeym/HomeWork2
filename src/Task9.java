import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        final double EPSILON = 1E-14;

        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();

        System.out.println(Math.abs(Math.pow(Math.sin(val), 2) + Math.pow(Math.cos(val), 2) - 1) <= EPSILON);

    }
}
