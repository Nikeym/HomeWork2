import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String inputString;
        int spacePosition;

        Scanner input = new Scanner(System.in);
        inputString = input.nextLine();
        spacePosition = inputString.indexOf(" ");

        System.out.println(inputString.substring(0, spacePosition));
        System.out.print(inputString.substring(spacePosition + 1));

    }
}
