abstract class Animal{
    abstract void walk();
}
 
class hourse extends Animal{
    public void walk(){
        System.out.println("4 leg for walking ");
    }
}

class pigeon extends Animal{
    public void walk(){
        System.out.println("2 leg with walking ");
    }
}

public class  MainAnimal {
    
    public static void main(String[] args) {
        
 hourse h1 = new hourse();
 h1.walk();

 pigeon p1 = new pigeon();
 p1.walk();

 
    }
}
