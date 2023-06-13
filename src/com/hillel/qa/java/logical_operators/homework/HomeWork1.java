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
        boolean ageCondition = true; // Assuming the age condition is true
        boolean hasInsurance = true; // Assuming the insurance condition is true
        boolean hasMedicalPermission = true; // Assuming the medical permission condition is true

        boolean isProvideDriverLicense = ageCondition && hasInsurance && hasMedicalPermission;

        System.out.println("Is the driver's license provided? " + isProvideDriverLicense);
    }
}
