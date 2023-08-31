public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 0};
        int[] arr2 = {1, 3, 5, 234, 65, 34, 46, 34};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 345};

        catchingExceptions(arr1);
        catchingExceptions(arr2);
        catchingExceptions(arr3);
    }

    private static void catchingExceptions(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
