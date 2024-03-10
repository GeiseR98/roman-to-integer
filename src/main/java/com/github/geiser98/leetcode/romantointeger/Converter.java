package com.github.geiser98.leetcode.romantointeger;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class Converter {

    public int romanToInt(String s) {
        char[] letterByLetter = s.toCharArray();
        int result = 0;
        for (int i = 0; i < letterByLetter.length; i++) {
            switch (letterByLetter[i]) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if (i != letterByLetter.length - 1) {
                        switch (letterByLetter[i + 1]) {
                            case 'M':
                                result += 900;
                                i += 1;
                                break;
                            case 'D':
                                result += 400;
                                i += 1;
                                break;
                            default:
                                result += 100;
                                break;
                        }
                        break;
                    }
                    result += 100;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    if (i != letterByLetter.length - 1) {
                        switch (letterByLetter[i + 1]) {
                            case 'C':
                                result += 90;
                                i += 1;
                                break;
                            case 'L':
                                result += 40;
                                i += 1;
                                break;
                            default:
                                result += 10;
                        }
                        break;
                    }
                    result += 10;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    if (i != letterByLetter.length - 1) {
                        switch (letterByLetter[i + 1]) {
                            case 'X':
                                result += 9;
                                i += 1;
                                break;
                            case 'V':
                                result += 4;
                                i += 1;
                                break;
                            default:
                                result += 1;
                        }
                        break;
                    }
                    result += 1;
                    break;
            }
        }
        return result;
    }

    public String intToRoman(Integer x) {
        StringBuilder xInRoman = new StringBuilder();
        int power = 1;
        int value;
        StringBuilder valueInRoman = new StringBuilder();
        while (x > 0) {
            value = x % 10;
            x /= 10;
            switch (value) {
                case 1:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("I"); break;
                        case 10: valueInRoman = new StringBuilder("X"); break;
                        case 100: valueInRoman = new StringBuilder("C"); break;
                        case 1000: valueInRoman = new StringBuilder("M"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 2:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("II"); break;
                        case 10: valueInRoman = new StringBuilder("XX"); break;
                        case 100: valueInRoman = new StringBuilder("CC"); break;
                        case 1000: valueInRoman = new StringBuilder("MM"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 3:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("III"); break;
                        case 10: valueInRoman = new StringBuilder("XXX"); break;
                        case 100: valueInRoman = new StringBuilder("CCC"); break;
                        case 1000: valueInRoman = new StringBuilder("MMM"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 4:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("IV"); break;
                        case 10: valueInRoman = new StringBuilder("XL"); break;
                        case 100: valueInRoman = new StringBuilder("CD"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 5:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("V"); break;
                        case 10: valueInRoman = new StringBuilder("L"); break;
                        case 100: valueInRoman = new StringBuilder("D"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 6:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("VI"); break;
                        case 10: valueInRoman = new StringBuilder("LX"); break;
                        case 100: valueInRoman = new StringBuilder("DC"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 7:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("VII"); break;
                        case 10: valueInRoman = new StringBuilder("LXX"); break;
                        case 100: valueInRoman = new StringBuilder("DCC"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 8:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("VIII"); break;
                        case 10: valueInRoman = new StringBuilder("LXXX"); break;
                        case 100: valueInRoman = new StringBuilder("DCCC"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 9:
                    switch (power) {
                        case 1: valueInRoman = new StringBuilder("IX"); break;
                        case 10: valueInRoman = new StringBuilder("XC"); break;
                        case 100: valueInRoman = new StringBuilder("CM"); break;
                    }
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
                case 0:
                    valueInRoman = new StringBuilder("");
                    xInRoman = valueInRoman.append(xInRoman);
                    power *= 10;
                    break;
            }
        }


        return xInRoman.toString();
    }
}