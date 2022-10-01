package in.subodh.calculator.test;

import in.subodh.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeClass
    public void setup(){
        calculator = new Calculator(10,5);
    }

    @Test
    public void addTest(){
        Assert.assertEquals(calculator.add(),15);
    }
    @Test
    public void subtractTest(){
        Assert.assertEquals(calculator.subtract(),5);
    }
    @Test
    public void multiplyTest(){
        Assert.assertEquals(calculator.multiply(),50);
    }
    @Test
    public void divideTest(){
        Assert.assertEquals(calculator.division(),2);
    }
}
