public class Stock {
    public int[] historical_price;
    public String name;

    public Stock(int[] stock_price, String stock_name){
        historical_price = stock_price;
        name = stock_name;
    }

    // public Stock(Stock s){
    //     historical_price = s.historical_price;
    //     name = s.name;
    // }

    public Stock(Stock s){
        historical_price = new int[s.historical_price.length];
        for(int i=0; i<historical_price.length; i++)
            historical_price[i] = s.historical_price[i];
        name = s.name;
    }    

    public void display(){
        System.out.println("\nHistorical Price for: "+name);
        for(int p : historical_price)
            System.out.print(p+" ");
            
    }
    public static void main(String[] args){
        Stock msft = new Stock(new int[]{200, 300, 250, 350, 500}, "Microsoft");
        msft.display();

        Stock fake_msft = new Stock(msft);
        fake_msft.display();

        msft.historical_price[0] = 100;
        
        msft.display();
        fake_msft.display();

    }
    
}
