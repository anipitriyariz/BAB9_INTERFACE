/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Interface;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
    BurungDara b = new BurungDara();
    System.out.println(" Burung Dara");
    b.bernafas();
    b.terbang();
    b.tampil();
    System.out.println(" ");
    Kucing k = new Kucing();
    System.out.println(" Kucing");
    k.bernafas();
    k.terbang();
    k.tampil();

    }
}
