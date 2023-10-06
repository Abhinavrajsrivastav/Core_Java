package IO_Packages;

import java.io.IOException;
import java.io.*;
public class file {
    public static void main(String[] args) throws IOException{

        //creating a dir object...
        File dir = new File("Hello!");

        //making a new directory
        dir.mkdir();

        //creating a new File object inside dir directory...
        File file1 = new File(dir, "file1.txt");

        //creating a new file...
        file1.createNewFile();

        //creating an object of FileWriter class and passing file1 as object...
        FileWriter fw = new FileWriter(file1, true); 

        //writing in the file...
        fw.write("Hello World\n");
        fw.write("This is a file1\n");

        //flushing the file... flushing means to clear the file...
        fw.flush();

        //closing the file... closing means to close the file...
        fw.close();
    }
}

