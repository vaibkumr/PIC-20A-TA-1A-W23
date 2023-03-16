public class AbstractClass {

    public static void main(String[] args) {
        Elephant e = new Elephant();
        System.out.println(e.numLegs());
        System.out.println(e.laysEggs());
      
    }
}


abstract class Mammal {
    //can abstract methods be private?
    public abstract int numLegs();

    public boolean laysEggs(){
        return false;
    }
}

public class Elephant extends Mammal{

    public int numLegs(){
        return 4;
    }

    public float weight(){
        return 8800;
    }    
    
}

public class Human extends Mammal{

    public float weight(){
        return 200;
    }    
    
}