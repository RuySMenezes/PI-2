/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author natan
 */
public class frmCad_Endereco extends javax.swing.JFrame {

    /**
     * Creates new form frmCad_Endereco
     */
    public frmCad_Endereco() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        pnlCima = new javax.swing.JPanel();
        lblEndereco = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        lblCadEndereco = new javax.swing.JLabel();
        lblNovoEndere = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ftxCep = new javax.swing.JFormattedTextField();
        lblEndereco2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTaxaEntrega = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblPedidos3 = new javax.swing.JLabel();
        lblCadastro3 = new javax.swing.JLabel();
        lvlRelatorios3 = new javax.swing.JLabel();
        lblCardapio3 = new javax.swing.JLabel();
        lblTelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dom Giolo - Pizzaria");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(788, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(575, 575, 575))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCima.setBackground(new java.awt.Color(255, 255, 255));
        pnlCima.setForeground(new java.awt.Color(255, 255, 255));

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(0, 102, 255));
        lblEndereco.setText("ENDEREÇO");

        jButton7.setBackground(new java.awt.Color(0, 153, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("PESQUISAR");

        btnNovo.setBackground(new java.awt.Color(0, 102, 204));
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO ENDEREÇO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCimaLayout = new javax.swing.GroupLayout(pnlCima);
        pnlCima.setLayout(pnlCimaLayout);
        pnlCimaLayout.setHorizontalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addGroup(pnlCimaLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCimaLayout.setVerticalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(23, 23, 23))
        );

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        lblCadEndereco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCadEndereco.setForeground(new java.awt.Color(0, 153, 153));
        lblCadEndereco.setText("CADASTRO ENDEREÇO");
        lblCadEndereco.setToolTipText("");

        lblNovoEndere.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNovoEndere.setText("Dados do endereço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cep:");

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBairro.setText("Bairro:");

        try {
            ftxCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndereco2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEndereco2.setText("Endereço:");

        lblTaxaEntrega.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTaxaEntrega.setText("Taxa de entrega:");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        btnCadastrar.setBackground(new java.awt.Color(0, 153, 51));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CONCLUIR CADASTRO");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EDITAR CADASTRO");

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CANCELAR CADASTRO");

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCentroLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblCadEndereco))
                            .addGroup(pnlCentroLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTaxaEntrega)
                                        .addComponent(lblEndereco2)
                                        .addComponent(jLabel3)
                                        .addComponent(lblNovoEndere)
                                        .addComponent(lblBairro)
                                        .addComponent(ftxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblCadEndereco)
                .addGap(87, 87, 87)
                .addComponent(lblNovoEndere)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBairro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEndereco2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTaxaEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblPedidos3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPedidos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lblPedidos3.setText("Pedidos");
        lblPedidos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPedidos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedidos3MouseClicked(evt);
            }
        });

        lblCadastro3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCadastro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lblCadastro3.setText("Cadastro");
        lblCadastro3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastro3MouseClicked(evt);
            }
        });

        lvlRelatorios3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lvlRelatorios3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lvlRelatorios3.setText("Relatórios");
        lvlRelatorios3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lvlRelatorios3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlRelatorios3MouseClicked(evt);
            }
        });

        lblCardapio3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCardapio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lblCardapio3.setText("Cardapio");
        lblCardapio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCardapio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCardapio3MouseClicked(evt);
            }
        });

        lblTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTelaPrincipal.setText("Tela Principal");
        lblTelaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTelaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTelaPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlRelatorios3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblCadastro3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPedidos3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCardapio3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPrincipal)
                .addGap(195, 195, 195)
                .addComponent(lblCardapio3)
                .addGap(32, 32, 32)
                .addComponent(lblPedidos3)
                .addGap(26, 26, 26)
                .addComponent(lblCadastro3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lvlRelatorios3)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPedidos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedidos3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblPedidos3MouseClicked

    private void lblCadastro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastro3MouseClicked
        // TODO add your handling code here:
        frmCadastro tela = new frmCadastro();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCadastro3MouseClicked

    private void lvlRelatorios3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlRelatorios3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lvlRelatorios3MouseClicked

    private void lblCardapio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCardapio3MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lblCardapio3MouseClicked

    private void lblTelaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelaPrincipalMouseClicked
        // TODO add your handling code here:
        frmTelaInicial tela = new frmTelaInicial();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblTelaPrincipalMouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnNovoActionPerformed

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
            java.util.logging.Logger.getLogger(frmCad_Endereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCad_Endereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCad_Endereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCad_Endereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCad_Endereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JFormattedTextField ftxCep;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCadEndereco;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCadastro1;
    private javax.swing.JLabel lblCadastro2;
    private javax.swing.JLabel lblCadastro3;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblCardapio1;
    private javax.swing.JLabel lblCardapio2;
    private javax.swing.JLabel lblCardapio3;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco2;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenu1;
    private javax.swing.JLabel lblMenu2;
    private javax.swing.JLabel lblNovoEndere;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblPedidos1;
    private javax.swing.JLabel lblPedidos2;
    private javax.swing.JLabel lblPedidos3;
    private javax.swing.JLabel lblTaxaEntrega;
    private javax.swing.JLabel lblTelaPrincipal;
    private javax.swing.JLabel lvlRelatorios;
    private javax.swing.JLabel lvlRelatorios1;
    private javax.swing.JLabel lvlRelatorios2;
    private javax.swing.JLabel lvlRelatorios3;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlCima;
    private javax.swing.JTextField txtEndereco;
    // End of variables declaration//GEN-END:variables
}