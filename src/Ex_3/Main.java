//Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
//
//         назву товару;
//
//         назву магазину, в якому продається товар;
//
//         вартість товару у гривнях.
//
//        Написати програму, яка виконує такі дії:
//
//         введення з клавіатури даних до масиву, що складається з двох елементів типу Price
//        (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
//
//         виведення на екран інформації про товари, що продаються в магазині,
//        назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).

package Ex_3;

import Ex_2.Worker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Введіть назву товару : ");
            String productName = scanner.nextLine();
            System.out.println("Введіть назву магазину, в якому продається товар на англ мові : ");
            String nameOfShop = scanner.nextLine();
            System.out.println("Введіть вартість товару у гривнях : ");
            double priceInUAH = scanner.nextDouble();
            scanner.nextLine();
            prices[i] = new Price(productName, nameOfShop, priceInUAH);
        }

        Arrays.sort(prices, (p1, p2) -> p1.getNameOfShop().compareTo(p2.getNameOfShop()));
        System.out.println("Введіть назву магазину, інформацію по якому бажаєте знайти (на англ мові) : ");
        String shopToSearch = scanner.nextLine();
        boolean found = false;
        for (Price price : prices) {
            if (price.getNameOfShop().equalsIgnoreCase(shopToSearch)) {
                System.out.println("У обраному магазині є в наявності: " + price.getProductName() + " , за ціною : " + price.getPriceInUAH());
                found = true;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Store not found");
        }


    }
}