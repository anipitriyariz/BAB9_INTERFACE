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
public class truk implements Kendaraan{

    @Override
    public String nama() {
        return "mesin";
    }

    @Override
    public int jumlah_roda() {
        return 4;
    }

    @Override
    public String lintasan() {
      return "aspal";
    }
    
}
