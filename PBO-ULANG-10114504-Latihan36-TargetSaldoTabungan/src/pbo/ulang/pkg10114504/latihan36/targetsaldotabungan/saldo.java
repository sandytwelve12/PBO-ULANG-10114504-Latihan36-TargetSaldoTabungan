/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program Ini berisi Program class target saldo tabungan
 */
public class saldo {

    int bunga;
    int saldo;
    int target;
     public void hitungSaldo(int saldo,int target, double bunga){
        int i=1;       
        while(saldo<= target){
            bunga = bunga/100;
            saldo = (int)(saldo+(saldo*bunga));
            System.out.println("Saldo di bulan ke-"+i+"Rp. "+saldo);
            i++;
        
        System.out.println("");
        System.out.println ("Developed by Sandy Akbar");
        }
    
}
}