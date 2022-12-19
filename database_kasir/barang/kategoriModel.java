package database_kasir;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class KategoriBarangModel {
    private final Connection koneksi;

    public KategoriBarangModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addKategori(KategoriBarang ktg){
        String insert ="INSERT INTO kategori_barang(id_kategori, nama_kategori) values "
                + "('"+ktg.getId_kategori()+"','"+ktg.getNama_kategori()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updKategori(KategoriBarang ktg){
        String update ="UPDATE kategori_barang SET nama_kategori = '"+ktg.getNama_kategori()+"' "
                + "WHERE id_kategori='"+ktg.getId_kategori()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delKategori(KategoriBarang ktg){
        String delete = "DELETE FROM kategori_barang WHERE id_kategori='"+ktg.getId_kategori()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<KategoriBarang> getKategori (){
        String select = "SELECT * FROM `kategori_barang`";
        ArrayList<KategoriBarang> ktg = new ArrayList<KategoriBarang>();
        
        ResultSet rs;
        try {
            rs = koneksi.createStatement().executeQuery(select);
            while(rs.next()){
                KategoriBarang temp = new KategoriBarang(rs.getInt("id_kategori"),rs.getString("nama_kategori"));
                ktg.add(temp);
            }
            System.out.println("Berhasil menampilkan data");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menampilkan data");
        }
        return ktg;
    }
}
