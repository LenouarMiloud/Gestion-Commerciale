
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class ReglementClient extends javax.swing.JFrame {
    
    public static Connection connect;
    
    public ReglementClient() {
        initComponents();
        Actualiser(0); 
    }

    void Actualiser(int j) {
        
        DB.SelectNumClientDB();
        Client.removeAllItems();
        for(int i=0; i<DB.clients.size(); i++) {
            Client.addItem(DB.clients.get(i).getNomClient()+" "+DB.clients.get(i).getPrenom());
        }
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	DateRegclient.setText(dateFormat.format(date));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Client = new javax.swing.JComboBox<>();
        Client1 = new javax.swing.JLabel();
        Date1 = new javax.swing.JLabel();
        Especes1 = new javax.swing.JLabel();
        Cheque1 = new javax.swing.JLabel();
        NumCheque1 = new javax.swing.JLabel();
        DateRegclient = new javax.swing.JTextField();
        Especes = new javax.swing.JTextField();
        Cheque = new javax.swing.JTextField();
        NumCheque = new javax.swing.JTextField();
        EnregistrerReglement = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        ModifierReglement = new javax.swing.JButton();
        Nouveau = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reglement Client");
        setResizable(false);

        Client.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientActionPerformed(evt);
            }
        });

        Client1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Client1.setText("Client :");

        Date1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Date1.setText("Date :");

        Especes1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Especes1.setText("Especes :");

        Cheque1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Cheque1.setText("Cheque :");

        NumCheque1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        NumCheque1.setText("N° Cheque :");

        DateRegclient.setEditable(false);
        DateRegclient.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Especes.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Cheque.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        NumCheque.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        EnregistrerReglement.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        EnregistrerReglement.setText("Save");
        EnregistrerReglement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerReglementActionPerformed(evt);
            }
        });

        Retour.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-greater-than-100.png"))); // NOI18N
        Retour.setToolTipText("");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        Print.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        ModifierReglement.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ModifierReglement.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-approuver-et-mettre-à-jour-24.png")); // NOI18N
        ModifierReglement.setText("Update");
        ModifierReglement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierReglementActionPerformed(evt);
            }
        });

        Nouveau.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Nouveau.setText("New");
        Nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NouveauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Client1)
                            .addComponent(Especes1)
                            .addComponent(Date1)
                            .addComponent(Cheque1))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NumCheque1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumCheque)
                    .addComponent(Cheque)
                    .addComponent(Client, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateRegclient)
                    .addComponent(Especes))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Nouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ModifierReglement, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Retour)
                    .addComponent(Print)
                    .addComponent(EnregistrerReglement))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModifierReglement, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Client1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date1)
                            .addComponent(DateRegclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnregistrerReglement, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Especes1)
                            .addComponent(Especes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cheque1)
                            .addComponent(Cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumCheque1))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        Interface I = new Interface();
        I.show();
        this.dispose();
    }//GEN-LAST:event_RetourActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try {
            Boolean Done = DateRegclient.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FacturesClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void NouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NouveauActionPerformed
        Especes.setText("");
        Cheque.setText("");
        NumCheque.setText("");
        Client.setSelectedItem("");
    }//GEN-LAST:event_NouveauActionPerformed

    private void ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ClientActionPerformed

    private void EnregistrerReglementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerReglementActionPerformed
        // TODO add your handling code here:
        
        try {
			      Class.forName("com.mysql.jdbc.Driver").newInstance();
			      //System.out.println("Driver O.K.");

			      String url = "jdbc:mysql://localhost/gestioncommercialdb";
			      String user = "root";
			      String passwd = "";
			      
			      connect = DriverManager.getConnection(url, user, passwd);
			      //System.out.println("Connexion effective !");

			      Statement statement=connect.createStatement();  
			      statement.executeUpdate("INSERT INTO `reglementclient`("
                                      + "`Client`, `date_reglement`, `Especes`,"
                                      + " `Cheque`, `N_Cheque`) VALUES ('"
                                      +Client.getSelectedItem()+"','"+DateRegclient.getText()+"','"+Especes.getText()+"','"+Cheque.getText()+"','"
                                      +NumCheque.getText()+"');");
                            JOptionPane.showMessageDialog( null, "Succès!", 
					      "Reglement Enregistré(e)", JOptionPane.INFORMATION_MESSAGE);  
                              

			    } catch (Exception e) {

			      e.printStackTrace();

			    }
        
        
    }//GEN-LAST:event_EnregistrerReglementActionPerformed

    private void ModifierReglementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierReglementActionPerformed
        // TODO add your handling code here:
                                    JOptionPane.showMessageDialog( null, "Succès!", 
					      "Reglement modifie", JOptionPane.INFORMATION_MESSAGE);
        
               
    }//GEN-LAST:event_ModifierReglementActionPerformed

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
            java.util.logging.Logger.getLogger(ReglementClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReglementClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReglementClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReglementClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReglementClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cheque;
    private javax.swing.JLabel Cheque1;
    public static javax.swing.JComboBox<String> Client;
    private javax.swing.JLabel Client1;
    private javax.swing.JLabel Date1;
    private javax.swing.JTextField DateRegclient;
    private javax.swing.JButton EnregistrerReglement;
    private javax.swing.JTextField Especes;
    private javax.swing.JLabel Especes1;
    private javax.swing.JButton ModifierReglement;
    private javax.swing.JButton Nouveau;
    private javax.swing.JTextField NumCheque;
    private javax.swing.JLabel NumCheque1;
    private javax.swing.JButton Print;
    private javax.swing.JButton Retour;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
