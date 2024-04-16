package IO;
//reading data from file
import java.io.*;

public class fileReader {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJava");
        File file = new File(dir,"test.java.txt");

        FileReader fd = new FileReader(file);

        int i = fd.read();
//        System.out.println((char)i);     //print only one character

        while(i!=-1){    //-1 indicates end of the file
            System.out.print(i+"---->");   //ASCII value
            System.out.println((char)i);       //print all data at once
            i = fd.read();
        }
    }
}

