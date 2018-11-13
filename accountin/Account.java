/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountin;

public class Account {
    private double balance;
    protected int accountNum;
    static int masterAccount=100;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int acountNum) {
        this.accountNum = acountNum;
    }
    
    public Account (double init){
        if (getBalance()>0){
            
            System.out.println("Account is here.");
        
        }
        else{
            
            if(init >=0){
                
                masterAccount=masterAccount+15;
                this.accountNum=masterAccount;
                this.balance=init;
                
            }
            
            else{
                
                System.out.println("Please make a deposit to start an account");
            }
        }
    }
    
    public boolean Credit(double deposit){
        
        double bal = getBalance();
        setBalance(bal+deposit);
        return true;
    }
    
    public boolean Debit(double withdrawl){
        
        double bal = getBalance();
        if (bal<withdrawl){
            
            System.out.println("Your withdrawl exceeds account balance");
            return false;
        }
        
        else{
            
            setBalance(bal-withdrawl);
            return true;
        }
    }
    
    public double Balance(){
        
        double bal= getBalance();
        System.out.printf("The current balance is: %.2f\n", bal);
        return bal;
    }
    
}