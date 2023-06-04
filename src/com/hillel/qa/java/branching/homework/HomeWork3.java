package com.hillel.qa.java.branching.homework;
import java.util.Scanner;
public class HomeWork3 {
    /**
     * <h1>Вимоги</h1>
     * <p style="font-size:12px">
     * 1. Оплата за товар проводитиметься способами:
     * <br>
     * - готівкою, додаткова комісія не стягується;
     * <br>
     * - карткою, стягується додаткова комісія 2% від суми купівлі.
     * <br>
     * - за рахунком, стягується додаткова комісія 5% від суми купівлі.
     * <br>
     * 2. Сума купівлі (призначити самостійно) сплачена карткою.
     * <br>
     * 3. Виведіть суму для оплати (сума купівлі з урахуванням суми комісії).
     * <br>
     * 4. Врахуйте варіанти виведення, коли немає відповідності будь-якому способу оплати.
     * <br>
     * 5. Завдання необхідно виконати за допомогою switch case
     * </p>
     */
    public static void main(String[] args) {
        double purchase = 57.0;

        Scanner console = new Scanner(System.in);
        System.out.println("Виберіть спосіб оплати:  1 - готівка, 2 - картка, 3 - рахунок");
        int paymentMethod = console.nextInt();

        double totalPay = 0.0;

        switch (paymentMethod) {
            case 1:
                totalPay = purchase;
                break;
            case 2:
                double cardCommission = purchase * 0.02;
                totalPay = purchase + cardCommission;
                break;
            case 3:
                double accountCommission = purchase * 0.05;
                totalPay = purchase + accountCommission;
                break;
            default:
                System.out.println("Неправильний спосіб оплати.");
                return;
        }

        System.out.println("Сума до оплати: " + totalPay);
    }
}
