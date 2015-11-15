package BankAccount;
import java.util.*;

public class Information
{
    private ArrayList<String> customers;
    public Information()
    {
        customers = new ArrayList<>();
    }

    public void addCustomer(String n)
    {
        customers.add(n);
    }
    public ArrayList<String> getCustomers()
    {
        return customers;
    }
}
