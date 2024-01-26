package org.example;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("students.txt", true)); // создание объекта класса PrintWriter и передача пути к файлу
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // создание объекта класса BufferReader и передача потока
        Scanner sc = new Scanner(System.in); // создание объекта класса Scanner и передача стандартного потока ввода
        System.out.print("\tДобро пожаловать!\nЗаполните анкету:\n\nФИО: "); // говорим пользователю, что вводить
        String name = br.readLine(); // с помощью бафер присваиваем вводимую строку переменной name
        System.out.print("Пол: ");
        String sex = br.readLine();
        System.out.print("Возраст: ");
        int age = 0;
        try {
            age = sc.nextInt(); // c помощью сканер присваиваем переменной age вводимое целое число
        } catch (InputMismatchException e) {
            System.out.println("Возраст должен состоять только из цифр.");
        }
        System.out.print("");
        System.out.print("Средний балл: ");
        sc.nextLine();
        Double grade = 4.6;
        try {
            grade = sc.nextDouble(); // то же самое, но тип данных - double
        } catch (InputMismatchException e) {
            System.out.println("Средний балл должен состоять только из цифр и запятой.");
        }

        pw.println(name +": " + sex + ", " + age +" лет, средний балл " + grade); // записываем переменные в файл
        pw.close(); // закрываем файл

    }
}