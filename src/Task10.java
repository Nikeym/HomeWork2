import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();

        System.out.println(Math.round(Math.log(Math.pow(Math.E, val)) * 100) / 100. == val);

    }
}
