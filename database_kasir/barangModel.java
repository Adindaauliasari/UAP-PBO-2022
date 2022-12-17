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
public class barangModel {
    private final Connection koneksi;

    public barangModel(Connection koneksi) {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addBarang(barang brg){
        String insert = "INSERT INTO barang (barcode, expired, id_kategori) VALUES "
                + "('"+brg.getBarcode()+"', '"+brg.getExpired()+"', '"+brg.getKategori()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(barangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updBarang(barang brg){
        String update = "UPDATE barang SET barcode = ''"+brg.getBarcode()+"'', "
                + "expired = ''"+brg.getExpired()+"'', id_kategori = ''"+brg.getKategori()+"'' "
                + "WHERE barcode = '"+brg.getBarcode()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(barangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delBarang(barang brg){
        String delete = "DELETE FROM barang WHERE barcode = '"+brg.getBarcode()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(barangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
