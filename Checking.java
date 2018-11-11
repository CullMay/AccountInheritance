/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountinheritance;

/**
 *
 * @author Fabio
 */
public class Checking extends Account{
    
    static double fee = 0.25;
    
    public Checking (double init){
        
        super (init);
    }
    
    @Override
    public boolean Credit(double deposit){
        
        boolean giveMoney = super.Credit(deposit);
        if (giveMoney){
            
            double bal = getBalance();
            bal=bal-fee;
            setBalance(bal);
        }
        return true;
    }
    
    @Override
    public boolean Debit (double withdrawl){
        
        boolean money = super.Debit(withdrawl);
        if (money){
            
            double bal = getBalance();
            setBalance(bal - fee);
        }
        
        else{
            
            System.out.println("You dont have enough money to withdrawl that amount");
        }
        return true;
    }
    
}
