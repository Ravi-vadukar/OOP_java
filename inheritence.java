
// In inheritense we acces perents method using extends keyword in child 

class Shape {
    public void displayarea(){
        System.out.println("Display Area of Shape ");
    }
}

class Triangle extends Shape{
public void triangleare(int h,int b){
    System.out.println("The area is triangle  "+(1/2)*b*h); 
}
}

class Squre extends Shape{
    public void squrearea(int l){
        System.out.println("The are of Squre shape is"+ l*l);
    }
}

public class inheritence {
    public static void main(String[] args) {
        Squre s1 = new Squre();
        s1.displayarea();
        s1.squrearea(7);
    }
    
}
