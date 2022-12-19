package database_kasir;

import db.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BarangModel {
    private final Connection koneksi;

    public BarangModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addBarang(Barang brg) {
        String insert = "INSERT INTO barang(barcode, expired, kategori_barang, "
                + "nama_barang, harga, jumlah, diskon) VALUES ('"+brg.getBarcode()+"',"
                + "'"+brg.getExpired()+"','"+brg.getId_kategori()+"',"
                + "'"+brg.getNama_produk()+"','"+brg.getHarga()+"',"
                + "'"+brg.getJumlah()+"','"+brg.getDiskon()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updBarang(Barang brg) {
        String update = "UPDATE barang SET barcode='"+brg.getBarcode()+"',"
                + "expired='"+brg.getExpired()+"',kategori_barang='"+brg.getId_kategori()+"',"
                + "nama_barang='"+brg.getNama_produk()+"',harga='"+brg.getHarga()+"',"
                + "jumlah='"+brg.getJumlah()+"',diskon='"+brg.getDiskon()+"' "
                + "WHERE barcode='"+brg.getBarcode()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delBarang(Barang brg) {
        String delete = "DELETE FROM barang WHERE barcode='"+brg.getBarcode()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Barang> getBarang (){
        String select = "SELECT * FROM `barang`";
        ArrayList<Barang> brg = new ArrayList<Barang>();
        
        ResultSet rs;
        try {
            rs = koneksi.createStatement().executeQuery(select);
            while(rs.next()){
                Barang temp = new Barang(rs.getString("barcode"),rs.getDate("expired").toLocalDate(),rs.getInt("kategori_barang"),rs.getString("nama_barang"),rs.getDouble("harga"),rs.getInt("jumlah"),rs.getDouble("diskon"));
                brg.add(temp);
            }
            System.out.println("Berhasil menampilkan data");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menampilkan data");
        }
        return brg;
    }
}
