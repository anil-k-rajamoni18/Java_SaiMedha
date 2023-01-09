package com.classs102.controlstatements;

import java.util.Scanner;

public class LoopingStatements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/*
        for(int i=1;i<100;i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }*/

        String msg="";
        while(msg !=null){
            System.out.println("enter msg: ");
            msg = s.nextLine();
            if(msg.equals("exit")){
                break;
            }
            System.out.println(msg);
        }
    }
}
