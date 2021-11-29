/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        
        setExtendedState(MAXIMIZED_BOTH);

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root","");
            st = (Statement)con.createStatement();
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");
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
                String endereco = (rs.getString("logradouro"));
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
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblCardapio = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();

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
        btnNovo.setToolTipText("Cadastrar novo endereço");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Pesquisar");

        jtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEP", "Bairro", "Endereço", "Taxa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlCimaLayout = new javax.swing.GroupLayout(pnlCima);
        pnlCima.setLayout(pnlCimaLayout);
        pnlCimaLayout.setHorizontalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCimaLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCimaLayout.createSequentialGroup()
                        .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCimaLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCimaLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1)
                        .addGap(34, 34, 34))))
        );
        pnlCimaLayout.setVerticalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(42, 42, 42)
                .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCimaLayout.createSequentialGroup()
                        .addGroup(pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        lblCadEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

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
        btnCadastrar.setToolTipText("Finalizar o Cadastro");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR CADASTRO");
        btnEditar.setToolTipText("Finalizar a Edição");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR CADASTRO");
        btnExcluir.setToolTipText("Apagar o cadastro");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(lblTaxa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblNovoEndere))
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCadEndereco))
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblCadEndereco)
                .addGap(18, 18, 18)
                .addComponent(lblNovoEndere)
                .addGap(62, 62, 62)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCentroLayout.createSequentialGroup()
                        .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaxa)
                            .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCep)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/HOME.png"))); // NOI18N
        lblMenu.setText(" Início");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblCardapio.setBackground(new java.awt.Color(204, 204, 204));
        lblCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CARDAPIO.png"))); // NOI18N
        lblCardapio.setText("Cardápio");
        lblCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCardapioMouseClicked(evt);
            }
        });

        lblPedidos.setBackground(new java.awt.Color(204, 204, 204));
        lblPedidos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PIZZA.png"))); // NOI18N
        lblPedidos.setText("Pedidos");
        lblPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedidosMouseClicked(evt);
            }
        });

        lblCadastro.setBackground(new java.awt.Color(204, 204, 204));
        lblCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CADASTRO.png"))); // NOI18N
        lblCadastro.setText("Cadastro");
        lblCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroMouseClicked(evt);
            }
        });

        lblRelatorios.setBackground(new java.awt.Color(204, 204, 204));
        lblRelatorios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GRAFICO.png"))); // NOI18N
        lblRelatorios.setText("Relatórios");
        lblRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatoriosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPedidos)
                .addGap(18, 18, 18)
                .addComponent(lblCadastro)
                .addGap(18, 18, 18)
                .addComponent(lblRelatorios)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedidosMouseClicked
        // TODO add your handling code here:
        frmPedido_Cliente tela = new frmPedido_Cliente();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblPedidosMouseClicked

    private void lblCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroMouseClicked
        // TODO add your handling code here:
        frmCadastro tela = new frmCadastro();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCadastroMouseClicked

    private void lblRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseClicked
        // TODO add your handling code here:
        frmRelatorio tela = new frmRelatorio();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRelatoriosMouseClicked

    private void lblCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCardapioMouseClicked
        // TODO add your handling code here:
       frmCardapio_Pesquisa tela = new frmCardapio_Pesquisa();
        tela.setVisible(true);
        this.setVisible(false);
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
            String sql = "insert into endereco (cep, bairro, logradouro, taxa) values ('"+cep+"','"+bairro+"','"+endereco+"',"+taxa+")";
            st.executeUpdate(sql);
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
        Limpar();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtEndereco.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM endereco WHERE cep LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR bairro LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR logradouro LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                
                String cep = (rs.getString("cep"));
                String bairro = (rs.getString("bairro"));
                String endereco = (rs.getString("logradouro"));
                String taxa = (rs.getString("taxa"));
                
                modelo.addRow(new Object[]{cep,bairro,endereco,taxa});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void jtEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEnderecoMouseClicked
        // TODO add your handling code here:
        Aparecer();
        txtCep.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 0).toString());
        txtBairro.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 1).toString());
        txtEndereco.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 2).toString());
        txtTaxa.setText(jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jtEnderecoMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
         try{
            
            String cep, bairro, endereco, taxa;
            cep = txtCep.getText();
            bairro = txtBairro.getText();
            endereco = txtEndereco.getText();
            taxa = txtTaxa.getText().replaceAll(",", ".");
            String sql = "UPDATE endereco SET bairro = '"+bairro+"', logradouro = '"+endereco+"', taxa = '"+taxa+"' where cep = '"+cep+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro Editado");
        }catch(Exception e){
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "não Editado");
        }

        Listar();
        Limpar();
        Sumir();
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
             try{
            
            String sql = "DELETE FROM endereco where cep = '"+txtCep.getText()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro Deletedo");
        }catch(Exception e){
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "não Deletado");
        }

        Listar();
        Limpar();
        Sumir();   
                
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        frmTelaInicial tela = new frmTelaInicial();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // TODO add your handling code here:
         try {
            DefaultTableModel modelo = (DefaultTableModel) jtEndereco.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM endereco WHERE cep LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR bairro LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR logradouro LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                
                String cep = (rs.getString("cep"));
                String bairro = (rs.getString("bairro"));
                String endereco = (rs.getString("logradouro"));
                String taxa = (rs.getString("taxa"));
                
                modelo.addRow(new Object[]{cep,bairro,endereco,taxa});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
                 
    }//GEN-LAST:event_txtPesquisaKeyPressed

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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
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
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNovoEndere;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblTaxa;
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
