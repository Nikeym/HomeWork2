import java.util.Locale;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pack = input.nextLine().toLowerCase(Locale.ROOT);

        if (pack.contains("камни!") && pack.contains("запрещенная продукция")) {
            System.out.println("в посылке камни и запрещенная продукция");
        } else if (pack.contains("камни!")) {
            System.out.println("камни в посылке");
        } else if (pack.contains("запрещенная продукция")) {
            System.out.println("в посылке запрещенная продукция");
        } else {
            System.out.println("все ок");
        }

    }
}
