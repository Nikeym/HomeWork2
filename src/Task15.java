import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pass = input.next();
        System.out.println(pass.matches("#[0-9A-F]{7}"));

    }
}
