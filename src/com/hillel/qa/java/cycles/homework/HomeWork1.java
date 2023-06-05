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
        System.out.println("Ввести з клавіатури марку авто");
        int i = 0;
        String Text = console.nextLine();
        while (i < 10) {
            System.out.println (Text +" найкраще авто");
            i++;
        }
    }
}
