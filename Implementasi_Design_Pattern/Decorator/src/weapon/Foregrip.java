package decorator;

public class Foregrip extends AttachmentDecorator {

    public Foregrip(IAttachment nextAttachment) { 
        super(nextAttachment);
    } 
    
    @Override 
    public void showAttachment() { 
        super.showAttachment(); 
        System.out.println(" Foregrip (Increase accuraccy and reduce recoil)"); 
    }
    
}
