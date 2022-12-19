package database_kasir;

import java.time.LocalDate;
import java.util.ArrayList;

public class Makanan extends Produk {
    private int id;
    private LocalDate daya_tahan;
    private int id_kategori;
    private ArrayList <KategoriMakanan> kategori;

    public Makanan(int id, LocalDate daya_tahan, ArrayList<KategoriMakanan> kategori, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.id = id;
        this.daya_tahan = daya_tahan;
        this.kategori = kategori;
    }
    
    public Makanan(int id, LocalDate daya_tahan, int id_kategori, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.id = id;
        this.daya_tahan = daya_tahan;
        KategoriMakanan ktg = new KategoriMakanan(id_kategori);
        this.id_kategori = id_kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public LocalDate getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(LocalDate daya_tahan) {
        this.daya_tahan = daya_tahan;
    }

    public ArrayList<KategoriMakanan> getKategori() {
        return kategori;
    }

    public void setKategori(ArrayList<KategoriMakanan> kategori) {
        this.kategori = kategori;
    }

    @Override
    public double hargaDiskon() {
        return super.getHarga() - (super.getDiskon() * super.getHarga());
    }
    
    public void isSpoiled() {
        LocalDate today = LocalDate.now();
        if(today.compareTo(daya_tahan) > 0){
            System.out.println("Makanan Sudah Basi");
        } else {
            System.out.println("Makanan Belum Basi");
        }
    }
}
