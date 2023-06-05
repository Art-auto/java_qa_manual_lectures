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
        Scanner myObj = new Scanner(System.in);
        int suma = 0;
        String chislo = "";
        while ( true ) {
            System.out.println("Ввідіть числo ! для виходу ввідіть exit ");
            chislo = myObj.nextLine ();

            if (chislo.equals("exit")){
                System.out.println("Відповідь : " + suma);
               break;
            }
            int suma2 = Integer.valueOf (chislo);
            suma += suma2;
            System.out.println("Відповідь : " + suma);
        }



    }
}
