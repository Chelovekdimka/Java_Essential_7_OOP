//Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator.
//        У тілі класу створіть чотири методи для арифметичних дій: (add – додавання,
//        sub – віднімання, mul – множення, div – поділ). Метод поділу повинен перевірити поділ на нуль,
//        якщо перевірка не проходить, з
//        генерувати виняток. Користувач вводить значення, над якими хоче зробити операцію та вибрати саму операцію.
//        У разі виникнення помилок повинні викидатися винятки.

package Ex_5;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    public double add(double a, double b) {
        return a+b;
    }
    public double sub(double a, double b) {
        return a-b;
    }
    public double mul(double a, double b) {
        return a*b;
    }
    public double div (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе!");
        }
        return (double) a / b;
    }
    public void performOperation() {
        System.out.println("Введіть а :");
        int a = scanner.nextInt();

        System.out.println("Введіть b :");
        int b = scanner.nextInt();

        System.out.println("Зробіть вибір операції (+, -, *, /):");
        String operation = scanner.next();

        try {
            switch (operation) {
                case "+":
                    System.out.println(add(a, b));
                    break;
                case "-":
                    System.out.println(sub(a, b));
                    break;
                case "*":
                    System.out.println(mul(a, b));
                    break;
                case "/":
                    System.out.println(div(a, b));
                    break;
                default:
                    throw new IllegalArgumentException("Введено невірний знак операції!");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.performOperation();
    }
}
