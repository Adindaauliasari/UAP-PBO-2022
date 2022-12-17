/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_kasir;

/**
 *
 * @author A C E R
 */
public class kategori {
    private int id_kategori;
    private String nama_kategori;

    public kategori(int id_kategori, String nama_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
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
    
    public void getProduk(barang brg) {
        System.out.println(brg.getNama_produk());
        System.out.println(brg.getHarga());
        System.out.println(brg.getExpired());
    }
}
