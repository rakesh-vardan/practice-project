package com.learn.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        // Specify the file path (change this to an existing file on your system)
        String filePath = "input.txt";

        // Creating a File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");

            // Displaying file properties
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");

            // Checking if it's a directory or a file
            if (file.isDirectory()) {
                System.out.println("It's a directory.");
            } else {
                System.out.println("It's a file.");
            }
        } else {
            System.out.println("File does not exist.");
        }

        // Creating a new directory
        File newDirectory = new File("file_dir");
        if (!newDirectory.exists()) {
            if (newDirectory.mkdir()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
            }
        }

        // Creating a new file
        File newFile = new File("new_file.txt");
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

        // Deleting the new file
        if (newFile.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete file.");
        }

        // Deleting the new directory
        if (newDirectory.delete()) {
            System.out.println("Directory deleted successfully.");
        } else {
            System.out.println("Failed to delete directory.");
        }
    }
}

