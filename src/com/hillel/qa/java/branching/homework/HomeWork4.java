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
        Scanner enterText = new Scanner(System.in);

        System.out.println("Введіть довжини сторін трикутника:");
        int side1 = enterText.nextInt();
        int side2 = enterText.nextInt();
        int side3 = enterText.nextInt();

        boolean isPossible = (side1 + side2 >= side3) && (side1 + side3 >= side2) && (side2 + side3 >= side1);

        if (isPossible) {
            System.out.println("Трикутник можливо побудувати");
        } else {
            System.out.println("Трикутник не можливо побудувати");
        }




    }
}
