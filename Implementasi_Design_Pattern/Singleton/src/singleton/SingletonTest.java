package singleton;

import java.util.Scanner;

public class SingletonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        if(CurrentUser.isLoggedIn()) {
            System.out.println("User "+ CurrentUser.user().getUserName() + "was log in");
        } 
        else {
            System.out.println("You're not log in.");
            System.out.println("Do you want to log in? (Yes/No)");
            if("Yes".equals(input.nextLine())){
                System.out.println("\nUsername: ");
                String username = input.nextLine();
                System.out.println("Password: ");
                String password = input.nextLine();
                CurrentUser.login(username, password);
                System.out.println("\nUser who login:");
                System.out.println("Username: " + CurrentUser.user().getUserName());
                System.out.println("Password: " + CurrentUser.user().getPassword());
                System.out.println("\nDo you want to log out? (Yes/No) ");
                if("Yes".equals(input.nextLine())){
                    CurrentUser.logout();
                    if(!CurrentUser.isLoggedIn()){
                        System.out.println("\nYou're log out.");
                    }
                }
                else{
                    System.out.println("\nYou're still log in");
                }
            }
            else{
                System.out.println("Exit... ");
            }
        }
    }
}