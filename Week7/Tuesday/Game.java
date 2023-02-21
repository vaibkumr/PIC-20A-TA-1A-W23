interface Item{

    int getWeight();

}

interface Weapon extends Item{

    int getDamage();

}

interface Armour extends Item{

    int saveDamage();

}

class Sword implements Weapon{

    String name; 

    public Sword(String name){
        this.name = name;
    }

    @Override
    public int getDamage(){
        return 10;
    }

    @Override
    public int getWeight(){
        return 100;
    }      

    public void printStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Damage: " + this.getDamage());
    }    

}

class Shield implements Armour, Weapon{

    public String name;

    @Override
    public int getDamage(){
        return 10;
    }

    @Override
    public int saveDamage(){
        return 10;
    } 
    
    @Override
    public int getWeight(){
        return 100;
    }     

    public Shield(String name){
        this.name = name;
    }

    public void printStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Damage: " + this.getDamage());
        System.out.println("Save Damage: " + this.saveDamage());
    }


}




public class Game {
    static public void main(String[] name){
        Shield s = new Shield("Golden Falcon Shield");
        s.printStats();

        Sword sw = new Sword("Crystal Greatsword");
        sw.printStats();        

    }    
}
