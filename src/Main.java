import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println("В " + (i + 1) + " день было потрачено " + arr[i] + " рублей");
        }
        System.out.println("");

        // Task 1

        int totalMonthPayment = 0;
        for (int v : arr) {
            totalMonthPayment += v;
        }
        System.out.print("\"Сумма трат за месяц составила " + totalMonthPayment + " рублей\".");
        System.out.println("");

        // Task 2

        int maxDayPayment = -1;
        for (int a : arr) {
            if (a > maxDayPayment) {
                maxDayPayment = a;
            }
        }

        int minDayPayment = 250_000;
        for (int b : arr) {
            if (b < minDayPayment) {
                minDayPayment = b;
            }
        }
        System.out.println("\"Минимальная сумма трат за день составила " + minDayPayment + " рублей. Максимальная сумма трат за день составила " + maxDayPayment + " рублей\".");

        // Task 3

        double meanPayments = totalMonthPayment / arr.length;
        System.out.println("\"Средняя сумма трат за месяц составила " + meanPayments + " рублей\".");
        System.out.println("");


        // Task 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int c = reverseFullName.length -1; c >= 0; c--) {

            System.out.print(reverseFullName[c]);
        }

        return arr;
    }
}