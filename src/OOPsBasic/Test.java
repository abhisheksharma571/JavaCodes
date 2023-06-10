package OOPsBasic;

class Test {
    int a;
    String name;

    public static void main(String[] args) {
        int num=3;
        Test obj1 = new Test();
        Test obj2 = new Test();

        obj1.name = "Abhishek";

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);


    }
}
