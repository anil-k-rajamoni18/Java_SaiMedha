package com.classs101.Variables;

public class TypesOfVariables {

    String name; // instance or object variables.
    int intvar;
    float floatvar;
    char charvar;
    public TypesOfVariables(){ // Constructor
        this.name ="Swiggy";
        this.floatvar = 190202.389f;
        this.charvar = 'A';
    }
    public static void main(String[] args) {

        //local variables -- STACK
        int age;
        float salary;
        age = 16;
        salary = 10.29093f;
        System.out.println(age);
        System.out.println(salary);

        TypesOfVariables a = new TypesOfVariables();

        TypesOfVariables b = new TypesOfVariables();

        System.out.println(a.name);
        System.out.println(a.floatvar);
        System.out.println(a.charvar);
        System.out.println(a.intvar);

    }
}
