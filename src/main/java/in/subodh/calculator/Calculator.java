package in.subodh.calculator;

public class Calculator {
    private final int operand1;
    private final int operand2;

    public Calculator(int val1, int val2){
        operand1 = val1;
        operand2 = val2;
    }

    public int add(){
        return operand1 + operand2;
    }

    public int subtract(){
        return operand1 - operand2;
    }

    public int multiply(){
        return operand1 * operand2;
    }

    public int division(){
        if(operand2 == 0){
            return 0;
        }
        return operand1 / operand2;
    }
}
