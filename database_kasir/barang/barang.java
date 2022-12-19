package database_kasir;

import java.time.LocalDate;
import java.util.ArrayList;

public class Barang extends Produk {
    private String barcode;
    private LocalDate expired;
    private int id_kategori;
    private ArrayList <KategoriBarang> kategori;

    public Barang(String barcode, LocalDate expired, ArrayList<KategoriBarang> kategori, 
            String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.kategori = kategori;
    }
    
    public Barang(String barcode, LocalDate expired, int id_kategori, 
            String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
        KategoriBarang ktg = new KategoriBarang(id_kategori);
        this.id_kategori = id_kategori;
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

    public ArrayList<KategoriBarang> getKategori() {
        return kategori;
    }
    
    public int getId_kategori() {
        return id_kategori;
    }

    public void setKategori(ArrayList<KategoriBarang> kategori) {
        this.kategori = kategori;
    }

    @Override
    public double hargaDiskon() {
        return super.getHarga() - (super.getDiskon() * super.getHarga());
    }

    public void isExpired() {
        LocalDate today = LocalDate.now();
        if(today.compareTo(expired) > 0){
            System.out.println("Barang Sudah Expired");
        }else {
            System.out.println("Barang Belum Expired");
        }
    }
    
    public void getBarang(int id_kategori, String nama_kategori) {
        KategoriBarang ktg = new KategoriBarang(id_kategori,nama_kategori);
        System.out.println(super.getNama_produk());
        System.out.println(ktg.getNama_kategori());
    }
}
