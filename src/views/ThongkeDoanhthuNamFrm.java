/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.KhoangThoigian;
import model.ThongkeDoanhthu;

/**
 *
 * @author tienduongvan
 */
public class ThongkeDoanhthuNamFrm extends javax.swing.JFrame {

    /**
     * Creates new form ThongkeDoanhthuNamFrm
     */
    public ThongkeDoanhthuNamFrm() {
        initComponents();
    }
    
    public void tblHienthiTKDTNam(ArrayList<ThongkeDoanhthu> datas) {
        int rowCount = tblThongkeDoanhthuNam.getModel().getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblThongkeDoanhthuNam.getModel();
        if (rowCount > 0) {
            for (int i = 0; i < rowCount; i++) {
                model.removeRow(0);
            }
        }
        Object[] row = new Object[3];
        for (int i = 1; i < datas.size(); i++) {
            row[0] = i;
            row[1] = datas.get(i).getTenThongke();
            row[2] = datas.get(i).getDoanhthu();
            model.addRow(row);
        }
    }

    public void btnThongkeNamSubmitListener(ActionListener log) {
        btnThongkeNam.addActionListener(log);
    }
    
    public void btnInbaocaoThongkeNamSubmitListener(ActionListener log) {
        btnInbaocaoThongkeNam.addActionListener(log);
    }
    
    public void btnPieChartThongkeNamSubmitListener(ActionListener log) {
        btnPieChartThongkeNam.addActionListener(log);
    }
    
    public void btnBarChartThongkeNamSubmitListener(ActionListener log) {
        btnBarChartThongkeNam.addActionListener(log);
    }
    
    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
    
    public KhoangThoigian getKhoangThoigian() {
        String tungay = tfTungay.getText().toString();
        String denngay = tfDenngay.getText().toString();
        return (new KhoangThoigian(tungay, denngay));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnBarChartThongkeNam = new javax.swing.JButton();
        btnInbaocaoThongkeNam = new javax.swing.JButton();
        btnPieChartThongkeNam = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnThongkeNam = new javax.swing.JButton();
        btnLammoiThongkeNam = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        tfTungay = new javax.swing.JTextField();
        tfDenngay = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThongkeDoanhthuNam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê doanh thu theo năm"));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBarChartThongkeNam.setText("Xem biểu đồ BarChart");
        btnBarChartThongkeNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarChartThongkeNamActionPerformed(evt);
            }
        });

        btnInbaocaoThongkeNam.setText("In báo cáo");

        btnPieChartThongkeNam.setText("Xem biểu đồ PieChart");
        btnPieChartThongkeNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPieChartThongkeNamActionPerformed(evt);
            }
        });

        jLabel1.setText("Từ ngày");

        jLabel2.setText("Đến ngày");

        btnThongkeNam.setText("Thống kê");
        btnThongkeNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongkeNamActionPerformed(evt);
            }
        });

        btnLammoiThongkeNam.setText("Làm mới");
        btnLammoiThongkeNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiThongkeNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfDenngay)
                                .addComponent(btnThongkeNam, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(btnLammoiThongkeNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfTungay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInbaocaoThongkeNam, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBarChartThongkeNam, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPieChartThongkeNam, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTungay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDenngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnThongkeNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLammoiThongkeNam)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPieChartThongkeNam)
                .addGap(32, 32, 32)
                .addComponent(btnBarChartThongkeNam)
                .addGap(30, 30, 30)
                .addComponent(btnInbaocaoThongkeNam)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tblThongkeDoanhthuNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "          STT", "          Tháng", "        Doanh thu"
            }
        ));
        tblThongkeDoanhthuNam.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(tblThongkeDoanhthuNam);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBarChartThongkeNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarChartThongkeNamActionPerformed

    }//GEN-LAST:event_btnBarChartThongkeNamActionPerformed

    private void btnPieChartThongkeNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPieChartThongkeNamActionPerformed

    }//GEN-LAST:event_btnPieChartThongkeNamActionPerformed

    private void btnThongkeNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongkeNamActionPerformed

    }//GEN-LAST:event_btnThongkeNamActionPerformed

    private void btnLammoiThongkeNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiThongkeNamActionPerformed
        tfTungay.setText("");
        tfDenngay.setText("");
    }//GEN-LAST:event_btnLammoiThongkeNamActionPerformed

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
            java.util.logging.Logger.getLogger(ThongkeDoanhthuNamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongkeDoanhthuNamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongkeDoanhthuNamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongkeDoanhthuNamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongkeDoanhthuNamFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarChartThongkeNam;
    private javax.swing.JButton btnInbaocaoThongkeNam;
    private javax.swing.JButton btnLammoiThongkeNam;
    private javax.swing.JButton btnPieChartThongkeNam;
    private javax.swing.JButton btnThongkeNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblThongkeDoanhthuNam;
    private javax.swing.JTextField tfDenngay;
    private javax.swing.JTextField tfTungay;
    // End of variables declaration//GEN-END:variables
}