package com.lambton;

import java.sql.SQLOutput;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=100;
        int b=10;
        int c;

        int x[]={1,2,3};
        System.out.println("START");
try {

    c = a / b;
    System.out.println("c:"+c);
    x[4]=1000;
    }
catch (ArithmeticException ae)
    {
    System.out.println("Value of b=0");
    }
catch (ArrayIndexOutOfBoundsException e)
    {
    System.out.println("Array Exception");
    }

catch (Exception e)
    {
    System.out.println(e.getMessage());
    }


        System.out.println("END");
    }
}
