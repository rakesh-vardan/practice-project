package com.learn.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("output.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String content = "This is a new line that I want to write to file!";
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
