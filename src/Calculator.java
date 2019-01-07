public class Calculator {
    public static float calculate(Float firstOperant, Float secondOperator, String operator) throws IllegalArgumentException{
        switch (operator){
            case "-":
                return firstOperant - secondOperator;
            case "*":
                return firstOperant * secondOperator;
            case "+":
                return firstOperant + secondOperator;
            case "/":
                return firstOperant / secondOperator;
        }
        return 0;
    }
}
