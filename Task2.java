package org.example;

public class Task2 {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Андрей", "Петров", 3);
        Tester tester2 = new Tester("Александр", "Андреев", 2,"B",6500);
        Tester tester3 = new Tester("Мария", "Александрова");


        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo("Тестировщик:");


        Tester.defaultTester();
    }
}