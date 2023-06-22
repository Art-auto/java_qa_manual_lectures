package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = 0;
        while (x < 10) {
            System.out.print("Введіть марку авто: ");
            String brand = console.nextLine();
            System.out.println(brand + " найкраще авто.");

            x++;
        }

        console.close();
    }
}
