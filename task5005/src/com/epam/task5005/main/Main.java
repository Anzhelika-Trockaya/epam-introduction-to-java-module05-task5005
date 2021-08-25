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

import com.epam.task5005.giftBuilder.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu = """
                If you want construct a gift for ...
                man - enter m
                woman - enter w
                kid - enter k
                
                To exit - enter x
                Enter here: """;
        String line = "-----------------------------------------------------------------------------------------------";
        Scanner scanner = new Scanner(System.in);
        GiftConstructor constructor = new GiftConstructor();
        String input;
        while (true) {
            System.out.print(menu);
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                System.exit(0);
            }

            try {
                constructor.setGiftBuilder(input);
                constructor.constructGift();
                Gift gift = constructor.getGift();

                System.out.println(gift);
            } catch (IllegalArgumentException exception) {
                System.out.println("Gift not created! " + exception.getMessage());
            }
            System.out.println(line+"\n");
        }
    }
}