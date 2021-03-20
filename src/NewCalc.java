import com.company.strategy.ResultOfExpr;

import java.util.Scanner;
import static com.company.strategy.ArabToRoman.*;
import static com.company.strategy.RomanToArab.num1IntegerFromRoman;
import static com.company.strategy.RomanToArab.num2IntegerFromRoman;
import static com.company.strategy.TestForNumeric.equalsArab;
import static com.company.strategy.TestForNumeric.equalsRoman;
import static com.company.strategy.TestForNumeric.mistakeNumeric;

public class NewCalc  {
            String[] arr;
    public static void main(String[] args) {
        ResultOfExpr resultOfExpr = new ResultOfExpr();
        NewCalc calc = new NewCalc();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if(mistakeNumeric(string)) throw new RuntimeException("Разный формат чисел");
        if(equalsArab(string)){
            calc.arr = string.split(" ");
            System.out.println(resultOfExpr.result(calc.arr));
        }else if(equalsRoman(string)){
            String replace = string.replaceAll(" ","");
            String [] tempArr = replace.split("");
            calc.arr = replace.split("[+-/*]");

            int a = num1IntegerFromRoman(calc.arr);
            int b = num2IntegerFromRoman(calc.arr);
            int ress =(resultOfExpr.result(a,b, tempArr));
            System.out.println(romanValueToArabValue(ress));
        }
    }
}
