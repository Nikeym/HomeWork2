import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int today = 0;

        Scanner input = new Scanner(System.in);
        if ((today = input.nextInt()) >= 6) {
            System.out.println("Ура, выходные!");
        } else {
            System.out.println(6 - today);
        }
    }
}
