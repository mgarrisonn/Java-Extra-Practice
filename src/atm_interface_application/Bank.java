package atm_interface_application;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;
    
    public String getNewUserUUID(){
        String uuid;
        Random rng = new Random();
        int len = 10;
        boolean nonUnique;
        do {
            uuid = "";
            for (int c = 0; c < len; c++){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            nonUnique = false;
            for (Account a : this.accounts){
                if(uuid.compareTo(a.getUUID()) == 0){
                    nonUnique = true;
                    break;
                }
            }
        } while(nonUnique);
        return uuid;
    }

    public String getNewUserUUID(){

    }
    
    public String getNewAccountUUID(){
        
    }

    public void addAccount(Account anAcct) {
        this.accounts.add(anAcct);
    }

    public User addUser(String firstName, String lastName, String pin){
        User newUser = new User(firstName, lastName, pin, this);
        this.users.add(newUser);
        Account newAccount = new Account("Savings", newUser, this);
        newUser.addAccount(newAccount);
        this.addAccount(newAccount);
    }
}
