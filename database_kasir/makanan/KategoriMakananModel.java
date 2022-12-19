/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_kasir;

import db.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class KategoriMakananModel {
    private final Connection koneksi;

    public KategoriMakananModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addKategori(KategoriMakanan ktg) {
        String insert = "INSERT INTO kategori_makanan(id_kategori, nama_kategori) "
                + "VALUES ('"+ktg.getId_kategori()+"','"+ktg.getNama_kategori()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(KategoriMakananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updKategori(KategoriMakanan ktg) {
        String update = "UPDATE kategori_makanan SET id_kategori='"+ktg.getId_kategori()+"',"
                + "nama_kategori='"+ktg.getNama_kategori()+"' WHERE "
                + "id_kategori='"+ktg.getId_kategori()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(KategoriMakananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delKategori(KategoriMakanan ktg) {
        String delete = "DELETE FROM kategori_makanan WHERE id_kategori='"+ktg.getId_kategori()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(KategoriMakananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<KategoriMakanan> getKategori (){
        String select = "SELECT * FROM `kategori_makanan`";
        ArrayList<KategoriMakanan> ktg = new ArrayList<KategoriMakanan>();
        
        ResultSet rs;
        try {
            rs = koneksi.createStatement().executeQuery(select);
            while(rs.next()){
                KategoriMakanan temp = new KategoriMakanan(rs.getInt("id_kategori"),rs.getString("nama_kategori"));
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
