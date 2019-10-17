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
 * DESKRIPSI: Program Ini berisi Program target saldo tabungan
 */
public class PBOULANG10114504Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        saldo mysaldo = new saldo(); 
        mysaldo.saldo = 3500000;
        mysaldo.bunga = 8;
        mysaldo.target = 6000000;
        
        mysaldo.hitungSaldo(saldo, bunga, target);
        
    }
    
}
