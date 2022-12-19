/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_kasir;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A C E R
 */
public class kategoriModel {
    private final Connection koneksi;

    public kategoriModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addKategori(kategori ktg){
        String insert ="INSERT INTO kategori (id_kategori, nama_kategori) values "
                + "('"+ktg.getId_kategori()+"', '"+ktg.getNama_kategori()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(kategoriModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updKategori(kategori ktg){
        String update ="UPDATE kategori SET nama_kategori = '"+ktg.getNama_kategori()+"' "
                + "WHERE id_kategori = '"+ktg.getId_kategori()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(kategoriModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delKategori(kategori ktg){
        String delete = "DELETE FROM kategori WHERE id_kategori = '"+ktg.getId_kategori()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(kategoriModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
