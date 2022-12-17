package database_kasir;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Database_kasir {

    public static void main(String[] args) {
        
        kategoriModel hem = new kategoriModel();
        barangModel ham = new barangModel();
        
        kategori ktg = new kategori(1, "barang hidup");
        kategori ktg2 = new kategori(2, "barang ajaib");
       
        ArrayList<kategori> uwaw = new ArrayList<>();
       
        uwaw.add(ktg);
        uwaw.add(ktg2);

        barang brg = new barang("A0001", LocalDate.of(2024, Month.DECEMBER, 12), uwaw , "barang A", 10000, 3, 2500);
        barang brg2 = new barang("A0002", LocalDate.of(2021, Month.DECEMBER, 12), uwaw , "barang B", 10000, 3, 2500);
       
//        ktg.getProduk(brg,ktg);
//        System.out.println();
//        ktg2.getProduk(brg2,ktg2);
        
//        System.out.println(ktg.getId_kategori());
        
        hem.addKategori(ktg);
        hem.addKategori(ktg2);
        
        ham.addBarang(brg, ktg);
        ham.addBarang(brg2, ktg2);
    }
}
