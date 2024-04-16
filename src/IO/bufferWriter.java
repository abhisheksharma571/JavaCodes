package IO;
import java.io.*;
public class bufferWriter {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJava");
        File file = new File(dir,"test.java.txt");

        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello");
        bw.newLine();
        bw.write(66);
        bw.newLine();
        char ch[] = {'a','b','h','i'};
        bw.write(ch);

        bw.flush();
        bw.close();

    }
}
