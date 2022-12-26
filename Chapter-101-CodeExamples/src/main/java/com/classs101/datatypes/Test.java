package com.classs101.datatypes;

public class Test {
    public static void main(String[] args) {
        byte myNum = 13;
        System.out.println(myNum);

        short myNum2 = 5000;
        System.out.println(myNum2);

        int myNum3 = 100000;
        System.out.println(myNum3);

        long myNum4 = 15000000000L;
        System.out.println(myNum4);

        float myNum5 = 5.75f;
        System.out.println(myNum);

        double myNum6 = 19.99d;
        System.out.println(myNum6);

        float f1 = 35e3f;
        double d1 = 12E4d; //e" to indicate the power of 10:
        System.out.println(f1);
        System.out.println(d1);

        boolean isStudent = true;
        boolean isPrime = false;
        System.out.println(isStudent);     // Outputs true
        System.out.println(isPrime);

//Java has a boolean data type, which can only take the values true or false:

//chars

        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

//STRINGS

        String greeting = "Hello World";
        System.out.println(greeting);
    }
}
