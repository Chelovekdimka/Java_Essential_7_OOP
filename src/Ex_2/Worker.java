//Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
//
//         прізвище та ініціали працівника;
//
//         назва посади;
//
//         рік надходження на роботу.
//
//        Написати програму, яка виконує такі дії:
//
//         введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
//
//         якщо значення року введено не у відповідному форматі, видає виняток.
//
//         виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.

package Ex_2;

import java.util.Date;

public class Worker {
    private String surnameAndInitials;
    private String jobTitle;
    private int yearOfEmployment;

    public Worker(String surnameAndInitials, String jobTitle, int yearOfEmployment) {
        this.surnameAndInitials = surnameAndInitials;
        this.jobTitle = jobTitle;
        this.yearOfEmployment = yearOfEmployment;
    }
    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public int getExperience() {
        return 2023 - yearOfEmployment;
    }


}
