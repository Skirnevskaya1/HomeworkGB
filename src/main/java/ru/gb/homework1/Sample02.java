package ru.gb.homework1;

public class Sample02 {
    /*
    Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    високосный.
     */
    public static void main(String[] args) {

        isLeapYear(2022);
    }

    public static void isLeapYear(int year) {
        System.out.println("Вы ввели год: " + year);
        if (year > 0) {
            if (year < 100 && year % 4 == 0 || year >= 100 && !(year % 100 == 0) && year % 4 == 0 ||
                    year >= 100 && year % 100 == 0 && year % 4 == 0 && year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else System.out.println(year + " год не является високосным");

        } else System.out.println("Пожалуйста, введите год верно!");
    }
}
