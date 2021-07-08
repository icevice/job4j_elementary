package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        do {
            amount = amount + amount * percent / 100;
            amount -= salary;
            year++;
        } while (amount > 0);
        return year;
    }
}