package observer;

public class Testing {
    
    public static void main(String[] args){
        Sneakers Vans = new Sneakers("Vans");
        Sneakers Nike = new Sneakers("Nike");
        
        Customer customer1 = new Customer(Vans, "Samuel");
        Vans.addObserver(customer1);

        Customer customer2 = new Customer(Nike, "Gabriel");
        Nike.addObserver(customer2);
        
        Vans.setInStock(true);
        Nike.setInStock(false);
    }
    
}
