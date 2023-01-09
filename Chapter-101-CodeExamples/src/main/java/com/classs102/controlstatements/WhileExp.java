package com.classs102.controlstatements;

public class WhileExp {
    public static void main(String[] args) {
        // initialization expression
        int i = 1;
        // test expression
        while (i < 6) {
            System.out.println("Hello World");

            // update expression
            i++;
        }

        int x = 1, sum = 0;
        int num=10;
        // Exit when x becomes greater than 4
        while (x <= num) {//O(n)
            // summing up x
            sum = sum + x;
            x++;
        }
        System.out.println("Sum of N numbers: " + sum);
        double formula = num*(num+1)/2; //O(1)
        System.out.println(formula);
    }

}
