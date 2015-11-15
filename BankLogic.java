package BankAccount;

import java.util.ArrayList;

public class BankLogic {

    private ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<String> getCustomers() {
        ArrayList<String> custStrings = new ArrayList<>();
        for (Customer customer : customers) {
            custStrings.add(customer.pNr() + " " + customer.getName());
        }
        return custStrings;
    }

    public boolean addCustomer(String name, long pNr) {
        for (Customer customer : customers) {
            if (customer.pNr() == pNr)
                return false;
        }
            Customer newCust = new Customer(name, pNr);
            customers.add(newCust);
            return true;
        }

    public ArrayList<String> getCustomer(long pNr) {
        ArrayList<String> infoList = new ArrayList<>();
        for (Customer customer : customers) {
            if (pNr == customer.pNr()) {
                String info = customer.getName() + " " + customer.pNr();
                infoList.add(info);
                ArrayList<SavingsAccount> accounts = customer.getAccounts();
                for (int i = 0; i < customer.getAccounts().size(); i++) {
                    SavingsAccount account = accounts.get(i);
                    infoList.add(account.getBalance() + " " + account.getRate() + " " + account.getAccountNr());
                }
            }
        }
        return infoList;
    }
}
