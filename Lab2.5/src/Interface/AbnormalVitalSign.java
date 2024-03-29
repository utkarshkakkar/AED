/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Utkarsh
 */
public class AbnormalVitalSign extends javax.swing.JPanel {

    /**
     * Creates new form AbnormalVitalSign
     */
    VitalSignHistory vsh;
    ArrayList<VitalSigns> list;
    double defaultMax;
    double defaultMin;
    private Object txtTemperature;
    private Object txtBP;
    private Object txtPulse;
    private Object txtDate;
    
    
    

    public AbnormalVitalSign(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
        this.defaultMax = defaultMax;
        
        this.defaultMin = defaultMin;
        populateTable();

          //To change body of generated methods, choose Tools | Templates.
    }

    AbnormalVitalSign(VitalSignHistory vsh, double defaultMax, double defaultMin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        detail1Button = new javax.swing.JButton();
        delete1Button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtBP1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTemperature1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPulse1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        update1Btn = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 800));

        vitalSignsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(vitalSignsTable);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Abnormal Vital Sign");

        detail1Button.setText("Details");
        detail1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detail1ButtonActionPerformed(evt);
            }
        });

        delete1Button.setText("Delete");
        delete1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ButtonActionPerformed(evt);
            }
        });

        txtBP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBP1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Pulse:");

        txtDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Bloodpressure:");

        txtTemperature1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperature1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Date: ");

        txtPulse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulse1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Temperature: ");

        update1Btn.setText("Update");
        update1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPulse1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemperature1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBP1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(139, 139, 139)
                                .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(detail1Button, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(delete1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(detail1Button)
                        .addGap(34, 34, 34)
                        .addComponent(update1Btn)
                        .addGap(33, 33, 33)
                        .addComponent(delete1Button))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPulse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(293, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detail1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detail1ButtonActionPerformed
        int selectedRow = vitalSignsTable.getSelectedRow();

        if (selectedRow >= 0) {
            VitalSigns vs = (VitalSigns) vitalSignsTable.getValueAt(selectedRow, 0);
            txtTemperature1.setText(vs.getTemperature() + "");
            txtTemperature1.setEnabled(false);
            txtBP1.setText(vs.getBloodPressure() + "");
            txtBP1.setEnabled(false);
            txtPulse1.setText(vs.getPulse() + "");
            txtPulse1.setEnabled(false);
            txtDate1.setText(vs.getDate());
            txtDate1.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_detail1ButtonActionPerformed

    private void delete1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ButtonActionPerformed
        int selectedRow = vitalSignsTable.getSelectedRow();

        if (selectedRow >= 0) {
            VitalSigns vs = (VitalSigns) vitalSignsTable.getValueAt(selectedRow, 0);
            vsh.deleteVital(vs);
            JOptionPane.showMessageDialog(null, "Vital Sign deleted.");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_delete1ButtonActionPerformed

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) vitalSignsTable.getModel();
        dtm.setRowCount(0);
        for (VitalSigns vs : vsh.getVitalSignHistory()) {
            double bp =vs.getBloodPressure();
            System.out.println(bp);
            System.out.print(defaultMax);
            System.out.print(defaultMin);
            if(bp < vsh.getMin() || bp > vsh.getMax())
            {
                
                Object row[] = new Object[2];
                row[0] = vs;
                row[1] = vs.getBloodPressure();
                dtm.addRow(row);
            }
        }
    }
    
    private void txtBP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBP1ActionPerformed

    private void txtDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate1ActionPerformed

    private void txtTemperature1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperature1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperature1ActionPerformed

    private void txtPulse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulse1ActionPerformed

    private void update1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1BtnActionPerformed
        update1Btn. setEnabled(true);
         int selectedrow = vitalSignsTable.getSelectedRow();
    if(selectedrow >=0)
     
 
    {
     VitalSigns vs = (VitalSigns)vitalSignsTable.getValueAt(selectedrow, 0);
             
     vs.setTemperature(Double.parseDouble(txtTemperature1.getText()));
     
     vs.setBloodPressure(Double.parseDouble(txtBP1.getText()));
     vs.setPulse(Integer.parseInt(txtPulse1.getText()));
     vs.setDate(txtDate1.getText());
        
        
        int selectedRow = vitalSignsTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            
        txtTemperature1.setEnabled(true);
        txtBP1.setEnabled(true);
        txtPulse1.setEnabled(true);
        txtDate1.setEnabled(true);
       
            txtTemperature1.setText(vs.getTemperature() + "");
            txtBP1.setText(vs.getBloodPressure() + "");
            txtPulse1.setText(vs.getPulse() + "");
            txtDate1.setText(vs.getDate() + "");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }             
    }//GEN-LAST:event_update1BtnActionPerformed
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete1Button;
    private javax.swing.JButton detail1Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtBP1;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtPulse1;
    private javax.swing.JTextField txtTemperature1;
    private javax.swing.JButton update1Btn;
    private javax.swing.JTable vitalSignsTable;
    // End of variables declaration//GEN-END:variables

  private void setFieldEnabled(boolean b) {
        
        txtTemperature1.setEnabled(b);
        txtBP1 .setEnabled(b);
        txtPulse1.setEnabled(b);
        txtDate1.setEnabled(b);
    }  
    
    
}

