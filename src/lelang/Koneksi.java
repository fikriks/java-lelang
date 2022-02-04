/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author ERPEEL
 */
public class Koneksi {
    public Connection con;
    public Statement stat;
    
    private String db = "DB", user = "root", pass = "";
   
    public Koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+db,user,pass);
            stat = con.createStatement();
            System.out.println("Sukses");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }
}
