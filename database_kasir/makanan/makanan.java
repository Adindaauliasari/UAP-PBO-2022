/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_kasir;

import java.util.ArrayList;

/**
 *
 * @author A C E R
 */
public class makanan extends produk {
    private int id;
    private int daya_tahan;
    private ArrayList <kategori> kategori;

    public makanan(int id, int daya_tahan, ArrayList<kategori> kategori, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.id = id;
        this.daya_tahan = daya_tahan;
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(int daya_tahan) {
        this.daya_tahan = daya_tahan;
    }

    public ArrayList<kategori> getKategori() {
        return kategori;
    }

    public void setKategori(ArrayList<kategori> kategori) {
        this.kategori = kategori;
    }

    @Override
    public double hargaDiskon() {
        return super.getHarga() - (super.getDiskon() * super.getHarga());
    }
    
    public void isSpoiled(){
        
    }
}
