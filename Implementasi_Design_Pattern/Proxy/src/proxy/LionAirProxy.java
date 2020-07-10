package proxy;

public class LionAirProxy implements IPlanes {

    private Pilot pilot;
    private IPlanes lion_air;

    public LionAirProxy(Pilot pilot) {
        this.pilot = pilot;
        this.lion_air = new LionAir();
    }

    @Override
    public void fly() {
        switch (pilot.getName()) {
            case "Andy King":
                lion_air.fly();
                break;
            case "David Morgan":
                lion_air.fly();
                break;
            case "Alex Jordan":
                lion_air.fly();
                break;
            case "Samuel Lewis":
                lion_air.fly();
                break;
            default:
                System.out.println("I'm sorry mr." + pilot.getName() +" you can't fly. You're not in pilot member list!");
                break;
        }
    }
}