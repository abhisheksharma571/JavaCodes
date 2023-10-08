package IO;
import java.io.*;
class Cricketer1 implements Serializable {
    private String name;
    transient private int age;    //this will not participate in the serialization
    private int runs;
    public Cricketer1(String name, int age, int runs){
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}
public class transientKeyword {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Cricketer1 c = new Cricketer1("Rohit",36,20000);
//        c.disp();

//        FileOutputStream fos = new FileOutputStream("pw2.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//        oos.writeObject(c);
//        oos.flush();
//        oos.close();

        FileInputStream fis = new FileInputStream("pw2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer1 cr=(Cricketer1) ois.readObject();
        cr.disp();
        ois.close();
    }
}
