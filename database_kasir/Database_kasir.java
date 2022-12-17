package database_kasir;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Database_kasir {
    public static void main(String[] args) {
        kategori ktg = new kategori(1, "barang hidup");//object 1
        kategori ktg2 = new kategori(2, "barang ajaib");//object 2
       
        ArrayList<kategori> uwaw = new ArrayList<>();
       
        uwaw.add(ktg);//object 1
        uwaw.add(ktg2);//object 2

        barang brg = new barang("A0001", LocalDate.of(2024, Month.DECEMBER, 12), uwaw , "barang A", 10000, 3, 2500);//object 1
        barang brg2 = new barang("A0002", LocalDate.of(2021, Month.DECEMBER, 12), uwaw , "barang B", 10000, 3, 2500);//object 2
       
        ktg.getProduk(brg,ktg);
        System.out.println();
        ktg2.getProduk(brg2,ktg2);
    }
}
