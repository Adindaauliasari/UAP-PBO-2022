/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_kasir;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class makananModel {
    private final Connection koneksi;

    public makananModel(Connection koneksi) {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addMakanan(makanan mkn){
        String insert = "INSERT INTO makanan(id, daya_tahan, id_kategori) VALUES "
                + "(''"+mkn.getId()+"'',''"+mkn.getDaya_tahan()+"'',''"+mkn.getKategori()+"'')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(makananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updMakanan(makanan mkn){
        String update = "UPDATE makanan SET id = ''"+mkn.getId()+"'', daya_tahan "
                + "= ''"+mkn.getDaya_tahan()+"'', id_kategori = ''"+mkn.getKategori()+"'' "
                + "WHERE id = '"+mkn.getId()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(makananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delMakanan(makanan mkn){
        String delete = "";
    }
}
