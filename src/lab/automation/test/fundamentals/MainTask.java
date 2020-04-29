package lab.automation.test.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class MainTask {

//  1. Приветствовать любого пользователя при вводе его имени через командную строку.

    private static void helloThereTaskOne() {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name);
    }

//  2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

    private static void reverseTaskTwo(String[] args) {

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }

//  3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

    private static void randomTaskTree(int length, String separator) {

        Random random = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            result += random.nextInt() + separator;
        }
        System.out.println(result);
    }

//    4. Ввести целые числа как аргументы командной строки,
//    подсчитать их сумму (произведение) и вывести результат на консоль.

    private static void sumTaskFour(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }


//    5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
//    Осуществить проверку корректности ввода чисел.

    private static void monthsTaskFive(int number) {

        String month;
        switch (number) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
//                throw new IllegalArgumentException("invalid value entered : " + number);
                month = "invalid value entered : " + number;
        }
        System.out.println(month);
    }

    public static void main(String[] args) {

        helloThereTaskOne();
        reverseTaskTwo(args);
        randomTaskTree(8, "\r\n");
        randomTaskTree(8, " ");
        sumTaskFour(args);
        monthsTaskFive(11);
    }
}
