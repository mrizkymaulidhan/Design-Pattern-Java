package observer;

public class Customer implements IObserver {
    private IObservable observable;
    private String username;
    private Sneakers sneakers;

    public Customer(IObservable observable, String username){
        this.observable = observable;
        this.username = username;
    }

    @Override
    public void update(Sneakers sneakers) {
        if(sneakers.isInStock()){
            System.out.println("Sepatu " +sneakers.getName() +" tersedia.");
            buyShoes(sneakers);
        }
        else{
            System.out.println("Sepatu " +sneakers.getName() +" tidak tersedia.");
            notBuyShoes(sneakers);
        }
    }

    private void buyShoes(Sneakers sneakers){
        System.out.println(username +" membeli sepatu " +sneakers.getName());
    }
    
    private void notBuyShoes(Sneakers sneakers){
        System.out.println(username +" tidak membeli sepatu " +sneakers.getName());
    }

    public void unsubscribe(){
        observable.removeObserver(this);
    }
}