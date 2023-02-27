import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("how to Filter your sample HTML Filter?");
        System.out.println("ENTER 1 : to get the filtered HTML source code in String form.");
        System.out.println("ENTER 2 : to get the filtered HTML file");
        System.out.println("ENTER 3 : to EXIT.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                callHtmlFilterOne.callSanitizeHtml();
                break;
            case 2:
                callHtmlFilterTwo.callSanitizeHtmlFile();
                break;
            case 3:
                return;
            default:
                System.out.println(" yor entered wrong number, please try again!");
        }
    }
}
