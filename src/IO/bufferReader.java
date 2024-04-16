package IO;
import java.io.*;
public class bufferReader {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJava");
        File file = new File(dir,"test.java.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();            //reads line by line
        while(line!=null){
            System.out.println(line);
            line=br.readLine();     //go to next line to read
        }

    }
}
