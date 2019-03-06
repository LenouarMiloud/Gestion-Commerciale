
import java.awt.print.PrinterException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class ReglementFournisseur extends javax.swing.JFrame {

    
    public ReglementFournisseur() {
        initComponents();
        Actualiser(0);
    }

        void Actualiser(int j) {
        
        DB.SelectNumFournisseurDB();
        Fournisseur.removeAllItems();
        for(int i=0; i<DB.fournisseurs.size(); i++) {
            Fournisseur.addItem(DB.fournisseurs.get(i).getNom()+" "+DB.fournisseurs.get(i).getPrenom());
        }
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	Date.setText(dateFormat.format(date));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Fournisseur = new javax.swing.JComboBox<>();
        Fournisseur1 = new javax.swing.JLabel();
        Date1 = new javax.swing.JLabel();
        Especes1 = new javax.swing.JLabel();
        Cheque1 = new javax.swing.JLabel();
        NumCheque1 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Especes = new javax.swing.JTextField();
        Cheque = new javax.swing.JTextField();
        NumCheque = new javax.swing.JTextField();
        EnregistrerReglement = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        Imprimer = new javax.swing.JButton();
        ModifierReglement = new javax.swing.JButton();
        Nouveau = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reglement Fournisseur");
        setResizable(false);

        Fournisseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        Fournisseur1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Fournisseur1.setText("Fournisseur :");

        Date1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Date1.setText("Date :");

        Especes1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Especes1.setText("Especes :");

        Cheque1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Cheque1.setText("Cheque :");

        NumCheque1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        NumCheque1.setText("N° Cheque :");

        Date.setEditable(false);
        Date.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Especes.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Cheque.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        NumCheque.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        EnregistrerReglement.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        EnregistrerReglement.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-enregistrer-sous-26.png")); // NOI18N
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

        Imprimer.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Imprimer.setText("Print");
        Imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimerActionPerformed(evt);
            }
        });

        ModifierReglement.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ModifierReglement.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-approuver-et-mettre-à-jour-24.png")); // NOI18N
        ModifierReglement.setText("Update");

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
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fournisseur1)
                    .addComponent(Especes1)
                    .addComponent(Date1)
                    .addComponent(Cheque1)
                    .addComponent(NumCheque1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumCheque)
                    .addComponent(Cheque)
                    .addComponent(Fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date)
                    .addComponent(Especes))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nouveau, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(ModifierReglement, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(Imprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnregistrerReglement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Retour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(Fournisseur1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date1)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimerActionPerformed
        try {
            Boolean Done = Date.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FacturesClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImprimerActionPerformed

    private void NouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NouveauActionPerformed
        Especes.setText("");
        Cheque.setText("");
        NumCheque.setText("");
        Fournisseur.setSelectedItem("");
    }//GEN-LAST:event_NouveauActionPerformed

    private void EnregistrerReglementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerReglementActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EnregistrerReglementActionPerformed

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
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Date1;
    private javax.swing.JButton EnregistrerReglement;
    private javax.swing.JTextField Especes;
    private javax.swing.JLabel Especes1;
    public static javax.swing.JComboBox<String> Fournisseur;
    private javax.swing.JLabel Fournisseur1;
    private javax.swing.JButton Imprimer;
    private javax.swing.JButton ModifierReglement;
    private javax.swing.JButton Nouveau;
    private javax.swing.JTextField NumCheque;
    private javax.swing.JLabel NumCheque1;
    private javax.swing.JButton Retour;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
