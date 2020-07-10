package facade;

public class Testing {
    
    public static void Order(){
        Chef chef = new Chef();
        Cashier cashier = new Cashier();
        Waiter waiter = new Waiter();
        Customer customer = new Customer();
        
        customer.Order();
        cashier.Post();
        chef.Prepare();
        chef.Cook();
        chef.Post();
        waiter.Post();
        customer.Eat();
        customer.PayBills();
        cashier.Save();
    }
    
    public static void main(String[] args) {
        Order();
    }
    
}
