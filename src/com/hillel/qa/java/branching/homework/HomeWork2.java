package com.hillel.qa.java.branching.homework;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     *     Згадаймо математику та систему координат.
     *     Необхідно написати програму в якій будуть дві зміні x, y.
     *     Програма повинна казати в якій чверті знаходиться ціль згідно зміним x, y.
     *     В консоль повинно виводиться - "Ціль знаходиться в (номер чверті)!",
     *     врахуйте обробку якщо x, y будуть 0.
     * </p>
     *
     */
    public static void main(String[] args) {
        int x = 2;
        int y = -1;

        if (x > 0 && y > 0) {
            System.out.println("The target is in the first quadrant!");
        } else if (x < 0 && y > 0) {
            System.out.println("The target is in the second quadrant!");
        } else if (x < 0 && y < 0) {
            System.out.println("The target is in the third quadrant!");
        } else if (x > 0 && y < 0) {
            System.out.println("The target is in the fourth quadrant!");
        } else {
            System.out.println("The target is at the origin (0, 0)!");
        }
    }
}
