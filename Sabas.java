// static keyword in java The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class rather than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.

class zz{
    String name;
    static String school;
    public static void chnagename(){
        System.out.println("RR");
    }
}

public class Sabas {
    public static void main(String[] args) {
        zz.school = "javm";
        System.out.println(zz.school);
        zz a = new zz();
        a.name = "kano";
        System.out.println(a.name);
        a.chnagename();
    }
    
}
