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
public class AccountIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Savings savings = new Savings(5000.0);
        savings.CalculateInterest();
        savings.Credit(20);
        savings.Balance();
        Checking checking = new Checking(500);
        checking.Credit(35);
        checking.Balance();
        Checking check = new Checking(10);
        check.Debit(15);
        check.Balance();
        
    }
    
}
