/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruy_s
 */
public class frmCardapio_Pesquisa extends javax.swing.JFrame {

    
        public Connection con;
        public Statement st;
        public ResultSet rs;
        
    public frmCardapio_Pesquisa() {
        
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
        ListarP();
       
    }
    
        private void ListarP(){
    try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT id, nome FROM pizza";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
               
                modelo.addRow(new Object[]{codigo,nome});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    
    }
        private void ListarB(){
    try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT id, nome FROM bebida";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));

                modelo.addRow(new Object[]{codigo,nome});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblCardapio = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        cbxProduto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPizza = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCad = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cbxTipo = new javax.swing.JComboBox<>();
        jspDescricao = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CARDÁPIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("CARDÁPIO");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        btnPesquisa.setBackground(new java.awt.Color(0, 153, 51));
        btnPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisa.setText("PESQUISAR");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        cbxProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizzas", "Bebidas" }));
        cbxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProdutoActionPerformed(evt);
            }
        });

        jtPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do produto"
            }
        ));
        jtPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPizzaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPizza);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(361, 361, 361)
                        .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisa))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblCad.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCad.setForeground(new java.awt.Color(0, 153, 153));
        lblCad.setText("Descrição do produto:");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNome.setText("Nome da Pizza:");

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblValor.setText("Valor:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblValor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblValor2.setText("Valor da broto:");

        txtValor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTipo.setText("Tipo:");

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("EDITAR");
        jButton4.setToolTipText("");

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("EXCLUIR");

        cbxTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salgada", "Doce" }));

        jspDescricao.setViewportView(txtDescricao);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor2)
                            .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblValor)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCad))
                        .addGap(159, 159, 159)
                        .addComponent(jspDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblNome)
                                .addGap(448, 448, 448)
                                .addComponent(lblDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCad)
                        .addGap(18, 18, 18)
                        .addComponent(lblNome))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblDescricao)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblValor)
                                .addGap(23, 23, 23)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(lblValor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipo)
                                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jspDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        frmTelaInicial tela = new frmTelaInicial();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCardapioMouseClicked
        // TODO add your handling code here:
        frmCardapio_Pesquisa tela = new frmCardapio_Pesquisa();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCardapioMouseClicked

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

    private void jtPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPizzaMouseClicked
        // TODO add your handling code here:
        
        if(cbxProduto.getSelectedItem().equals("Pizzas")){
        int n = 0;
        String id = "";
 
            try {
                id = (jtPizza.getValueAt(jtPizza.getSelectedRow(), 0).toString());
                
                String sql = "SELECT * FROM pizza where id = "+id+"";
                rs = st.executeQuery(sql);
               while (rs.next()){
                 
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valor2 = (rs.getString("valorbroto"));
                String tipo = (rs.getString("tipo"));
                String Descricao = (rs.getString("descricao"));

                txtNome.setText(nome);
                txtValor.setText(valor);
                txtValor2.setText(valor2);
                txtDescricao.setText(Descricao);
                    switch(tipo){
            
                        case "Salgada":
                        n = 0;
                        break;
                        case "Doce":
                        n=1;
                        break;
                }
                        cbxTipo.setSelectedIndex(n);
                
               }
                
            } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }else{
            String id = "";
            try {
                id = (jtPizza.getValueAt(jtPizza.getSelectedRow(), 0).toString());
                
                String sql = "SELECT * FROM bebida where id = "+id+"";
                rs = st.executeQuery(sql);
               while (rs.next()){
                 
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                

                txtNome.setText(nome);
                txtValor.setText(valor);
               }
                
            } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }
    }//GEN-LAST:event_jtPizzaMouseClicked

    private void cbxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProdutoActionPerformed
        // TODO add your handling code here:
        if("Pizzas".equals(cbxProduto.getSelectedItem().toString())){
            ListarP();
            lblValor2.setVisible(true);
            txtValor2.setVisible(true);
            lblTipo.setVisible(true);
            cbxTipo.setVisible(true);
            lblDescricao.setVisible(true);
            txtDescricao.setVisible(true);
        }else{
            ListarB();
            lblValor2.setVisible(false);
            txtValor2.setVisible(false);
            lblTipo.setVisible(false);
            cbxTipo.setVisible(false);
            lblDescricao.setVisible(false);
            txtDescricao.setVisible(false);
        }
        
        
    }//GEN-LAST:event_cbxProdutoActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // TODO add your handling code here:
        
        if("Pizzas".equals(cbxProduto.getSelectedItem().toString())){
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM pizza WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR id LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valorbroto = (rs.getString("valorbroto"));
                String tipo = (rs.getString("tipo"));
                String descricao = (rs.getString("descricao"));
                
                modelo.addRow(new Object[]{codigo,nome,valor,valorbroto,tipo,descricao});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }else{
            try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM bebida WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR id LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                
                modelo.addRow(new Object[]{codigo,nome,valor});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        if("Pizzas".equals(cbxProduto.getSelectedItem().toString())){
        try {
            int n = 0;
           
            
            String sql = "SELECT * FROM pizza WHERE nome = '"+txtPesquisa.getText()+"'"
                    +" OR id = '"+txtPesquisa.getText()+"'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valorbroto = (rs.getString("valorbroto"));
                String tipo = (rs.getString("tipo"));
                String descricao = (rs.getString("descricao"));
                
                txtNome.setText(nome);
                txtValor.setText(valor);
                txtValor2.setText(valorbroto);
                txtDescricao.setText(descricao);
                
                switch(tipo){
            
                case "Salgada":
                n = 0;
                break;
                case "Doce":
                n=1;
                break;
                }
                cbxTipo.setSelectedIndex(n);         
            }
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }else{
            try {
           
            
            String sql = "SELECT * FROM bebida WHERE nome = '"+txtPesquisa.getText()+"'"
                    +" OR id = '"+txtPesquisa.getText()+"'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                
                txtNome.setText(nome);
                txtValor.setText(valor);
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(frmCardapio_Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCardapio_Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCardapio_Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCardapio_Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCardapio_Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JComboBox<String> cbxProduto;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jspDescricao;
    private javax.swing.JTable jtPizza;
    private javax.swing.JLabel lblCad;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
