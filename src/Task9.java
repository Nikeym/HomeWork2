import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();

        System.out.println(Math.round((Math.pow(Math.sin(val), 2) + Math.pow(Math.cos(val), 2)) * 100) / 100. == 1);

    }
}
