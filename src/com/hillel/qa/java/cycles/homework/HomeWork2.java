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
        Scanner enterText = new Scanner(System.in);
        System.out.println("Введи ціле число");

        int a = enterText.nextInt(); // 2
        System.out.println(" Введи друге ціле число ");
        int b = enterText.nextInt(); // 4
        int c = a + b;
        System.out.println(" Cума  = " + c);

        System.out.println("Введи 'Exit' для виходу");

        String inputText = enterText.next();
        if (inputText.equals("Exit")) return;
        while (true) ;



    }
}


