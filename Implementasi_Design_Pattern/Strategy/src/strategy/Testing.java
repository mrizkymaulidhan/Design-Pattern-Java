package strategy;

public class Testing {

    public static void main(String[] args) {
        UltimateBehavior lightningBlade = new LightningBlade();
        UltimateBehavior tornadoFire = new TornadoFire();
        UltimateBehavior stoneWave = new StoneWave();
        IHero endeavour = new Endeavour(tornadoFire); 
        IHero thunder = new Thunder(lightningBlade); 
        IHero hardrock = new HardRock(stoneWave); 
        
        endeavour.display(); 
        endeavour.Punch(); 
        endeavour.Run(); 
        endeavour.Ultimate();
        System.out.println("\n");
        thunder.display(); 
        thunder.Punch(); 
        thunder.Run(); 
        thunder.Ultimate();
        System.out.println("\n");
        hardrock.display(); 
        hardrock.Punch(); 
        hardrock.Run(); 
        hardrock.Ultimate();        
    }

}

