package com.classs102.controlstatements;

public class NestedLoops {
    public static void main(String[] args) {

//        for(int i=65;i<70;i++){
//            for(int j=65;j<i+1;j++){
//                System.out.print((char)j);
//            }
//            System.out.println();
//        }
//
//        for(int k=0;k<5;k++){
//            for(;;){
//                System.out.println("inner loop");
//            }
//        }
/*
        int marks[][] = {{10,20},{30,40},{60,80}};
        int i = 0 ;

        while(i<3){
            int j=0;
            while(j<2){
                System.out.print(marks[i][j]+" ");
                ++j;
            }
            System.out.println();//new line.
            i++;
        }*/
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j+=2){
                for(int k=0;k<j*j;k+=3){
                    System.out.println(i+" "+j+" "+k);
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
