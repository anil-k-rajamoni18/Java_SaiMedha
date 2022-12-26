package com.classs101.Variables;

public class StaticVariable {
     int count;
    StaticVariable(){
        count++;
    }
    public static void main(String[] args) {
        StaticVariable b = new StaticVariable();

        System.out.println(b.count);


        for(int i=0;i<10;i++){
            StaticVariable a = new StaticVariable();
        }

        System.out.println(b.count);
    }
}
