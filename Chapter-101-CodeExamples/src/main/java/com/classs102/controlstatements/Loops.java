package com.classs102.controlstatements;

import java.util.Scanner;

public class Loops implements A {
    public static void main(String[] args) {

        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();
        int factors = 0;
        for(int i=1;i<=num;i++){//O(n)
            if(num%i == 0){
                factors+=1;
            }
        }
        if(factors==2){
            System.out.println(num +"is a prime");
        }
        else{
            System.out.println(num+ "is not a prime");
        }
    }

    @Override
    public boolean isPrime() {
        return false;
    }
}
