package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello2(String name, int age) {
        System.out.println("Hello, " + name + age);
    }

    public static void hello3(int age) {
        System.out.println("Hello, " + age);
    }

    public static void hello4(String name,String name2,String name3) {
        System.out.println("Hello, " + name + name2 + name3);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev\n";
        String name2 = "Begun Alexandr\n";
        String name3 = "Ivanov alex\n";
        int age = 33;

        ArgMethod.hello(name);

        ArgMethod.hello2(name, age);

        ArgMethod.hello3(age);

        ArgMethod.hello4(name, name2, name3);
    }
}