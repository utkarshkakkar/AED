/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import Business.ProductDirectory;
import Business.Product;
import javax.swing.JPanel;
import java.awt.CardLayout;
/**
 *
 * @author Utkarsh
 */
public class CreateProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccontJPanel
     */
    private ProductDirectory prodDir;
    private JPanel panel;
    
    public CreateProductJPanel(ProductDirectory prodDir, JPanel panel) {
        initComponents();
        this.prodDir = prodDir;
        this.panel=panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 51));

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("Create Product");

        lblRoutingNo.setText("Product Name*");

        lblAccNo.setText("Availiblity*");

        lblBankName.setText("Price*");

        lblBalance.setText("Description");

        btnCreate.setText("Add Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        backButton.setText("<- Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoutingNo)
                            .addComponent(lblAccNo)
                            .addComponent(lblBankName)
                            .addComponent(lblBalance))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAvailablity, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(txtDescription)
                            .addComponent(txtProdName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(backButton)
                        .addGap(52, 52, 52)
                        .addComponent(lblHead)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblHead))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNo)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String priceText = txtPrice.getText();
        double price =0;
        try
        {
            price =Double.parseDouble(priceText);
        }catch(NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please Enter Valid Price");
            return;
        }
                     
           int availability;
           try
           {
               availability =  Integer.parseInt(txtAvailablity.getText());
           }catch(NumberFormatException e){
                e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please Enter Available Quantity");
               return;
           }
           
           String prodName = "";
            try{
                 String temp = txtProdName.getText();
                    if(temp.length()== 0 || temp==null){                         
                    throw new RuntimeException("Please enter Prod Name");                   
                }
                    else{
                        prodName = temp;
                    }
            }catch(RuntimeException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
                return;
                }
           
            String description = "";
            try{
                 String temp = txtDescription.getText();
                    if(temp.length()== 0 || temp==null){                         
                    throw new RuntimeException("Please enter Description");                   
                }
                    else{
                        description = temp;
                    }
            }catch(RuntimeException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
                return;
                }
         
           if(prodDir.getProductDirectory().size()>=0){
                for(Product p : prodDir.getProductDirectory()) {
                 if (p.getName().equals(txtProdName.getText())) {
                 JOptionPane.showMessageDialog(null, "Please enter valid Name as user already exist");
                    return;
                }
            }
           }

            
            Integer.parseInt(txtAvailablity.getText());
            Product prod = prodDir.addProduct();
            prod.setName(prodName);
            prod.setAvailNum(availability);
            prod.setPrice(price);
            prod.setDescription(description);
            
            JOptionPane.showMessageDialog(null, "Product Added Successfully");
            
            txtProdName.setText("");
            txtAvailablity.setText("");
            txtPrice.setText("");
            txtDescription.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.panel.remove(this);
        CardLayout layout =(CardLayout) this.panel.getLayout();
        layout.previous(panel);
        
        
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
