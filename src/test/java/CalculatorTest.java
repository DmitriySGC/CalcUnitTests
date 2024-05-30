import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void operationAdd(){
        Calculator calculator = new Calculator(2,3,'+');
        int res = calculator.calculate();
        Assert.assertEquals("Операция сложения выполняется некорректно",5,res);
    }

    @Test
    public void operationSubstract(){
        Calculator calculator = new Calculator(12,3,'-');
        int res = calculator.calculate();
        Assert.assertEquals("Операция вычитание выполняется некорректно",9,res);
    }
    @Test
    public void operationMultiply(){
        Calculator calculator = new Calculator(10,2,'*');
        int res = calculator.calculate();
        Assert.assertEquals("Операция умножения выполняется некорректно",20,res);
    }

    @Test
    public void operationDevide(){
        Calculator calculator = new Calculator(9,3,'/');
        int res = calculator.calculate();
        Assert.assertEquals("Операция деления выполняется некорректно",3,res);
    }
    @Test
    public void operationDevidebyZero(){
        Calculator calculator = new Calculator(9,0,'/');
        int res = calculator.calculate();
        Assert.assertEquals("Операция деления выполняется некорректно", 0,res);
    }


}
