package decorator;

public abstract class AttachmentDecorator implements IAttachment{ 
    IAttachment nextAttachment;
    
    public AttachmentDecorator(IAttachment nextAttachment) { 
        this.nextAttachment = nextAttachment; 
    }
    
    @Override
    IAttachment addAttachment() { 
        return this; 
    }
    
    @Override 
    public void showAttachment() { 
        nextAttachment.showAttachment(); 
    }
    
}