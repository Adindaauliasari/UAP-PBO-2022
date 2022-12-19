package database_kasir;

import database_kasir.Barang.*;
import database_kasir.Produk.*;
import database_kasir.MakananController.*;
import database_kasir.*;
import java.io.IOException;
import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BarangController {

    @FXML
    private Button btnHapusBrg;

    @FXML
    private Button btnKategoriBrg;

    @FXML
    private Button btnMakanan;

    @FXML
    private Button btnPenjualanBrg;

    @FXML
    private Button btnTambahBrg;

    @FXML
    private Button btnUbahBrg;

    @FXML
    private Text txtHome;
    
    @FXML
    private TableView<Barang> tblBarang;
    
    @FXML
    private TableColumn<Barang, String> tblBarcode;

    @FXML
    private TableColumn<Barang, Double> tblDiskon;

    @FXML
    private TableColumn<Barang, LocalDate> tblExpired;

    @FXML
    private TableColumn<Barang, Double> tblHarga;

    @FXML
    private TableColumn<Barang, Integer> tblJumlah;

    @FXML
    private TableColumn<Barang, Integer> tblKategori;

    @FXML
    private TableColumn<Barang, String> tblNamaBarang;

    @FXML
    void hapusBrgMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HapusBrg.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnHapusBrg.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void homeMenu(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) txtHome.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void kategoriBrgMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("KategoriBrg.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnKategoriBrg.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void makananMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Makanan.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnMakanan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void penjualanBrgMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PenjualanBrg.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnPenjualanBrg.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void tambahBrgMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TambahBrg.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnTambahBrg.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void ubahBrgMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UbahBrg.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnUbahBrg.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    void showValue(){
        BarangModel brgm = new BarangModel();
        tblBarcode.setCellValueFactory(new PropertyValueFactory<>("barcode"));
        tblDiskon.setCellValueFactory(new PropertyValueFactory<>("diskon"));
        tblExpired.setCellValueFactory(new PropertyValueFactory<>("expired"));
        tblHarga.setCellValueFactory(new PropertyValueFactory<>("harga"));
        tblJumlah.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
        tblKategori.setCellValueFactory(new PropertyValueFactory<>("kategori_barang"));
        tblNamaBarang.setCellValueFactory(new PropertyValueFactory<>("nama_barang"));
        
        tblBarang.setItems(brgm.getBarang());
    }


}
