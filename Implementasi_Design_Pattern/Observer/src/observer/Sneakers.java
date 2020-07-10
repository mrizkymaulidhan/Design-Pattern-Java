package observer;

import java.util.ArrayList;

public class Sneakers implements IObservable {
    private String name;
    private boolean inStock = true;
    private ArrayList<IObserver> customers;

    public Sneakers(String name){
        this.name = name;
        this.inStock = inStock;
        customers = new ArrayList<IObserver>();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public boolean isInStock(){
        return  inStock;
    }

    public void setInStock(boolean inStock){
        this.inStock = inStock;
        notifyObserver();
    }

    @Override
    public void addObserver(IObserver o) {
        customers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        customers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i< customers.size(); i++){
            customers.get(i).update(this);
        }
    }
}