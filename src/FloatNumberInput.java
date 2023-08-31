import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float)
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого необходимо повторно запросить у пользователя ввод данных.
 */
public class FloatNumberInput {
    public static void main(String[] args) {

        System.out.printf("\n ВВЕДЕНО ЧИСЛО %f\n", inputFloat());
    }

    private static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число с плавающей точкой (дробная часть отделяется запятой) ===> ");
            return scanner.nextFloat();
        } catch (InputMismatchException e) {
            return (inputFloat());
        }
    }
}
