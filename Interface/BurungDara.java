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
public class BurungDara extends hewan
        implements nafas, terbang {
    
   
    @Override
    public void bernafas() {
        setNafas("bisa bernafas");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void terbang() {
        setTerbang("bisa terbang");
//To change body of generated methods, choose Tools | Templates.
    }
}
