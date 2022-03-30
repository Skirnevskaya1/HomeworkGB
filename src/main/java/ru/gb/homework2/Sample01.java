package ru.gb.homework2;

import java.util.Arrays;

public class Sample01 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1};
        int[] arr1 = new int[8];
        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arr3 = new int[4][4];
        int[] arr4 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        checkArray(arr);
        fillArray(arr1);
        changeArray(arr2);
        fillDiagonal(arr3);
        searchMinMax(arr4);
    }

    // Замена в массиве 0 на 1, 1 на 0;

    public static void checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

    // Заполнение масива значениями 0 3 6 9 12 15 18 21;
    public static void fillArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int arr1[] = {0, 3, 6, 9, 12, 15, 18, 21};
            arr[i] = arr1[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

    /*
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    умножить на 2;
     */

    public static void changeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");

    }

    /*
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */

    public static void fillDiagonal(int arr[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][i] = 1;
                arr[i][4 - i - 1] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

    /*
    Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
помощи интернета);
     */
    public static void searchMinMax(int arr[]) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        System.out.print("Максимальный элемент массива - " + max + "\n" +
                "Минимальный элемент массива - " + min + "\n");
        System.out.println("--------------------------------");
    }

}