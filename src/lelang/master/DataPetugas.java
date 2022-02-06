/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang.master;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import lelang.*;
import lelang.menu.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class DataPetugas extends javax.swing.JFrame {
    private Connection con;
    private ResultSet rs;
    private Statement stat;
    private String sql;
    private Koneksi kon = new Koneksi();
    private DefaultTableModel model;
    
    /**
     * Creates new form DataPengguna
     */
    public DataPetugas() {
        initComponents();
        setLocationRelativeTo(this);
        
        con = kon.con;
        stat = kon.stat;
        setTitle("Data Petugas");
        aturTable();
        sembunyiCRUD();
        dataCB();
        
        jTextField2.setEditable(false);
        jTextField3.requestFocus();
        jLabel7.setVisible(false);
    }
    
    private void dataCB(){
        jComboBox1.removeAllItems();
        String[] data = {"-- Pilih --", "Administrator","Kasir"};
        for(String a : data){
           jComboBox1.addItem(a); 
        }
    }
    
    private void sembunyi()
    {
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jPasswordField1.setEnabled(false);
        jComboBox1.setEnabled(false);
    }
    
    private void sembunyiCRUD(){
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }
    
    private void tampil(){
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jPasswordField1.setEnabled(true);
        jComboBox1.setEnabled(true);
    }
    
    private void tampilCRUD(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }
    
    private void reset(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jPasswordField1.setText("");
        jComboBox1.removeAllItems();
    }
    
    private void aturTable(){
        String[] judul = {"ID Petugas", "Nama Petugas", "Username", "Hak Akses"};
        model = new DefaultTableModel(null, judul){
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        jTable1.setModel(model);
        
        try{
            sql = "SELECT * FROM tb_petugas INNER JOIN tb_level ON tb_petugas.id_level = tb_level.id_level";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                Object[] isi = {rs.getString("id_petugas"),rs.getString("nama_petugas"),rs.getString("username"),rs.getString("level").substring(0,1).toUpperCase() + rs.getString("level").substring(1)};
                model.addRow(isi);
            }
            
            ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            jTable1.setModel(model);
            
            DefaultTableCellRenderer render = new DefaultTableCellRenderer();
            render.setHorizontalAlignment(JLabel.CENTER);
            jTable1.getColumnModel().getColumn(0).setCellRenderer(render);
            jTable1.getColumnModel().getColumn(1).setCellRenderer(render);
            jTable1.getColumnModel().getColumn(2).setCellRenderer(render);
            jTable1.getColumnModel().getColumn(3).setCellRenderer(render);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"gagal"+e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Petugas");

        jLabel5.setText("ID Petugas");

        jLabel2.setText("Nama Petugas");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel6.setText("Hak Akses");

        jLabel7.setText("* Kosongkan jika tidak ingin diubah");

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton3)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton4)
                                .addGap(186, 186, 186)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField3.getText().isEmpty() || jTextField1.getText().isEmpty() || jPasswordField1.getText().isEmpty() || jComboBox1.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Ada data yang belum di isi","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
                   sql = "INSERT INTO tb_petugas VALUES ("+ null +",'"+ jTextField3.getText() +"','"+ jTextField1.getText() +"','"+ jPasswordField1.getText() +"', '"+ jComboBox1.getSelectedIndex() +"')";
                   stat.execute(sql);
                   JOptionPane.showMessageDialog(null, "Sukses tambah data");

                   model.fireTableDataChanged();
                   model.getDataVector().removeAllElements();

                   aturTable();
                   reset();
                   sembunyiCRUD();
                   jLabel7.setVisible(false);
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, e.getMessage());
               }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTextField3.getText().isEmpty() || jTextField1.getText().isEmpty() || jComboBox1.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Ada data yang belum di isi","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
                   if(jPasswordField1.getText().isEmpty()){
                       sql = "UPDATE tb_petugas SET nama_petugas='"+ jTextField3.getText() +"', username='"+ jTextField1.getText() +"', id_level'"+ jComboBox1.getSelectedIndex() +"' WHERE id_petugas='"+ jTextField2.getText() +"'";
                   }else{
                       sql = "UPDATE tb_petugas SET nama_petugas='"+ jTextField3.getText() +"', username='"+ jTextField1.getText() +"', password='"+ jPasswordField1.getText() +"', id_level'"+ jComboBox1.getSelectedIndex() +"' WHERE id_petugas='"+ jTextField2.getText() +"'";
                   }
                   stat.execute(sql);
                   JOptionPane.showMessageDialog(null, "Sukses edit data");

                   model.fireTableDataChanged();
                   model.getDataVector().removeAllElements();

                   aturTable();
                   reset();
                   sembunyiCRUD();
                   jLabel7.setVisible(false);
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, e.getMessage());
               }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            try{
                   sql = "DELETE FROM tb_petugas WHERE id_petugas='"+ jTextField2.getText() +"'";
                   stat.execute(sql);
                   JOptionPane.showMessageDialog(null, "Sukses hapus data");

                   model.fireTableDataChanged();
                   model.getDataVector().removeAllElements();

                   aturTable();
                   reset();
                   sembunyiCRUD();
                   jLabel7.setVisible(false);
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, e.getMessage());
               }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            sql = "SELECT * FROM tb_petugas INNER JOIN tb_level ON tb_petugas.id_level=tb_level.id_level WHERE id_petugas='"+jTable1.getValueAt(jTable1.getSelectedRow(),0)+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                jTextField2.setText(rs.getString("id_petugas"));
                jTextField3.setText(rs.getString("nama_petugas"));
                jTextField1.setText(rs.getString("username"));
                jComboBox1.setSelectedIndex(rs.getInt("id_level"));
                
                tampilCRUD();
                jLabel7.setVisible(true);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Admin().show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
