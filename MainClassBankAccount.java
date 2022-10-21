/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manny
 */
public class MainClassBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount mannyAccount = new BankAccount("Manny Castanon" , 20);
        //mannyAccount.owner = "Manny Castanon";
       // mannyAccount.balance = 20;
        
        mannyAccount.deposit(80);
        mannyAccount.withdrawl(50);
        //not taking control of over draft
       //mannyAccount.withdrawl(100);
        
        //System.out.println(mannyAccount.balance);
        mannyAccount.display();
        
        //Creating another object without re writing the code all over agian.
        BankAccount alanAccount = new BankAccount("Alan", 1000000);
        //alanAccount.owner = "Alan";
        //alanAccount.balance = 1000000;
        
       // System.out.println(alanAccount.balance);
       alanAccount.display();
                
    }
    
}
