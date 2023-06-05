package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Намалюйте в консолі прямокутний трикутник із зірочок
     * (або плюсиків, або будь-якого другого символу):
     * на першому рядку - одна зірочка, на другій дві, і так далі.
     * </p>
     * <br>
     * <h2>Вимоги</h2>
     * <ol style="font-size:12px">
     *     <li>Висоту та символ трикутника отримати з клавіатури</li>
     *     <li>Висота трикутника дорівнює висоті яку ми отримали з клавіатури</li>
     *     <li>Трикутник малювати символом який отримали з клавіатури</li>
     *     <li>Використовувати цикл for</li>
     * </ol>
     * <br>
     * <h2>Приклад</h2>
     * <p style="font-size:12px">
     *     Наприклад ввели з клавіатури число 4 та символ "+"
     *     <br>
     *     Вивід:
     *      <br>
     *     +
     *     <br>
     *     ++
     *      <br>
     *     +++
     *     <br>
     *     ++++
     * </p>
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Ввідіть висоту трикутника! ");
        int visota = myObj.nextInt();
        System.out.println("Ввідіть символ трикутника! ");
        String sumbol = myObj2.nextLine();
        String c="";


        for (int i=1; i <=visota; i++) {
            c =  c+sumbol;

            System.out.println(c );
            }
        }




    }



