package IO;
//writing data in file
import java.io.*;
public class fileWriter {
    public static void main(String[] args) throws IOException{
        File dir = new File("PWJava");

        File file = new File(dir,"test.java.txt");
//        file.createNewFile();

        //writing data(overriding nature)
//        FileWriter fw = new FileWriter(file);

        //writing data(not overriding)
        FileWriter fw = new FileWriter(file,true);

        fw.write("PWskills");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] = {'j','a','v','a'};
        fw.write(ch);
        fw.write("\n");

        fw.close();     //you have to close, otherwise file waits for another data
//        fw.flush();     //you can also ues flush method in place of close, but it is better to use close method

        System.out.println("open test.java.txt to see result");
    }
}
