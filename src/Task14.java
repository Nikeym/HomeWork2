import java.util.Locale;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String phone = input.nextLine().toLowerCase(Locale.ROOT);
        int cost = input.nextInt();

        System.out.println(phone);
        System.out.println(cost);

        if (cost >= 50000 && cost <= 120000 && (phone.contains("samsung") || phone.contains("iphone"))) {
            System.out.println("Можно купить");
        } else {
            System.out.println("Не подходит/");
        }

    }
}
