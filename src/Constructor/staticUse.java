package Constructor;

import java.util.Scanner;

class Farmer{
    int pa;
    float td;
    static float ri;    //ri is same for all object, it is better to make it static variables, so it takes memory only one time
    float si;
    static {
        ri=4.5f;
    }

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount required: ");
        pa = scan.nextInt();
        System.out.println("Please enter the time duration");
        td = scan.nextFloat();

    }
    void compute(){
        si= (pa*ri*td)/100f;
    }
    void disp(){
        System.out.println("Simple Interest is: "+ si);
    }
}
public class staticUse {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        f1.input();;
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();
    }
}
