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
public class driveclass {

    public static void main(String[] args) {
        Perahu_Kertas book = new Perahu_Kertas();

        System.out.print("Judul          : ");
        book.judul();
        System.out.print("Tahun Rilis    : ");
        book.tahun();
        System.out.print("Penerbit       : ");
        book.nama_penerbit();
        System.out.print("Pengarang      : ");
        book.pengarang();
        System.out.print("Kota Penerbit  : ");
        book.kota();
        System.out.println("Jmlh Hal.    : " + Integer.toString(buku.halaman) + " lembar");
        System.out.println("Negara       : " + penerbit.negara);
    }

}

