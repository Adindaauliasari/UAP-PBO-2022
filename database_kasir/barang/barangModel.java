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

    public barangModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addBarang(barang brg, kategori ktg){
        String insert = "INSERT INTO `barang`(`barcode`, `expired`, `kategori_barang`, `nama_barang`, `harga`, `jumlah`, `diskon`) VALUES ('"+brg.getBarcode()+"','"+brg.getExpired()+"','"+ktg.getId_kategori()+"','"+brg.getNama_produk()+"','"+brg.getHarga()+"','"+brg.getJumlah()+"','"+brg.getDiskon()+"')";
        
        try {
            koneksi.createStatement().execute(insert);
            System.out.println("Berhasil memasukan data");
        } catch (SQLException ex) {
            Logger.getLogger(barangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukan data");
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
