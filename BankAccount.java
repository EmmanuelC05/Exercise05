/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manny
 */
public class BankAccount {
    
    String owner;
    double balance;
    
    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    
    
    void deposit(double amount){
        balance = balance + amount;
        
        
    }
    void withdrawl(double amount){
        //This if statement takees care of the insufficent funds message
        if(amount > balance){
            System.out.println("Insufficient funds");
            //The return does not allow the program to deduct the amount and keeps value
            return;
        }
        balance = balance - amount;
    }
    void display(){
        System.out.println("========================");
        System.out.println("Owner: "+ owner);
        System.out.println("Balance "+ balance);
        System.out.println("========================");
    }
}
