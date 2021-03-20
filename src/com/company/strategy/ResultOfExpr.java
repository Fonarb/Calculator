package com.company.strategy;

public class ResultOfExpr {
    MultiplicationOperation multiplicationStrategy = new MultiplicationOperation();
    DivisionOperation divisionStrategy = new DivisionOperation();
    AdditionOperation additionStrategy = new AdditionOperation();
    SubtractionOperation subtractionStrategy = new SubtractionOperation();


    public int result (String[] charArray){

        int result = 0;
        switch (charArray[1]){

            case "+" :  result = additionStrategy.result(Integer.parseInt(charArray[0]), Integer.parseInt(charArray[2]));
                break;
            case "-" : result = subtractionStrategy.result(Integer.parseInt(charArray[0]), Integer.parseInt(charArray[2]));
                break;
            case "*" : result = multiplicationStrategy.result(Integer.parseInt(charArray[0]), Integer.parseInt(charArray[2]));
                break;
            case "/" : result = divisionStrategy.result(Integer.parseInt(charArray[0]), Integer.parseInt(charArray[2]));
                break;
            default: throw new IllegalArgumentException("Неверный знак операции");
        }
        return result;
    }
    public int result (int a, int b, String[] c){

        int result = 0;
        switch (c[1]){

            case "+" :  result = additionStrategy.result(a,b);
                break;
            case "-" : result = subtractionStrategy.result(a,b);
                break;
            case "*" : result = multiplicationStrategy.result(a,b);
                break;
            case "/" : result = divisionStrategy.result(a,b);
                break;
            default: throw new IllegalArgumentException("Неверный знак операции");
        }
        return result;
    }
}
