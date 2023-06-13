package com.hillel.qa.java.branching.homework;
import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, яка буде рахувати можливість існування трикутника,
     * виходячи з довжин його сторін.
     * Вимоги:
     *     <ol style="font-size:12px">
     *         <li>Ввести з клавіатури три числа — довжини сторін передбачуваного трикутника.
     *         Для того щоб це зробити самостійно гляньте як працює Scanner scanner = new Scanner(System.in);</li>
     *         <li>Визначити можливість існування трикутника з даними сторонами.</li>
     *         <li> Результат вивести на екран : "Трикутник можливо побудувати" або "Трикутник не можливо побудувати".</li>
     *     </ol>
     * </p>
     *
     * @see <a href="https://www.w3schools.com/java/java_user_input.asp">Стаття як користуватися Scanner</a>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the sides of the triangle:");

        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        boolean isPossible = (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);

        if (isPossible) {
            System.out.println("It is possible to construct a triangle.");
        } else {
            System.out.println("It is impossible to construct a triangle.");
        }
    }
}
