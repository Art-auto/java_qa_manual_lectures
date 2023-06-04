
package com.hillel.qa.java.cycles.homework;
import java.util.Scanner;
public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, в яку потрібно вводити з клавіатури цілі числа й рахувати їх суму,
     * якщо користувач введе слово "Exit", закінчуємо програму. Вивести на екран отриману суму й завершити програму.
     * Використовуйте цикл while().
     * </p>
     * <br>
     * <h2>Підказка</h2>
     *
     * @see <a href="https://www.w3schools.blog/string-to-int-java">String To Int In Java</a>
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        String input = "";

        while (!input.equalsIgnoreCase("exit")) {
            System.out.print("Введіть ціле число або exit для отримання суми чисел : ");
            input = console.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            boolean isNumber = false;
            try {
                int number = Integer.parseInt(input);
                isNumber = true;
            } catch (NumberFormatException e) {

            }
            if (isNumber) {
                int number = Integer.parseInt(input);
                sum += number;
            } else {
                System.out.println("Введіть ціле число або 'Exit'.");
            }
        }

        System.out.println("Сума чисел: " + sum);
    }
}