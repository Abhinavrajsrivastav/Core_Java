package IO_Packages;

import java.io.IOException;
import java.io.*;
public class file {
    public static void main(String[] args) throws IOException{
        // Create a new File object representing a file named "example.txt"
        File file = new File("example.txt");

                //Check if file exists
                System.out.println("Is file exist: ? " + file.exists());
                System.out.println("File created successfully.");
                //Get file name
                System.out.println("File name: " + file.getName());
                //Get absolute path
                System.out.println("File path: " + file.getAbsolutePath());
                //is it a file 
                System.out.println("Is it a file? " + file.isFile());
                //is it a directory
    }
}

