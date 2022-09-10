import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        boolean haveNumber = false, haveUpperCase = false, haveLowerCase = false, haveSimbol = false;

        Scanner input = new Scanner(System.in);
        String pass = input.next();

        if (pass.length() < 8) {
            System.out.println("пароль не прошел проверку");
        }

        for (int i = 0 ; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (!haveNumber && c >= '0' && c <= '9') {
                haveNumber = true;
            } else if (!haveUpperCase && c >= 'A' && c <= 'Z') {
                haveUpperCase = true;
            } else if (!haveLowerCase && c >= 'a' && c <= 'z') {
                haveLowerCase = true;
            } else if (!haveSimbol && (c == '(' || c == '_' || c == '*' || c == '-' || c == ')')) {
                haveSimbol = true;
            }
            if (haveNumber && haveUpperCase && haveLowerCase && haveSimbol) {
                System.out.println("пароль надежный");
                return;
            }
        }

        System.out.println("пароль не прошел проверку");

    }
}
