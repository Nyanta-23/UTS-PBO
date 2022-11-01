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
public class Bank {
    int saldo = 100000;
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
        
        System.out.println("Simpan uang : Rp " + jumlah);
        
    }
    
    public void ambilUang(int jumlah){
        saldo -= jumlah;
        
        System.out.println("Ambil uang : Rp " + jumlah);
    }
    
    public void getSaldo(){
        int getSaldo = saldo;
        
        System.out.println("Saldo saat ini : " + getSaldo);
    }
}
