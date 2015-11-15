package BankAccount;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SavingsAccount
{
    private Random generator = new Random();
    private double balance;
    private double rate;
    private long accountNr;
    private String description;

    public SavingsAccount(double balance, double rate, String description)
    {
        this.accountNr = generator.nextInt(100000);
        setBalance(balance);
        setRate(rate);
        setDescription(description);
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    public void setDescription(String desc)
    {
        this.description = desc;
    }

    public long getAccountNr()
    {
        return accountNr;
    }
    public String getAccountName()
    {
        return description;
    }
    public double getRate()
    {
        return rate;
    }
    public double getBalance()
    {
        return balance;
    }

    public String toString()
    {
        return getBalance() + " " + getRate() + " " + getAccountNr() + " " + getAccountName();
    }
}
