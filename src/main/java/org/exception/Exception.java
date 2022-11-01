package org.exception;

public class Exception {
    public static void main(String[] args) {
        float number1 =4;
        float number2 = 0;

        System.out.println(doDivision(number1,number2));
    }
    public static Float doDivision(float num1, float num2)throws ArithmeticException {
        if (num2 == 0) throw new ArithmeticException("Can't be  divided by Zero");
        return (float) num1 / num2; // cast x to float so a float will result




    }
    //divide
    public float divide(int x, int y) throws ArithmeticException{
        if (y == 0) throw new ArithmeticException("invalid_division");
        return (float)x / y; // cast x to float so a float will result

        /*
             float result = 0;
        try {
            //code that may raise exception
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println ("Can't be  divided by Zero" + e);
        }
        return result;
        *
        */
    }


}