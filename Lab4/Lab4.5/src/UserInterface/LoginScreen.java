/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AEDSpring2019
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    List<User> list;
    JPanel panelRight;
    String role;
    public LoginScreen(String role, JPanel panelRight, List<User> list) {
        initComponents();
        this.list = list;
        this.panelRight = panelRight;
        this.role=role;
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPword = new javax.swing.JTextField();
        logbtn = new javax.swing.JButton();
        cmbtype = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JLabel();

        logbtn.setText("Login");
        logbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbtnActionPerformed(evt);
            }
        });

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTitle.setText("Supplier Login Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(logbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPword)
                                .addComponent(cmbtype, 0, 166, Short.MAX_VALUE))
                            .addComponent(txtTitle))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitle)
                .addGap(18, 18, 18)
                .addComponent(cmbtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logbtn)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbtnActionPerformed
        // TODO add your handling code here:
       User u = (User)cmbtype.getSelectedItem();
//        if ( list.contains(u) )
//        {
//            Supplier s = (Supplier) u;
//            if(s.verify(txtPword.getText()))
//            {
//                grantAccessTo(u);
//            }
//        }
//        else if (  )
//            else
//                JOptionPane.showMessageDialog(this, "Please enter a valid password\nEnuser ");
//            
//        }
//        
//
//        
        if(role.equalsIgnoreCase("Supplier"))
        {
            Supplier s = (Supplier) u;
            if(s.verify(txtPword.getText()))
                grantAccessTo(u);
            
            else
                JOptionPane.showMessageDialog(this, "Please enter a valid password\nEnusername ");
            
        }
        else if(role.equalsIgnoreCase("Customer"))
        {
          Customer c = (Customer) u;
          
            if(c.verify(txtPword.getText()))
                grantAccessTo(u);
            
            else
                JOptionPane.showMessageDialog(this, "Please enter a valid password\nEnusername ");
        }

        
    }//GEN-LAST:event_logbtnActionPerformed
    
    private void grantAccessTo(User u)
    {
       SuccessScreen ss = new SuccessScreen(u);
       CardLayout layout = (CardLayout)panelRight.getLayout();
       panelRight.add(ss);
       layout.next(panelRight);
               
    }
    
    private void initialize(){
        //text should either be "Supplier Login Screen" OR "Customer Login Screen"
        //Based on the selection
        txtTitle.setText("Supplier Login Screen");
        cmbtype.removeAllItems();
        if(role.equalsIgnoreCase("Supplier"))
        {
            txtTitle.setText("Supplier Login Screen");
            cmbtype.removeAllItems();
            for (User u:list)
        {
            cmbtype.addItem(u);
        }
        }
        else if(role.equalsIgnoreCase("Customer"))
        {
            txtTitle.setText("Customer Login Screen");
            cmbtype.removeAllItems();
            for (User u:list)
        {
            cmbtype.addItem(u);
        }  
        }

        
        
        //only customer or suppliers should be listed based on the selection
//        comboUser.removeAllItems();
//        for (User u:list)
//        {
//            comboUser.addItem(u);
//        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cmbtype;
    private javax.swing.JButton logbtn;
    private javax.swing.JTextField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
