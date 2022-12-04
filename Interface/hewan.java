/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Interface;

/**
 *
 * @author LENOVO
 */
public class hewan {

    String nafas = "tidak bisa bernafas";
    String terbang = "tidak bisa terbang";
    
    public void setNafas(String nafas){
        this.nafas =nafas;
    }
    
    public void setTerbang(String terbang){
        this.terbang = terbang;
    }
    
    
    public void tampil(){
        System.out.println(" hewan ini adalah Hewan Peliharaan yang :");
        System.out.println("============================================");
        System.out.println(nafas);
        System.out.println(terbang);
    }
}
