package strategy;

class Thunder extends IHero { 
    
    public Thunder(UltimateBehavior ultimateBehavior) { 
        super(ultimateBehavior); 
    } 
    
    @Override
    public void display() { 
        System.out.println("Thunder"); 
    } 
    
}
