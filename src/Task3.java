import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) // throws Exception - если мы проверяем на Throwable, это избыточно
    {
        try {
            int a = 90;
            int b = 3;
//            int b = 0;  // Проверка работы при попытке деления на ноль
            System.out.println(a / b);
            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            int[] abc = null;  // Проверка на NullPointerException
            int[] abc = {1, 2, 3, 4, 5}; // Проверка на НЕвыход за границы массива
            abc[3] = 9;
        } catch (ArithmeticException ex) {  // Добавила проверку на деление на 0 на случай, если b = 0
            System.out.println("На ноль делить нельзя, а переменная b равна нулю!");
        }
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            // данное исключение должно идти последним, чтобы ловить все не предусмотренные программистом исключения
            // Если мы его добавляем, то throws Exception в методе main надо убрать, поскольку данный блок обрабатывает
            // любые не предусмотренные программистом исключения
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
//        throw new RuntimeException("Исключение в методе printSum(Integer a, Integer b)");
    }

}
