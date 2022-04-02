package ru.gb.homework3;

import java.util.Scanner;

public class Sample01 {

    /*
    Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
    попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
    указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
    выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner in = new Scanner(System.in); // считывает данные, которые введут с консоли

        int a, n = (int) (Math.random() * 10); // генерация случайных чисел от 0 до 9
        System.out.println("Компьютер загадал число от 0 до 9, угадайте это число с 3 попыток");
        for (int i = 0; i < 3; i++) { // цикл на три попытки с определенными условиями ниже
            System.out.println("Попытка " + (i + 1) + ": ");
            a = in.nextInt();
            if (a < n) {
                System.out.println("Введите число больше!");
            }
            if (a > n) {
                System.out.println("Введите число меньше!");
            }
            if (a == n) {
                System.out.println("Поздравляем! Вы угадали число!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                a = in.nextInt();
                if (a == 1) {
                    game();
                } else {
                    System.out.println("Спасибо за игру!");
                    break;
                }
            }
        }
        System.out.println("К сожалению, вы не угадали.");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        a = in.nextInt();
        if (a == 1) {
            game();
        } else {
            System.out.println("Спасибо за игру!");
        }
    }
}