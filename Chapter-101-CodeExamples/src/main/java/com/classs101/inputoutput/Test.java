package com.classs101.inputoutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);



        System.out.println("Enter the score and winner name price money ::");

        int messiScore = obj.nextInt();
        obj.nextLine();
        String winner_name = obj.nextLine();
        float priceMoney = obj.nextFloat();



        System.out.print(messiScore);
        System.out.println(winner_name);
        System.out.printf("price money %f ",priceMoney);
        System.out.println(messiScore+priceMoney);
        System.out.println(messiScore+" "+priceMoney);
        System.out.println(" "+messiScore+2);




    }
}
