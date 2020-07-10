package decorator;

public class Weapon {
    String name;
    IAttachment attachment = new Scope();
    
    public Weapon(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public  void addNewAttachment(String attachmentName) { 
        switch (attachmentName) {
            case "Extended Magazine":
                this.attachment = new ExtendedMagazine(attachment);
                break;
            case "Foregrip":
                this.attachment = new Foregrip(attachment);
                break;
            case "Long Barrel":
                this.attachment = new LongBarrel(attachment);
                break;
            default:
                break;
        }
    }
        
    public void showAttachment() { 
        System.out.println(this.name + " Attachments :");
        attachment.showAttachment(); 
    }
   
}