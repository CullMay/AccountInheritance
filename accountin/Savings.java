/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountin;

/**
 *
 * @author cm0850068
 */
public class Savings extends Account {
    static final double rate = .04;
    
    public Savings(double init){
        
        super (init);
    }
    
    public double CalculateInterest(){
        
        double bal = getBalance();
        double interest = bal*rate;
        return interest;
    }
}