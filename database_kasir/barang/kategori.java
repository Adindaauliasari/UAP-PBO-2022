package database_kasir;

public class KategoriBarang {
    private int id_kategori;
    private String nama_kategori;
    private KategoriBarang ktg;

    public KategoriBarang(int id_kategori, String nama_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }

    public KategoriBarang(int id_kategori) {
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
    
    public void getProduk(Barang brg) {
        System.out.println(brg.getNama_produk());
        System.out.println(brg.getHarga());
        System.out.println(brg.getExpired());
    }
}
