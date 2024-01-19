/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoran;
//libraby koneksi
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Amelia
 */
public class koneksi {
    //variabel koneksi
     Connection Koneksi=null;

    public static Connection koneksiDb() // method KoneksiDb untuk mendapatkan koneksi
    {
        try{
            String url="jdbc:mysql://localhost/restoran"; // nama database
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");     // nama driver MySQL
            Connection koneksi=DriverManager.getConnection(url,user,pass);  // membuat koneksi
            return koneksi;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e); // menampilkan perintah jika koneksi gagal
            return null;
        }
    
    }
}