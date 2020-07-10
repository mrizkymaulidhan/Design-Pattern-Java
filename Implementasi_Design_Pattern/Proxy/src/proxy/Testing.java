package proxy;

public class Testing {

    public static void main(String[] args) {
        IPlanes lion_air1 = new LionAirProxy(new Pilot("Andy King"));
        lion_air1.fly();

        IPlanes lion_air2 = new LionAirProxy(new Pilot("Abraham John"));
        lion_air2.fly();
        
        IPlanes lion_air3 = new LionAirProxy(new Pilot("David Morgan"));
        lion_air3.fly();
    }    
}
