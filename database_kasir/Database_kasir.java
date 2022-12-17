/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database_kasir;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Database_kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       kategori ktg = new kategori(1, "barang hidup");
       ArrayList<kategori> uwaw = new ArrayList<>();
       uwaw.add(ktg);
       barang brg = new barang("A0001", LocalDate.of(2020, Month.DECEMBER, 12), uwaw , "barang A", 10000, 3, 2500);
       
       ktg.getProduk(brg);
       brg.isExpired();
    }
    
}
