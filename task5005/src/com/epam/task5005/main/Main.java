package com.epam.task5005.main;

//Задача 5.
//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Корректно спроектируйте и реализуйте предметную область задачи.
//• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
//проектирования.
//• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//• для проверки корректности переданных данных можно применить регулярные выражения.
//• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
//подарок). Составляющими целого подарка являются сладости и упаковка.

import com.epam.task5005.*;
import com.epam.task5005.giftBuilder.FemaleGiftBuilder;
import com.epam.task5005.giftBuilder.GiftBuilder;
import com.epam.task5005.giftBuilder.KidsGiftBuilder;
import com.epam.task5005.giftBuilder.MaleGiftBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu = """
                If you want construct a gift for ...
                man - press m
                woman - press w
                kid - press k
                To exit - press x
                """;
        String line = "-----------------------------------------------------------------------------------------------";
        Scanner scanner = new Scanner(System.in);
        GiftConstructor constructor = new GiftConstructor();
        String input;
        while (true) {
            System.out.print(menu);
            input = scanner.nextLine();
            GiftBuilder giftBuilder = null;
            switch (input) {
                case "m" -> giftBuilder = new MaleGiftBuilder();
                case "w" -> giftBuilder = new FemaleGiftBuilder();
                case "k" -> giftBuilder = new KidsGiftBuilder();
                case "x" -> System.exit(0);
                default -> {
                    System.out.println("Incorrect input!");
                    System.out.println(line);
                    continue;
                }
            }
            constructor.setGiftBuilder(giftBuilder);
            constructor.constructGift();
            System.out.println(constructor.getGift());
            System.out.println(line);
        }
    }
}
