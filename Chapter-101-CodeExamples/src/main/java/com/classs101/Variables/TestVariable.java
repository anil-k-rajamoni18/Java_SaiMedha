package com.classs101.Variables;

public class TestVariable {
    public static void main(String[] args) {
//        type variableName = value;
          char ch = 'A';
          char ch2 = 32; //A

          String name = "Kumar";

          int age = 10;

          float salary = 10.2223f;

          short s = 1023;
          byte bt = 50;

          long l = 1000027979797979L;

          double stockPrice = 10.288937;

          boolean bol = true;
          boolean falbol = false;

          /*
          * by default decimal -- Double
          * by whole number 0-9  --- int
          *
          * declare float : f or F
          * declare long l or L
          *
          * 1 or 0 not same as true or false.
          *
          *  individual $ or _ can be used as Variable Name upto JAVA8
          *
          * LOCAL VARIABLE , stored in STACK and intialization is mandatory.
          * */

        System.out.println(age + " "+ salary + " "+stockPrice +" "+bt +" "+bol);

        System.out.println(ch +" "+ch2);

        //valid
        String student$Name = "Raj";
        int $ = 10;

        float bookPrice=10.22f;
        System.out.println(bookPrice);

        String _ = "Rajamoni";

    }
}
