package com.classs102.controlstatements;

public class Nested {
    public static void main(String[] args) {
        int a=10,b=4,c=5;

        if(a>b){
            if(a>c){
                System.out.println("A greater");
            }
            else{
                System.out.println("c is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("c is greater...");
            }
        }
    }
}
