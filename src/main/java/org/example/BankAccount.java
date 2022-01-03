package org.example;

public class BankAccount {
    static protected Integer nextAccountNbr=0;

    public String getAccountStr() {
        return accountStr;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAccountNbr() {
        return accountNbr;
    }

    public void setAccountStr(String accountStr) {
        this.accountStr = accountStr;
    }

    public void setBalance(Double balance) {
        {
            this.balance = balance;
        }
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAccountNbr(Integer accountNbr) {
        this.accountNbr = accountNbr;
    }

    String accountStr;
    double balance;
    String customer_name;
    String email;
    String phone;

    public void withdraw(double amount){
        if (amount>balance) {
            throw new IllegalArgumentException("Incufficent funds");
        }
        balance=balance-amount;
        System.out.println("Withdraw "+amount+" New Balance "+this.balance);
    }

    public void deposit(double amount){
        if (amount>=2000) {
            {
                throw new IllegalArgumentException("Amount must be smaller  than 2 000");
            }
        }


/*
        if (amount==111){
            throw new IllegalArgumentException("111 Illegal");
        }
*/

    this.balance=this.balance+amount;
        System.out.println("Deposit "+amount+" New Balance "+this.balance);
    }

    protected Integer accountNbr;
    // Default Constructor
    public BankAccount(){
        System.out.println("Default Constructor");

        nextAccountNbr++;
        accountNbr=nextAccountNbr;
        System.out.println("accountNbr "+accountNbr);
    }
    public BankAccount(String accountStr, Float balance, String customer_name, String
    email, String  phone){
        this();
    }

}
