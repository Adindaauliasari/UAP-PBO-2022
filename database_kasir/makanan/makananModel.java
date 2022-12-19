package database_kasir;

import db.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MakananModel {
    private final Connection koneksi;

    public MakananModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addMakanan(Makanan mkn) {
        String insert = "INSERT INTO makanan(id, daya_tahan, kategori_makanan, "
                + "nama_makanan, harga, jumlah, diskon) VALUES ('"+mkn.getId()+"',"
                + "'"+mkn.getDaya_tahan()+"','"+mkn.getId_kategori()+"',"
                + "'"+mkn.getNama_produk()+"','"+mkn.getHarga()+"',"
                + "'"+mkn.getJumlah()+"','"+mkn.getDiskon()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updMakanan(Makanan mkn) {
        String update = "UPDATE makanan SET id='"+mkn.getId()+"',daya_tahan='"+mkn.getDaya_tahan()+"',"
                + "kategori_makanan='"+mkn.getId_kategori()+"',nama_makanan='"+mkn.getNama_produk()+"',"
                + "harga='"+mkn.getHarga()+"',jumlah='"+mkn.getJumlah()+"',"
                + "diskon='"+mkn.getDiskon()+"' WHERE id='"+mkn.getId()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delMakanan(Makanan mkn) {
        String delete = "DELETE FROM makanan WHERE id='"+mkn.getId()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Makanan> getMakanan (){
        String select = "SELECT * FROM `makanan`";
        ArrayList<Makanan> mkn = new ArrayList<Makanan>();
        
        ResultSet rs;
        try {
            rs = koneksi.createStatement().executeQuery(select);
            while(rs.next()){
                Makanan temp = new Makanan(rs.getInt("id"),rs.getDate("daya_tahan").toLocalDate(),rs.getInt("kategori_makanan"),rs.getString("nama_makanan"),rs.getDouble("harga"),rs.getInt("jumlah"),rs.getDouble("diskon"));
                mkn.add(temp);
            }
            System.out.println("Berhasil menampilkan data");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menampilkan data");
        }
        return mkn;
    }
}
