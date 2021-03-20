package com.company.strategy;

public class TestForNumeric {
  static final  String arab = "0123456789";
    static final String roman = "IVX";

    public static boolean equalsArab(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (arab.contains(String.valueOf(str.charAt(i)))) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
    public static boolean equalsRoman(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (roman.contains(String.valueOf(str.charAt(i)))) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
          public static  boolean mistakeNumeric(String str){
        boolean flag = false;
        if(equalsArab(str) && equalsRoman(str)){
            return flag = true;
        }
        return flag;
            }

}
