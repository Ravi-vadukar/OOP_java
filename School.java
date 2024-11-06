// interface in java use also hide value (like abstrect key word )
interface oop{
    public void languge();

    }
class Basic implements oop{
    public void languge(){
        System.out.println("Basic of C languge ");
    }
}

public class School {
    public static void main(String[] args) {
        Basic b1 = new Basic();
        b1.languge();
        
    }
}
