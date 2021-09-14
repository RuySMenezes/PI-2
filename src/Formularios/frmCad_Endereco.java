/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author natan
 */
public class frmCad_Endereco extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    public frmCad_Endereco() {
        initComponents();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root","");
            st = (Statement)con.createStatement();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não, Conectado");
        }
        Listar();
    }
    
     private void Listar(){
    try {
            DefaultTableModel modelo = (DefaultTableModel) jtEndereco.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM endereco";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                
                String cep = (rs.getString("cep"));
                String bairro = (rs.getString("bairro"));
                String endereco = (rs.getString("nome"));
                String taxa = (rs.getString("taxa"));
                
                modelo.addRow(new Object[]{cep,bairro,endereco,taxa});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    
    }
     private void Limpar(){
        txtBairro.setText("");
        txtCep.setText("");
        txtEndereco.setText("");
        txtTaxa.setText("");
                 
     }
     private void Sumir(){
        txtEndereco.setVisible(false);
        txtCep.setVisible(false);
        txtBairro.setVisible(false);
        txtTaxa.setVisible(false);
        lblBairro.setVisible(false);
        lblCep.setVisible(false);
        lblEndereco.setVisible(false);
        lblTaxa.setVisible(false);
        lblCadEndereco.setVisible(false);
        lblNovoEndere.setVisible(false);
     }
     private void Aparecer(){
        txtBairro.setVisible(true);
        txtCep.setVisible(true);
        txtEndereco.setVisible(true);
        txtTaxa.setVisible(true);
        lblBairro.setVisible(true);
        lblCep.setVisible(true);
        lblEndereco.setVisible(true);
        lblTaxa.setVisible(true);
        lblCadEndereco.setVisible(true);
        lblNovoEndere.setVisible(true);
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
        lblTitulo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEndereco = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        pnlCentro = new javax.swing.JPanel();
        lblCadEndereco = new javax.swing.JLabel();
        lblNovoEndere = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTaxa = new javax.swing.JLabel();
        txtTaxa = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblPedidos = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        lblCardapio = new javax.swing.JLabel();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 255));
        lblTitulo.setText("ENDEREÇO");

        btnNovo.setBackground(new java.awt.Color(0, 102, 204));
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO ENDEREÇO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CEP:");

        jtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEP", "Bairro", "Endereço", "Taxa"
            }
        ));
        jtEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEnderecoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEndereco);

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCimaLayout = new javax.swing.GroupLayout(pnlCima);
        pnlCima.setLayout(pnlCimaLayout);
        pnlCimaLayout.setHorizontalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(pnlCimaLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCimaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        pnlCimaLayout.setVerticalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        lblCadEndereco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCadEndereco.setForeground(new java.awt.Color(0, 153, 153));
        lblCadEndereco.setText("CADASTRO ENDEREÇO");
        lblCadEndereco.setToolTipText("");

        lblNovoEndere.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNovoEndere.setText("Dados do endereço:");

        lblCep.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCep.setText("Cep:");

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBairro.setText("Bairro:");

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEndereco.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTaxa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTaxa.setText("Taxa de entrega:");

        txtTaxa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtTaxa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        jButton6.setText("EXCLUIR CADASTRO");

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addComponent(lblCadEndereco)
                        .addGap(1039, 1039, 1039))
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNovoEndere))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaxa))
                        .addGap(307, 307, 307))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBairro)
                    .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(460, 460, 460)))))
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblCadEndereco)
                .addGap(26, 26, 26)
                .addComponent(lblNovoEndere)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblBairro)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCep)
                        .addGap(18, 18, 18)))
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(lblTaxa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblPedidos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lblPedidos.setText("Pedidos");
        lblPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedidosMouseClicked(evt);
            }
        });

        lblCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lblCadastro.setText("Cadastro");
        lblCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroMouseClicked(evt);
            }
        });

        lblRelatorios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lblRelatorios.setText("Relatórios");
        lblRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatoriosMouseClicked(evt);
            }
        });

        lblCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/C.PNG"))); // NOI18N
        lblCardapio.setText("Cardapio");
        lblCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCardapioMouseClicked(evt);
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
                    .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPrincipal)
                .addGap(195, 195, 195)
                .addComponent(lblCardapio)
                .addGap(32, 32, 32)
                .addComponent(lblPedidos)
                .addGap(26, 26, 26)
                .addComponent(lblCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRelatorios)
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
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCima, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedidosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblPedidosMouseClicked

    private void lblCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroMouseClicked
        // TODO add your handling code here:
        frmCadastro tela = new frmCadastro();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCadastroMouseClicked

    private void lblRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblRelatoriosMouseClicked

    private void lblCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCardapioMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lblCardapioMouseClicked

    private void lblTelaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelaPrincipalMouseClicked
        // TODO add your handling code here:
        frmTelaInicial tela = new frmTelaInicial();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblTelaPrincipalMouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        try{
            
            String cep, bairro, endereco, taxa;
            cep = txtCep.getText();
            bairro = txtBairro.getText();
            endereco = txtEndereco.getText();
            taxa = txtTaxa.getText().replaceAll(",", ".");
            String minhasql = "insert into endereco (cep, bairro, nome, taxa) values ('"+cep+"','"+bairro+"','"+endereco+"',"+taxa+")";
            st.executeUpdate(minhasql);
            JOptionPane.showMessageDialog(null, "Registro gravado");
        }catch(Exception e){
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "não gravado");
        }

        Listar();
        Limpar();
        Sumir();
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        Aparecer();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtEndereco.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM endereco WHERE cep LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR bairro LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR nome LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                
                String cep = (rs.getString("cep"));
                String bairro = (rs.getString("bairro"));
                String endereco = (rs.getString("nome"));
                String taxa = (rs.getString("taxa"));
                
                modelo.addRow(new Object[]{cep,bairro,endereco,taxa});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void jtEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEnderecoMouseClicked
        // TODO add your handling code here:
        
        txtCep.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 0).toString());
        txtBairro.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 1).toString());
        txtEndereco.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 2).toString());
        txtTaxa.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jtEnderecoMouseClicked

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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEndereco;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCadEndereco;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNovoEndere;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblTaxa;
    private javax.swing.JLabel lblTelaPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlCima;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtTaxa;
    // End of variables declaration//GEN-END:variables
}
