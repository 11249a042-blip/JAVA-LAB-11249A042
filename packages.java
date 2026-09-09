import mypackage.Calculator;

public class MainPackageDemo 
{
    public static void main(String args[])
    {
        Calculator calc = new Calculator();
        calc.add(15, 25);
    }
}
package mypackage;
public class Calculator {
    public void add(int a, int b) 
    {
        System.out.println("Sum: " + (a + b));
    }
}
