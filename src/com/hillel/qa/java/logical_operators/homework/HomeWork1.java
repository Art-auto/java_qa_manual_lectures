package com.hillel.qa.java.logical_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * В нас буде програма яка буде виводити в консоль змінну isProvideDriverLicense,
     * в якій буде зберігатися значення true, false. Вимоги для отримання водійського посвідчення
     * наступні:
     * </p>
     * <ol style="font-size:12px">
     *     <li>Рік людини дорівнював або був більше 16.</li>
     *     <li>Є страховка.</li>
     *     <li>Лікарський дозвіл що ви можете водити авто.</li>
     * </ol>
     */

        public static void main(String[] args) {
            int age = 18; // Вік людини
            boolean hasInsurance = true; // Наявність страховки
            boolean hasMedicalApproval = true; // Наявність лікарського дозволу

            boolean isProvideDriverLicense = (age >= 16) && hasInsurance && hasMedicalApproval;

            System.out.println("Чи можна отримати водійське посвідчення? " + isProvideDriverLicense);
        }

}
