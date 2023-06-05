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
        int symmaCypivli = 740;
        int gotivka = symmaCypivli;
        double card = symmaCypivli - (symmaCypivli*0.02);
        double rahynok = symmaCypivli - (symmaCypivli*0.05);
        int sposobOplaty = 2;
        switch (sposobOplaty) {
            case 1:
                System.out.println("сумa дo оплати -" + gotivka);
                break;
            case 2:
                System.out.println("сумa дo оплати -" + card);
                break;
            case 3:
                System.out.println("сумa дo оплати -" + rahynok);
                break;
            default:
                System.out.println("Вибиріть способ олати   1-Готшвка  2-Карта  3-Рахунок");
        }
    }
 }
