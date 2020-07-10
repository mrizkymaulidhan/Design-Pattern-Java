package decorator;

public class Scope implements IAttachment {

    @Override 
    public IAttachment addAttachment() {
        return this; 
    }
    
    @Override
    public void showAttachment() {
        System.out.println(" Holographic Scope (Default scope)");
    } 
    
}
