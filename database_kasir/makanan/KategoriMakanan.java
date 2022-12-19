/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_kasir;

/**
 *
 * @author ASUS
 */
public class KategoriMakanan {
    private int id_kategori;
    private String nama_kategori;

    public KategoriMakanan(int id_kategori, String nama_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }
    
    public KategoriMakanan(int id_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = "";
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
    public void getProduk(Makanan mkn) {
        System.out.println(mkn.getNama_produk());
        System.out.println(mkn.getHarga());
        System.out.println(mkn.getDaya_tahan());
    }
}
