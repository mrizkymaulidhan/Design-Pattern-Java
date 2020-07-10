package singleton;

public class CurrentUser {
	
    private static User active = null;
  
    private CurrentUser(){
    }
  
    public static User user() {
        return active;
    }

    public static void login(String username, String password) {
        active = new User(username, password);
    }
  
    public static void logout() {
        active = null;
    }

    public static boolean isLoggedIn() {
        return (active != null);
    }

}