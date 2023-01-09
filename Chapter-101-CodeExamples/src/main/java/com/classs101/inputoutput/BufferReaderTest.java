package com.classs101.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String name = bf.readLine();
        int age = Integer.parseInt(bf.readLine()); //string - int

        float salary = Float.parseFloat(bf.readLine());

        System.out.println(name + " "+age+" "+salary);

    }
}
