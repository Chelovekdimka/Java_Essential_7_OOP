//введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);

package Ex_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введіть дані про працівника " + (i+1) + " :");
            System.out.println("Прізвище та ініціали працівника : ");
            String surnameAndInitials = scanner.nextLine();
            System.out.println("Назва посади : ");
            String jobTitle = scanner.nextLine();
            System.out.println("Рік надходження на роботу : ");
            int yearOfEmployment = scanner.nextInt();
            scanner.nextLine();
            try {
                if (yearOfEmployment < 1900 || yearOfEmployment > 2023) {
                    throw new IllegalArgumentException("Невірно вказан рік прийому на роботу");
                }
            } catch (IllegalArgumentException e) {
                    System.out.println("Помилка : " + e.getMessage());
                i--;
            }
            workers[i] = new Worker(surnameAndInitials, jobTitle, yearOfEmployment);
        }
        Arrays.sort(workers, (w1, w2) -> w1.getSurnameAndInitials().compareTo(w2.getSurnameAndInitials()));
        System.out.println("Введіть стаж роботи : ");
        int experience = scanner.nextInt();
        for (Worker worker : workers) {
            if (worker.getExperience() > experience) {
                System.out.println("Прізвище працівника, стаж роботи якого перевищує введене значення : " + worker.getSurnameAndInitials());
            }

        }

    }
}
