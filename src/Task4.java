import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String str = inputNotEmptyString();
        System.out.println("Вы ввели строку \"" + str + "\"");
    }

    private static String inputNotEmptyString () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String result = scanner.nextLine();
        if (result.trim().isEmpty()) throw new RuntimeException("Вы ввели пустую строку. \n");
        return result;
    }
}
