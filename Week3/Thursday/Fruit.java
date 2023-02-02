public class Fruit {
    public double fprice;  
    public String fname;  

    Fruit(double fPrice, String fName)  {   
        //Constructor
        System.out.println("The constructor...");
        this.fprice = fPrice;  
        this.fname = fName;  
    }  

    Fruit(Fruit f2){  
        //Copy constructor
        System.out.println("The copy constructor...");
        fprice = f2.fprice;  
        fname = f2.fname;  
    } 

    public void describe(){
        System.out.println("Fruit Name: "+fname+" | Fruit price: "+fprice);
    }



    public static void main(String args[]){
        Fruit f1 = new Fruit(399, "Ruby Roman Grapes");  
        f1.describe();

        Fruit f2 = new Fruit(f1);  
        f2.describe();      
        
    }
    
}
