package com.classs102.controlstatements;

import javax.sound.midi.Soundbank;

public class forEachExample {
    public static void main(String[] args) {
        int[] marks = new int[5];
        for(int i=0;i<marks.length;i++){
            marks[i] = i+80;
        }

        //for each
        for(int d: marks){
            System.out.println(d);
        }

        String name = "Sai Medha";

        //{'S','a' ,'i','M','e','d','h','a'}
        for(char c : name.toCharArray()){
            System.out.println(c);
        }



    }
}
