// basic class and object in java 

class pen {
    String color;
    String Type;


    public static void write() {
        System.out.println("jay shree ram");
    }

    public  void Printcolor(){
        System.out.println(this.color);
    }

}

class Student {
    String name;
    String age;

    public void information(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // In constaractor name is same as class name 
    // type :- parameterize cunstrocator and nonparameterized constrocatar
    // constor by defult called 

    Student(){
        System.out.println("Consteractor is called...");
    }
}
public class oops {
    public static void main(String[] args) {
        
        pen p1 = new pen();
        p1.write();
        p1.color = "Blue";
        p1.Type = "Bolepen";
        
        pen p2 = new pen();
        p2.color = "black";
        p2.Type = "jelpen";

        p1.Printcolor();
        p2.Printcolor();

        Student s1 = new Student();
        s1.name = "umang";
        s1.age = "15";
        
        Student s2 = new Student();
        s2.name = "swati";
        s2.age = "17";

        s1.information();
        s2.information();
    }
}