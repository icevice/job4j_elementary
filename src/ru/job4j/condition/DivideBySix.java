package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 == 0) {
            if (number % 3 != 0) {
                rsl = "Исходное число не делится на 3, но является четным.";
            } else {
                rsl = "Исходное число делится на 6.";
            }
        } else {
            if (number % 3 != 0) {
                rsl = "Исходное число не делится на 3 и не является четным.";
            } else {
                rsl = "Исходное число делится на 3, но не является четным.";
            }
        }
        return rsl;
    }
}