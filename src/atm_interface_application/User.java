package atm_interface_application;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {

    private String firstName;
    private String lastName;
    private String uuid;
    private byte pinHash[];
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank theBank) throws NoSuchAlgorithmException {
        this.firstName = firstName;
        this.lastName = lastName;
        MessageDigest md = MessageDigest.getInstance("MD5");
        this.pinHash = md.digest(pin.getBytes());
        this.uuid = theBank.getNewUserUUID();
        this.accounts = new ArrayList<Account>();
        System.out.printf("New user %s, %s with ID %s created.\n", lastName, firstName, this.uuid);
    }

    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }

    public String getUUID(){
        return this.uuid;
    }

    public boolean validatePin(String aPin) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD%");
        return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.pinHash);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void printAccountsSummary(){
        System.out.printf("\n\n%s's accounts summary", this.firstName);
        for(int a = 0; a < this.accounts.size(); a++){
            System.out.printf("%d) %s\n", this.accounts.get(a).getSummaryLine());
        }
        System.out.println();
    }

}
