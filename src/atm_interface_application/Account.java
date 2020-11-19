package atm_interface_application;

import java.util.ArrayList;

public class Account {

    private String name;
    private String uuid;
    private User holder;
    private ArrayList<Transaction> transactions;

    public Account(String name, User holder, Bank theBank){
        this.name = name;
        this.holder = holder;
        this.uuid = theBank.getNewUserUUID();
        this.transactions = new ArrayList<Transaction>();
    }

    public String getUUID(){
        return this.uuid;
    }

}
