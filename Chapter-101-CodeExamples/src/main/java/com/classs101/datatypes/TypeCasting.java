package com.classs101.datatypes;

public class TypeCasting {
    public static void main(String[] args) {
        float f = 10.5f;
        int i = (int) f;

        System.out.println(i);


        //case 2

        int a = 100;
        float b = a;
        System.out.println(b);

        int numbers = 102009;

        String convertedNum = String.valueOf(numbers); //int , float , double -- string
        System.out.println(convertedNum);
        /*int count =0;
        for(int j=0;j<convertedNum.length();j++){
            if (convertedNum.charAt(j) == '0'){
                count+=1;
            }

        }*/
        System.out.println(convertedNum.indexOf("0"));

    }
}
