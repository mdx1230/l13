package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;


    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }


    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Неизвестен", 2000);
    }


    public Tester(String name, String surname) {
        this(name, surname,0);
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(boolean showSalary) {
        printInfo();
        if (showSalary) {
            System.out.println("Зарплата: " + salary);
        }
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + " " + name + " " + surname);
    }

    public static void defaultTester() {
        System.out.println("Евгений Евгеньев, 5 лет опыта, уровень английского C,зарплата 6000.");
    }
}
