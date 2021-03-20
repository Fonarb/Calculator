package com.company.strategy;

public class ArabToRoman {


    public static String romanValueToArabValue(int a){
        String res = "";
        switch (a){

            case 1 : res ="I"; break;
            case 2 : res ="II"; break;
            case 3 : res ="III"; break;
            case 4 : res ="IV"; break;
            case 5 : res ="V"; break;
            case 6 : res ="VI"; break;
            case 7 : res ="VII"; break;
            case 8 : res ="VIII"; break;
            case 9 : res ="IX"; break;
            case 10 : res ="X"; break;
            case 11 : res = "XI"; break;
            case 12 : res = "XII"; break;
            case 13 : res = "XIII"; break;
            case 14 : res ="XIV"; break;
            case 15 : res ="XV"; break;
            case 16 : res ="XVI"; break;
            case 17 : res ="XVIi"; break;
            case 18 : res ="XVIII"; break;
            case 19 : res ="XIX"; break;
            case 20 : res ="XX"; break;
            case 21 : res ="XXI"; break;
            case 22: res ="XXII"; break;
            case 23: res ="XXIII"; break;
            case 24 : res ="XXIV"; break;
            case 25 : res = "XXV"; break;
            case 26 : res = "XXVI"; break;
            case 27 : res = "XXVII"; break;
            case 28 : res ="XXVIII"; break;
            case 29 : res ="XXIX"; break;
            case 30 : res ="XXX"; break;
            case 31 : res ="XXXI"; break;
            case 32 : res ="XXXII"; break;
            case 33 : res ="XXXIII"; break;
            case 34 : res ="XXXIV"; break;
            case 35: res ="XXXIV"; break;
            case 36: res ="XXXVI"; break;
            case 37 : res ="XXXVII"; break;
            case 38 : res ="XXXVIII"; break;
            case 39 : res = "XXXIX"; break;
            case 40 : res = "XL"; break;
            case 41 : res = "XLI"; break;
            case 42 : res ="XLII"; break;
            case 43 : res ="XLIII"; break;
            case 44 : res ="XLIV"; break;
            case 45 : res ="XLV"; break;
            case 46 : res ="XLVI"; break;
            case 47: res ="XLVII"; break;
            case 48 : res ="XLVIII"; break;
            case 49 : res ="XLIX"; break;
            case 50 : res ="L"; break;
            case 51 : res ="LI"; break;
            case 52 : res ="LII"; break;
            case 53 : res ="LIII"; break;
            case 54 : res ="LIV"; break;
            case 55 : res ="LV"; break;
            case 56 : res ="LVI"; break;
            case 57 : res ="LVII"; break;
            case 58 : res ="LVIII"; break;
            case 59 : res ="LIX"; break;
            case 60 : res ="LX"; break;
            case 61 : res = "LXI"; break;
            case 62 : res = "LXII"; break;
            case 63 : res = "LXIII"; break;
            case 64 : res ="LXIV"; break;
            case 65 : res ="LXV"; break;
            case 66 : res ="LXVI"; break;
            case 67 : res ="LXVIII"; break;
            case 68 : res ="LXIX"; break;
            case 69 : res ="LXX"; break;
            case 70 : res ="LXX"; break;
            case 71 : res ="LXXI"; break;
            case 72: res ="LXXII"; break;
            case 73: res ="LXXIII"; break;
            case 74 : res ="LXXIV"; break;
            case 75 : res = "LXXV"; break;
            case 76 : res = "LXXVI"; break;
            case 77 : res = "LXXVII"; break;
            case 78 : res ="LXXVIII"; break;
            case 79 : res ="LXXIX"; break;
            case 80 : res ="LXXX"; break;
            case 81 : res ="LXXXI"; break;
            case 82 : res ="LXXXII"; break;
            case 83 : res ="LXXXIII"; break;
            case 84 : res ="LXXXIV"; break;
            case 85: res ="LXXXV"; break;
            case 86: res ="LXXXVI"; break;
            case 87 : res ="LXXXVII"; break;
            case 88 : res ="LXXXVIII"; break;
            case 89 : res = "LXXXIX"; break;
            case 90 : res = "XC"; break;
            case 91 : res = "XCI"; break;
            case 92 : res ="XCII"; break;
            case 93 : res ="XCIII"; break;
            case 94 : res ="XCIV"; break;
            case 95 : res ="XCV"; break;
            case 96 : res ="XCVI"; break;
            case 97: res ="XCVII"; break;
            case 98 : res ="XCVIII"; break;
            case 99 : res ="XCIX"; break;
            case 100 : res ="C"; break;
            default: throw  new RuntimeException("Результат превзошел ожидания");

        }
        return res;

    }
}
