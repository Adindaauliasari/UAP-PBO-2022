/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_kasir;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author A C E R
 */
public class barang extends produk {
    private String barcode;
    private LocalDate expired;
    private ArrayList <kategori> kategori;

    public barang(String barcode, LocalDate expired, ArrayList<kategori> kategori, 
            String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.kategori = kategori;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public LocalDate getExpired() {
        return expired;
    }

    public void setExpired(LocalDate expired) {
        this.expired = expired;
    }

    public ArrayList<kategori> getKategori() {
        return kategori;
    }

    public void setKategori(ArrayList<kategori> kategori) {
        this.kategori = kategori;
    }

    @Override
    public double hargaDiskon() {
        return super.getHarga() - super.getDiskon();
    }

    public void isExpired(){
        LocalDate today = LocalDate.now();
        if(today.compareTo(expired) > 0){
            System.out.println("Expired");
        }
    }
    
    public int addKategori(kategori ktg){
        return ktg.getId_kategori();
    }
}
