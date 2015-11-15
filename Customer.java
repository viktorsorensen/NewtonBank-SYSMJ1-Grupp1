package BankAccount;

import java.util.ArrayList;

public class Customer {
    private ArrayList<SavingsAccount> accounts;
    private String name;
    private long pNr;

    public Customer(String name, long pNr) {
        this.name  = name;
        this.pNr = pNr;
        this.accounts = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setPrsNbr(long pNr){
        this.pNr = pNr;
    }

    public long pNr(){
        return pNr;
    }
    public void setAccounts(ArrayList<SavingsAccount> accounts){
        this.accounts = accounts;
    }
    public ArrayList<SavingsAccount> getAccounts(){
        return accounts;
    }
    public String toString(){
        return ("Namn: " + name + "\n" + "Personnummer: " + pNr + "\n" + "Konton: " + accounts);
    }

}
