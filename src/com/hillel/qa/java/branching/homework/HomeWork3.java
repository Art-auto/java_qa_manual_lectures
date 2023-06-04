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
        double purchaseAmount = 1000.0; // Сума купівлі
        double commissionRate = 0.0; // Відсоток комісії

        String paymentMethod = "картка"; // Спосіб оплати: "готівка", "картка", "рахунок"

        switch (paymentMethod) {
            case "готівка":
                commissionRate = 0.0;
                break;
            case "картка":
                commissionRate = 0.02;
                break;
            case "рахунок":
                commissionRate = 0.05;
                break;
            default:
                System.out.println("Недоступний спосіб оплати.");
                return;
        }

        double commission = purchaseAmount * commissionRate; // Сума комісії
        double totalAmount = purchaseAmount + commission; // Загальна сума для оплати

        System.out.println("Сума для оплати: " + totalAmount);
    }
}
