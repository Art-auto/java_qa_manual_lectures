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
            Scanner scanner = new Scanner(System.in);
            int sum = 0;

            System.out.println("Enter integers to calculate their sum (enter 'Exit' to end):");
            String input = scanner.nextLine();

            while (!input.equalsIgnoreCase("Exit")) {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or 'Exit'.");
                }

                input = scanner.nextLine();
            }

            System.out.println("The sum of the entered integers is: " + sum);
            scanner.close();
    }
}
