package database_kasir;

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
    public void getProduk(barang brg, kategori ktg){
        System.out.println("Nama barang: "+brg.getNama_produk());
        System.out.println("Harga barang: "+brg.getHarga());
        System.out.println("Tanggal barang expired: "+brg.getExpired());
        System.out.println("Kategori barang: "+ktg.getNama_kategori());
        System.out.println("Id kategori barang: "+ktg.getId_kategori());
        System.out.print("Status barang: ");brg.isExpired();
    }
}
