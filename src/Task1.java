import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int secondValue;
        Scanner input = new Scanner(System.in);
        if (input.nextInt() > (secondValue = input.nextInt()) && secondValue > input.nextInt()) {
            System.out.print("Петя, пора трудиться");
        } else {
            System.out.print("Петя молодец!");
        }
    }
}
