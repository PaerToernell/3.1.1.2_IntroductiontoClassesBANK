package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    System.out.println( "Hello World!" );
    BankAccount myAccount = new BankAccount("123237y", 7564655.75f,
            "Anders And", "sdhf@jhj.se","070-64 6 65 " );

        BankAccount myAccount2 = new BankAccount("43534", 6546.45f,
                "Olle And", "aaa@jhj.se","070-11 6 65 " );

        myAccount.deposit(1500);
        myAccount.deposit(700);
        myAccount.withdraw(300);
        System.out.println("Finished");
    }
}
