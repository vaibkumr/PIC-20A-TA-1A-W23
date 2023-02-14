public class AbstractClasses {
    public static void main(String args[]){
        // Art a = new Art(); //can't have objects for abstract class

        Music m = new Music();
        System.out.println(m.type());
        System.out.println(m.price());

        Painting p = new Painting();
        System.out.println(p.type());
        System.out.println(p.price());


    }
}


abstract class Art{ //an abstract class 
    public abstract String type(); //an abstract method
    public abstract int price(); //another abstract method
    public void iamnot(){ //abstract classes can have concrete methods
        System.out.println("I am not science");
    }
}

class Music extends Art{

    public String type(){
        return "Music by Wolfgang Mozart";
    }

    public int price(){
        return 100;
    }    

}

class Painting extends Art{

    public String type(){
        return "Painting by Van Gogh";
    }

    public int price(){
        return 870_000;
    }    

}