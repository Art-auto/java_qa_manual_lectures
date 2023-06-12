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

        double enterSuma = 200; // Задайте суму купівлі

        String variantOplata = "карткою"; // Задайте спосіб оплати (може бути "готівкою", "карткою" або "рахунком")

        double komisiya = 0; // Змінна для збереження суми комісії

        switch (variantOplata) {
            case "готівкою":
                komisiya = 0;
                break;
            case "карткою":
                komisiya = enterSuma * 0.02;
                break;
            case "рахунком":
                komisiya = enterSuma * 0.05;
                break;
            default:
                System.out.println("Невірний спосіб оплати");
                return;
        }

        double sumaDlyaOplaty = enterSuma + komisiya;

        System.out.println("Сума для оплати: " + sumaDlyaOplaty);
    }
}


