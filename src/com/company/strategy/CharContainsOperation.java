package com.company.strategy;

public class CharContainsOperation {
  public static final  String op = "+-/*";
    public static String containsOperaionsString (String str) {
        String c = " ";

        for (int i = 0; i < str.length(); i++) {
            if (op.contains(String.valueOf(str.charAt(i)))) {
               char ch = str.charAt(i);
               c = Character.toString(ch);
            }
        }
            return c;
    }

    public static void main(String[] args) {
        String ha = "VI + V";

        String res = containsOperaionsString(ha);
        System.out.println(res);

    }

}