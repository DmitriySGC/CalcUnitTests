package calc;

public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    public Calculator(int num1, int num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int calculate() {
        int res=0;
        switch (operation) {
            case '+':
                res= num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                try {
                    res=num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка-деление на ноль");
                }
                break;
            default:
                System.out.println("Ошибка");

        }
        return res;
    }
}

