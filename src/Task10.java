import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        final double EPSILON = 1E-14;

        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();

        System.out.println(Math.abs(Math.log(Math.pow(Math.E, val)) - val) <= EPSILON);

    }
}
