/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_Bank;

/**
 *
 * @author hp
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bankMethod = new Bank();
        
        System.out.println("Selamat Datang di Bank ABC");
        bankMethod.getSaldo();
        
        bankMethod.simpanUang(500000);
        bankMethod.getSaldo();
        
        bankMethod.ambilUang(150000);
        bankMethod.getSaldo();
    }
    
}
