package com.hillel.qa.java.branching.homework;

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
        double purchaseAmount = 1000.0;
        String paymentMethod = "card";
        double totalAmount = 0.0;

        switch (paymentMethod) {
            case "cash":
                totalAmount = purchaseAmount;
                break;
            case "card":
                double cardCommission = 0.02 * purchaseAmount;
                totalAmount = purchaseAmount + cardCommission;
                break;
            case "invoice":
                double invoiceCommission = 0.05 * purchaseAmount;
                totalAmount = purchaseAmount + invoiceCommission;
                break;
            default:
                System.out.println("Невідомий спосіб оплати");
                return;
        }

        System.out.println("Сума для оплати: " + totalAmount);
    }
}
