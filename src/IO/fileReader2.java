package IO;
//reading data from file
import java.io.*;

public class fileReader2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJava");
        File file = new File(dir, "test.txt");

        FileReader fd = new FileReader(file);

        char ch[] = new char[(int) file.length()];   //down-casting, because it returns long and I need
        fd.read(ch);
        //no need to call read method again and again
        for(char data:ch){
            System.out.print(data);
        }
    }
}