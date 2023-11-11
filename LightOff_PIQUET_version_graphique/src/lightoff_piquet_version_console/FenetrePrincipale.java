/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_piquet_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author nicol
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilledeJeu grille;
    int nbCoups, nbLignes, nbColonnes, i, nbCoupsMax;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        afficherGrille(false);
    }

    public void creerGrille(int difficulte) {

        switch (difficulte) {
            case 1:
                nbLignes = nbColonnes =6;
                nbCoupsMax = 30;
                break;
            case 2:
                nbLignes = nbColonnes =8;
                nbCoupsMax = 20;
                break;
            default:
                nbLignes = nbColonnes =10;
                nbCoupsMax = 15;
                break;
        }

        this.grille = new GrilledeJeu(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, nbColonnes * 40, nbLignes * 40));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 40, 40);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        this.initialiserPartie();
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, nbColonnes * 40));
        this.pack();
        this.revalidate();
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    IncrementationEtCheckGrilleEteinte();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    IncrementationEtCheckGrilleEteinte();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);
        }
        getContentPane().add(BoutonDiagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60 + nbColonnes * 40, 20, 40, 40));
        getContentPane().add(BoutonDiagD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));
        MessagesCoupsRestants.setText("Coups restants : " + nbCoupsMax);
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    public void IncrementationEtCheckGrilleEteinte() {
        nbCoups++;
        int nbCoupsRestants = nbCoupsMax - nbCoups;
        MessagesCoupsRestants.setText("Coups restants : " + nbCoupsRestants);
        if (this.grille.cellulesToutesEteintes() == true) {
            afficherGrille(false);
            MessagesFin.setText("Bravo mon poulet t'as gagné en " + nbCoups + " coups !");
        }
        else if (nbCoupsMax == nbCoups){
            afficherGrille(false);
            MessagesFin.setText("Dommage mon poulet t'es mauvais !");
        }
    }

    public void afficherGrille(boolean etat) {
        PanneauGrille.setVisible(etat);
        PanneauBoutonsHorizontaux.setVisible(etat);
        PanneauBoutonsVerticaux.setVisible(etat);
        BoutonDiagD.setVisible(etat);
        BoutonDiagM.setVisible(etat);
        MessagesCoupsRestants.setVisible(etat);
        PanelCoupsRestants.setVisible(etat);
    }
    
    public void cacherBoutonsDifficulte(){
        btn_facile.setVisible(false);
        btn_moyen.setVisible(false);
        btn_diff.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        BoutonDiagD = new javax.swing.JButton();
        BoutonDiagM = new javax.swing.JButton();
        MessagesFin = new javax.swing.JLabel();
        PanelCoupsRestants = new javax.swing.JPanel();
        MessagesCoupsRestants = new javax.swing.JLabel();
        btn_facile = new javax.swing.JButton();
        btn_moyen = new javax.swing.JButton();
        btn_diff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(51, 153, 255));
        PanneauGrille.setAlignmentX(60.0F);
        PanneauGrille.setAlignmentY(60.0F);

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 380, 390));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 153, 153));
        PanneauBoutonsVerticaux.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 60, 40));

        BoutonDiagD.setBackground(new java.awt.Color(0, 255, 204));
        BoutonDiagD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonDiagDActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonDiagD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 40, 40));

        BoutonDiagM.setBackground(new java.awt.Color(0, 255, 204));
        BoutonDiagM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonDiagMActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonDiagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 40));
        getContentPane().add(MessagesFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 260, 300));

        PanelCoupsRestants.setBackground(new java.awt.Color(204, 204, 255));
        PanelCoupsRestants.setForeground(new java.awt.Color(255, 255, 255));
        PanelCoupsRestants.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MessagesCoupsRestants.setText("jLabel1");
        PanelCoupsRestants.add(MessagesCoupsRestants, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 26, -1, -1));

        getContentPane().add(PanelCoupsRestants, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 200, 100));

        btn_facile.setText("Facile");
        btn_facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_facile, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        btn_moyen.setText("Moyen");
        btn_moyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moyenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_moyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        btn_diff.setText("Tout dur");
        btn_diff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diffActionPerformed(evt);
            }
        });
        getContentPane().add(btn_diff, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonDiagMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonDiagMActionPerformed
        this.grille.activerDiagonaleMontante();
        nbCoups++;
        repaint();
        this.IncrementationEtCheckGrilleEteinte();
    }//GEN-LAST:event_BoutonDiagMActionPerformed

    private void BoutonDiagDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonDiagDActionPerformed
        this.grille.activerDiagonaleDescendante();
        nbCoups++;
        repaint();
        this.IncrementationEtCheckGrilleEteinte();
    }//GEN-LAST:event_BoutonDiagDActionPerformed

    private void btn_facileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facileActionPerformed
        creerGrille(1);
        afficherGrille(true);
        cacherBoutonsDifficulte();
    }//GEN-LAST:event_btn_facileActionPerformed

    private void btn_moyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moyenActionPerformed
        creerGrille(2);
        afficherGrille(true);
        cacherBoutonsDifficulte();
    }//GEN-LAST:event_btn_moyenActionPerformed

    private void btn_diffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diffActionPerformed
        creerGrille(3);
        afficherGrille(true);
        cacherBoutonsDifficulte();
    }//GEN-LAST:event_btn_diffActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    @Override
    public void pack() {
        super.pack(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonDiagD;
    private javax.swing.JButton BoutonDiagM;
    private javax.swing.JLabel MessagesCoupsRestants;
    private javax.swing.JLabel MessagesFin;
    private javax.swing.JPanel PanelCoupsRestants;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btn_diff;
    private javax.swing.JButton btn_facile;
    private javax.swing.JButton btn_moyen;
    // End of variables declaration//GEN-END:variables
}
