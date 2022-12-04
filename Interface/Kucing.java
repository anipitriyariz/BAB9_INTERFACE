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
public class Kucing extends hewan implements nafas,terbang{

    @Override
    public void bernafas() {
        setNafas("bisa bernafas");
    }

    @Override
    public void terbang() {
        setTerbang("tidak bisa terbang");
    }

  
    
}
