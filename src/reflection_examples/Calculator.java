package reflection_examples;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Summa " + a + " u " + b + " = " + result);
    }
    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Raznica " + a + " u " + b + " = " + result);
    }
    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Proizvedenie " + a + " u " + b + " = " + result);
    }
    void division(int a, int b) {
        int result = a / b;
        System.out.println("Chasnnoe " + a + " u " + b + " = " + result);
    }
}
class TestCalculator{
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test100.txt"))){
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method [] methods = cl.getDeclaredMethods();
            for (Method myMethod :
                    methods) {
                if (myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }
            method.invoke(calculator, Integer.parseInt(firstArg)
            , Integer.parseInt(secondArg));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
