package strategy;

abstract class IHero {
    UltimateBehavior ultimateBehavior; 
  
    public IHero(UltimateBehavior ultimateBehavior) { 
        this.ultimateBehavior = ultimateBehavior; 
    }
    
    public void Punch() { 
        System.out.println("Default Punch"); 
    }
    
    public void Run() { 
        System.out.println("Default Run");  
    }
    
    public void Ultimate() { 
        ultimateBehavior.ultimate();
    } 
    
    public void setUltimateBehavior(UltimateBehavior ultimateBehavior) { 
        this.ultimateBehavior = ultimateBehavior; 
    }
    
    public abstract void display();
    
}