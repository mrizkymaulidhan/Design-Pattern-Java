package decorator;

public class Testing {

    public static void main(String[] args) {
        Weapon weapon = new Weapon("AK-47"); 
        weapon.addNewAttachment("Foregrip"); 
        weapon.addNewAttachment("Extended Magazine"); 
        weapon.addNewAttachment("Long Barrel"); 
        weapon.showAttachment();
    }
    
}