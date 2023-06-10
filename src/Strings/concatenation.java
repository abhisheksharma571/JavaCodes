package Strings;

public class concatenation {
    public static void main(String[] args) {
        String s1 = new String("Pw");
        //new string of "PwSkills" created but s1 refers to old one that is "Pw"
        s1.concat("Skills");
        System.out.println(s1);
        String s4 = "Pw" + "Java" + "Skills"+ 66;
        System.out.println(s4);
        String s5= s1+s4;
        System.out.println(s5);

        String s3 = s1.concat("skills");
        System.out.println(s3);

        //now s2 refers to the new string created
        String s2 = new String("Physics");
        s2=s2.concat("Wallah");
        System.out.println(s2);

    }
}
