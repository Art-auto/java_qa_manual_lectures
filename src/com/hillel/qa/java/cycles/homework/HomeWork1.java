package com.hillel.qa.java.cycles.homework;
import java.util.Scanner;
public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть марку авто: ");
        String marka = scanner.nextLine();

        int counter = 0;
        while (counter < 10) {
            System.out.println(marka + " найкраще авто.");
            counter++;
        }
    }
}
