package fr.uga.iut2.genconf.vue;

import java.awt.Color;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.swing.JSpinner;
import org.apache.commons.validator.routines.EmailValidator;


public class VueCreationSession extends javax.swing.JPanel {
    private final GUI gui;
    private Set<String> nomsExistants;
    private boolean valideAdmin, valideConf;

    /**
     * Creates new form VueCreationConference
     */
    public VueCreationSession(GUI gui) {
        this.gui = gui;
        this.nomsExistants = new HashSet<>();
        this.valideAdmin = false;
        this.valideConf = false;

        // création de l'interface générée
        this.initComponents();

        // configuration des composants de l'interface (à faire après la création de l'interface)
        // format de date
        JSpinner.DateEditor editor = new JSpinner.DateEditor(
                this.dateDebut,
                "yyyy-MM-dd"
        );
        this.dateDebut.setEditor(editor);
        // désactivation du bouton de création
        this.creerButton.setEnabled(false);
    }

    public void setNomsExistants(final Set<String> nomsExistants) {
        assert nomsExistants != null;
        this.nomsExistants = nomsExistants;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomConference = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nbJours = new javax.swing.JSpinner();
        dateDebut = new javax.swing.JSpinner();
        saisieAdminPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminNom = new javax.swing.JTextField();
        adminPrenom = new javax.swing.JTextField();
        adminEmail = new javax.swing.JTextField();
        creerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conférence"));

        jLabel1.setText("Nom de la conférence :");

        nomConference.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verificationConference(evt);
            }
        });

        jLabel2.setText("Date de début :");

        jLabel3.setText("Durée (jour) :");

        nbJours.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        dateDebut.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nbJours, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 240, Short.MAX_VALUE))
                            .addComponent(nomConference))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomConference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbJours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        saisieAdminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Administra·teur/trice"));

        jLabel4.setText("Nom :");

        jLabel5.setText("Prénom :");

        jLabel6.setText("Email :");

        adminNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificationAdmin(evt);
            }
        });

        adminPrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificationAdmin(evt);
            }
        });

        adminEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificationAdmin(evt);
            }
        });

        javax.swing.GroupLayout saisieAdminPanelLayout = new javax.swing.GroupLayout(saisieAdminPanel);
        saisieAdminPanel.setLayout(saisieAdminPanelLayout);
        saisieAdminPanelLayout.setHorizontalGroup(
            saisieAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saisieAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saisieAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(saisieAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminNom, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(adminPrenom)
                    .addComponent(adminEmail))
                .addContainerGap())
        );
        saisieAdminPanelLayout.setVerticalGroup(
            saisieAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saisieAdminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(saisieAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(adminNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(saisieAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adminPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(saisieAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(adminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        creerButton.setText("Créer");
        creerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creerButtonActionPerformed(evt);
            }
        });

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Créer une conférence");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saisieAdminPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(annulerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saisieAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerButton)
                    .addComponent(creerButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void creerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creerButtonActionPerformed
         IHM.InfosUtilisateur admin = new IHM.InfosUtilisateur(
                this.adminEmail.getText().trim().toLowerCase(),
                this.adminNom.getText().trim(),
                this.adminPrenom.getText().trim()
         );

         // Traitement des dates de début et fin
         Date debut = (Date) this.dateDebut.getModel().getValue();
         LocalDate dateDebut = Instant.ofEpochMilli(debut.getTime())
                                      .atZone(ZoneId.systemDefault())
                                      .toLocalDate();
         LocalDate dateFin = dateDebut.plusDays((Integer) nbJours.getValue() - 1);

         // Infos sur la nouvelle conference
         IHM.InfosNouvelleConference nlleConf = new IHM.InfosNouvelleConference(
                 this.nomConference.getText(),
                 dateDebut,
                 dateFin,
                 admin
         );

         this.gui.creerConference(Optional.of(nlleConf));
    }//GEN-LAST:event_creerButtonActionPerformed

    private void verificationAdmin(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificationAdmin
        boolean validEmail;
        String nom, prenom;
        EmailValidator validator = EmailValidator.getInstance(false, false);

        nom = this.adminNom.getText().trim();
        prenom = this.adminPrenom.getText().trim();
        validEmail = validator.isValid(this.adminEmail.getText().trim().toLowerCase());
        this.adminEmail.setForeground(validEmail ? Color.black : Color.red);

        this.valideAdmin = validEmail
                 && (nom != null) && (nom.length() > 0)
                 && (prenom != null) && (prenom.length() > 0);

        this.creerButton.setEnabled(this.valideAdmin && this.valideConf);
    }//GEN-LAST:event_verificationAdmin

    private void verificationConference(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificationConference
         this.valideConf = !nomsExistants.contains(nomConference.getText());
         this.nomConference.setForeground(this.valideConf ? Color.black : Color.red);
         this.creerButton.setEnabled(this.valideAdmin && this.valideConf);
    }//GEN-LAST:event_verificationConference

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        this.gui.creerConference(Optional.empty());
    }//GEN-LAST:event_annulerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminEmail;
    private javax.swing.JTextField adminNom;
    private javax.swing.JTextField adminPrenom;
    private javax.swing.JButton annulerButton;
    private javax.swing.JButton creerButton;
    private javax.swing.JSpinner dateDebut;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner nbJours;
    private javax.swing.JTextField nomConference;
    private javax.swing.JPanel saisieAdminPanel;
    // End of variables declaration//GEN-END:variables
}
