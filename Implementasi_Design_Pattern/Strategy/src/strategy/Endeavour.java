package strategy;

class Endeavour extends IHero { 
    
    public Endeavour(UltimateBehavior ultimateBehavior) { 
        super(ultimateBehavior); 
    } 
    
    @Override
    public void display() { 
        System.out.println("Endeavor"); 
    } 
    
}