package IO;
import java.io.*;
public class printWriter {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJava");
        File file = new File(dir,"test.java.txt");

        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);   //accept ASCII character
        pw.write("\n");

        pw.println("JAVA");
        pw.println(100);     //accept 100 as integer
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();
    }
}
