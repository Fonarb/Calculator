package com.company.strategy;

import java.util.Scanner;

public class RomanToArab {

    public static int num1IntegerFromRoman(String[] arr){
            int num1 = 0;
            switch (arr[0]) {
                case "I":
                    num1 =1;
                    break;
                case "II":
                    num1 = 2;
                    break;
                case "III":
                    num1 = 3;
                case "IV":
                    num1 = 4;
                    break;
                case "V":
                    num1 = 5;
                    break;
                case "VI":
                    num1 = 6;
                    break;
                case "VII":
                    num1 = 7;
                    break;
                case "VIII":
                    num1 =8;
                    break;
                case "IX":
                    num1 =9;
                    break;
                case "X":
                    num1 = 10;
                    break;
                default: throw new RuntimeException("Некорректное значение");

            }
            return num1;
        }
    public static int num2IntegerFromRoman(String[] arr){
        int num2 = 0;
        switch (arr[1]) {
            case "I":
                num2 =1;
                break;
            case "II":
                num2 = 2;
                break;
            case "III":
                num2 = 3;
            case "IV":
                num2 = 4;
                break;
            case "V":
                num2 = 5;
                break;
            case "VI":
                num2 = 6;
                break;
            case "VII":
                num2 = 7;
                break;
            case "VIII":
                num2 =8;
                break;
            case "IX":
                num2 =9;
                break;
            case "X":
                num2 = 10;
                break;
            default: throw new RuntimeException("Некорректное значение");

        }
        return num2;
    }
}
