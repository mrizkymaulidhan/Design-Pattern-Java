package decorator;

public class ExtendedMagazine extends AttachmentDecorator {

    public ExtendedMagazine(IAttachment nextAttachment) { 
        super(nextAttachment);
    } 
    
    @Override 
    public void showAttachment() { 
        super.showAttachment(); 
        System.out.println(" Extended Magazine (Increase magazine capacity)"); 
    }
    
}
