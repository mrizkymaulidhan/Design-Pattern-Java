package facade;

class Chef {
    
    public void Prepare(){
        System.out.println("Chef is preparing ingredients to cook.");
    }
 
    public void Cook(){
        System.out.println("Chef is cooking the ordered food.");
    }
 
    public void Post(){
        System.out.println("Chef is giving food to the waiter to be served.");
    }

}