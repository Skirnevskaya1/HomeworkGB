package ru.gb.homework1;

public class Sample01 {

    // Объявление метода main();
    public static void main(String[] args) {

        //Создание переменных типов: byte, short, int, long, float, double, char, boolean;
        byte a = 126;
        short b = 1000;
        int c = 999;
        long d = 2;
        float e = 2.1f;
        double f = 9.99;
        char g = 'r';
        boolean h = true;

        // Вывод на экран методов
        System.out.println(calculate(1.1f, 2.2f, 3.3f, 4.4f));
        System.out.println(task10and20(10, 5));
        System.out.println(isNegative(0));

        // Вызов методов
        isPositiveOrNegative(-2);
        greetings("Станислав");

    }

    /**
     * @param a число с плавающей точкой
     * @param b число с плавающей точкой
     * @param c число с плавающей точкой
     * @param d число с плавающей точкой
     * @return возвращает результат
     */

    public static float calculate(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        System.out.print(a + " * ( " + b + " + ( " + c + " / " + d + " )) = ");
        return result;
    }

    /**
     * @param x1 целое число
     * @param x2 целое число
     * @return сумму чисел, которая лежит в пределах от 10 до 20 (включительно)
     * если да – вернуть true, в противном случае – false
     */
    public static boolean task10and20(int x1, int x2) {
        int y = x1 + x2;
        System.out.println("(" + x1 + " + " + x2 + ") = " + y);
        if (y >= 10 && y <= 20) {
            System.out.print("Число " + y + " лежит в пределах от 10 до 20, поэтому возвращает ");
            return true;
        } else
            System.out.print("Число " + y + " НЕ лежит в пределах от 10 до 20, поэтому возвращает ");
        return false;
    }

    /*
    Метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное
     */
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " является положительным");
        } else {
            System.out.println("Число " + x + " является отрицательным");
        }
    }

    /**
     * @param x целое число
     * @return везвращает true, если число отрицательное, и везвращает false если положительное
     */

    public static boolean isNegative(int x) {
        if (x < 0) {
            System.out.print("Число " + x + " является отрицательным, поэтому возвращает ");
            return true;
        } else System.out.print("Число " + x + " является положительным, поэтому возвращает ");
        return false;

    }

    // Метод выводит в консоль сообщение «Привет, указанное_имя!».
    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

}
