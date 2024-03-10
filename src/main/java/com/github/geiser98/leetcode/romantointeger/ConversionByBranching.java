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
public class ConversionByBranching {

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
}