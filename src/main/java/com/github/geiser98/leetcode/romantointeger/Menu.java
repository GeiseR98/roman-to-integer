package com.github.geiser98.leetcode.romantointeger;

import java.util.Scanner;

public class Menu {
    Converter converter = new Converter();
    public void printMenu() {
        System.out.println("Что вы хотите сделать?" + System.lineSeparator() +
                "1) Конвертировать число из современной записи в арабскую." + System.lineSeparator() +
                "2) Конвертировать число из римской записи в современную." + System.lineSeparator() +
                "3) выход");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Введите число от 1 до 3999");
                int valueInt = scanner.nextInt();
                if (valueInt <= 0 || valueInt > 3999) {
                    System.out.println("Введенное число не соответствует условиям.");
                }
                System.out.println(converter.intToRoman(valueInt));
                break;
            case 2:
                System.out.println("Введите число от 'I' до 'MMMCMXCIX'");
                String valueRoman = scanner.next();
                checkValueRoman(valueRoman);
                System.out.println(converter.romanToInt(valueRoman));
                break;
            case 3:
                System.exit(1);
        }
    }

    private boolean checkValueRoman (String value) {
        char[] chars = value.toCharArray();
        for (char charValue : chars) {
            if (charValue != 'C'
            || charValue != 'M'
            || charValue != 'D'
            || charValue != 'L'
            || charValue != 'X'
            || charValue != 'I'
            || charValue != 'V') {
                System.out.println("Неизвестный символ");
                return false;
            }
        }
        return true;
    }
}
