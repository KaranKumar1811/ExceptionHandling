package com.lambton;



public class ExceptionHandling {
    public static void main(String[] args) {
        int a=100;
        int b=5;
        int c;
        String names="Hello";
        int x[]={1,2,3};
        System.out.println("START");

        Student s=new Student();
try {

    c = a / b;
    System.out.println("c:"+c);
    x[2]=1000;
    try{
       if(b!=10) {
           throw new ArithmeticException("Dont divide by 10");
       }
    }
    catch (ArithmeticException ae)
    {
        System.out.println(ae.toString());
        // System.out.println("Value of b=0");
    }
     try {
         if (names.length() < 10) {
             throw new NamelengthException("Name must Have length >=10 char");
         }
     }
     catch (NamelengthException nam)
     {
         System.out.println(nam.toString());
     }
    }



catch (ArrayIndexOutOfBoundsException e)
    {
    System.out.println("Array Exception");
    }

/*catch (Exception e)
    {
    System.out.println(e.getMessage());
    }*/

        System.out.println("END");

     s=null;
     System.gc();
    }




}
