import java.util.ArrayList;

public class barang extends produk {
    private String barcode;
    private String expired;
    private ArrayList <kategori> kategori;

    public barang(String barcode, String expired, ArrayList<kategori> kategori, String nama_produk, double harga, int jumlah, double diskon) {
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

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
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

    public void  isExpired(){
        
    }
    
    public int addKategori(kategori ktg){
        return ktg.getId_kategori();
    }
}
