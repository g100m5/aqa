package lab.automation.test.fundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask {

//    2. Вывести числа в порядке возрастания (убывания) значений их длины.

    private static String[] sortByStringLengthTaskTwo(String[] array) {

        for (int i = 0; i < array.length; i++) {

            String min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].replace("-", "").length()
                        < min.replace("-", "").length()) {
                    min = array[j];
                    minId = j;
                }
            }
            String temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }


//    3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

    private static void getLessThanAverageTaskThree(String[] array) {

        int average;
        StringBuilder result = new StringBuilder();

        String [] sortedArray = sortByStringLengthTaskTwo(array);

        average = (sortedArray[0].replace("-", "").length()
                + sortedArray[sortedArray.length - 1].replace("-", "").length()) / 2;

        for (String element : sortedArray) {
            if (element.replace("-", "").length() < average) {
                result.append(String.format("The number %s is less than average [%d], the length of the number = %s. \n",
                        element, average, element.replace("-", "").length()));
            }
        }
        System.out.println(result);
    }

//    4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

    private static void minUniqueCharsTaskFour(String[] array) {

        int number = 0;
        int result = array[0].replace("-", "").length();

        for (String element : array) {
            int unique = 0;
            for (int i = 0; i < element.replace("-", "").length(); i++) {
                int marker = 1;
                for (int charId = i; charId < element.replace("-", "").length() - 1; charId++) {
                    if (element.replace("-", "").charAt(i)
                            == element.replace("-", "").charAt(charId + 1)) {
                        marker++;
                        break;
                    }
                }
                if (marker == 1) {
                    unique++;
                }
            }
            if (unique != 0) {
                if (unique < result) {
                    result = unique;
                    number = Integer.parseInt(element);
                }
            }
        }
        System.out.println(number);
    }

    // print array
    private static void printArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args) {
//      String[] arr = {"121", "0", "322", "55123555", "551", "899911111", "11111111", "-4444", "2222"};

        System.out.println("Hi, please, enter massive length : ");

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] arr = new String[n];

        System.out.println("Then enter " + n + " numbers");
        for (int x = 0; x < n; x++) {
            arr[x] = scan.nextLine();
        }


// #2
        String [] sortedArray = sortByStringLengthTaskTwo(arr);
        System.out.println("Sorting entered numbers: ");
        printArray(sortedArray);
// #3
        getLessThanAverageTaskThree(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reverse sorted numbers : ");
        printArray(arr);
// #4
        System.out.println("the number, where the different digits is minimal");
        minUniqueCharsTaskFour(arr);

    }


}
