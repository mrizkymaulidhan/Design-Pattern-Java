package strategy;

class HardRock extends IHero { 
    
    public HardRock(UltimateBehavior ultimateBehavior) { 
        super(ultimateBehavior); 
    } 
    
    @Override
    public void display() { 
        System.out.println("Hard Rock"); 
    } 
    
}
