package decorator;

public class LongBarrel extends AttachmentDecorator {

    public LongBarrel(IAttachment nextAttachment) { 
        super(nextAttachment);
    } 
    
    @Override 
    public void showAttachment() { 
        super.showAttachment(); 
        System.out.println(" Long Barrel (Increase weapon firing range)"); 
    }
    
}
