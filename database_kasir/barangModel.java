import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class barangModel {
    private final Connection koneksi;

    public barangModel(Connection koneksi) {
        this.koneksi = DBHelper.getConnection();
    }
  
}
