package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possiblediv(4);
        possiblediv(0);
        possiblediv(-5);

    }

    public static void possiblediv(int number) {
        boolean result = number < 0;
        if (result) {
            System.out.println("This is negative numbers");
        }
    }
}
