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
            Scanner Text = new Scanner(System.in);
            System.out.println("Введи перше ціле число:");

            int a = Text.nextInt();
            System.out.println(" Введи друге ціле число: ");
            int b = Text.nextInt();
            int c = a + b;
            System.out.println(" Cума  = " + c);

            System.out.println("Введи 'Exit' для виходу");

            String inputText = Text.next();
            if (inputText.equals("Exit")) return;
            while (true) ;
    }
}



