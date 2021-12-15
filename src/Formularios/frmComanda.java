/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruy_s
 */
public class frmComanda extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public frmComanda() {
        initComponents();
        Color minhaCor = new Color(255,255,255);
        getContentPane().setBackground(minhaCor);
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root","");
            st = (Statement)con.createStatement();
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não, Conectado");
            
        }
        listar();
    }

    
    public void listar(){
        
        try {
            float vTotal = 0;
            int prod = 1;
            
            String sql = "select C.nome, x.nome, y.nome, z.nome, I.borda, B.nome, I.obs, I.valorf, I.qtd, I.tamanho, P.pagamento, E.taxa, E.logradouro, C.numero, E.cep from item_pedido as I " +
                                "left join pedido as P on I.id_pedido = P.id " +
                                "left join cliente as C on P.telefone_c = C.telefone " +
                                "left join bebida as B on I.id_bebida = B.id " +
                                "left join pizza as X on I.id_pizza = X.id " +
                                "left join pizza as Y on I.id_pizza2 = Y.id " +
                                "left join pizza as Z on I.id_pizza3 = Z.id " +
                                "left join endereco as E on C.fk_cep_endereco = E.cep " +
                                "where P.id = 13;";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
 
                String nome = (rs.getString("C.nome"));
                String pizza1 = (rs.getString("x.nome"));
                String pizza2 = (rs.getString("y.nome"));
                String pizza3 = (rs.getString("z.nome"));
                String borda = (rs.getString("I.borda"));
                String bebida = (rs.getString("B.nome"));
                float valor = (rs.getFloat("I.valorf"));
                int qtd = (rs.getInt("I.qtd"));
                String tamanho = (rs.getString("I.tamanho"));
                String pagamento = (rs.getString("P.pagamento"));
                String cep = (rs.getString("E.cep"));
                String endereco = (rs.getString("E.logradouro"));
                String numero = (rs.getString("C.numero"));
                String obs = (rs.getString("I.obs"));
                String taxa = (rs.getString("E.taxa"));
                
                vTotal += (valor*qtd);
                lblNP.setText("1");
                lblTaxa.setText("R$"+taxa);
                lblVTotal.setText("R$"+vTotal+"0");
                lblEndereco.setText(endereco+", "+numero);
                lblPagamento.setText(pagamento);
                lblNome.setText(nome);
                
                if(pizza1 != null && pizza2 == null && pizza3 == null){
                    
                    if(obs != null || obs != ""){
                        txtProduto.setText(txtProduto.getText()+"\n "+qtd+" - "+tamanho+"\n       "+pizza1+"\n"+"Borda: "+borda+"\n"+"\n"+"OBS: "+obs+"\n");
                    }else{
                        txtProduto.setText(txtProduto.getText()+"\n "+qtd+" - "+tamanho+"\n       "+pizza1+"\n"+"Borda: "+borda+"\n");
                    }
                }else if(pizza1 != null && pizza2 != null && pizza3 == null){
                        
                        if(obs != null || obs != ""){
                        txtProduto.setText(txtProduto.getText()+"\n "+qtd+" - "+tamanho+"\n       1/2 "+pizza1+"\n       1/2 "+pizza2+"\n"+"Borda: "+borda+"\n"+"OBS: "+obs+"\n");
                    }else {
                            txtProduto.setText(txtProduto.getText()+"\n "+qtd+" - "+tamanho+"\n       1/2 "+pizza1+"\n       1/2 "+pizza2+"\n"+"Borda: "+borda+"\n");
                        }
                }else if(pizza1 != null && pizza2 != null && pizza3 != null){
                        
                        if(obs != null || obs != ""){
                        txtProduto.setText(txtProduto.getText()+"\n "+qtd+" - "+tamanho+"\n       1/3 "+pizza1+"\n       1/3 "+pizza2+"\n       1/3 "+pizza3+"\n"+"Borda: "+borda+"\n"+"OBS: "+obs+"\n");
                    }else{
                            txtProduto.setText(txtProduto.getText()+"\n "+qtd+" - "+tamanho+"\n       1/3 "+pizza1+"\n       1/3 "+pizza2+"\n       1/3 "+pizza3+"\n"+"Borda: "+borda+"\n");
                        }
                    
                }else if(pizza1 == null && pizza2 == null && pizza3 == null && bebida != null){
                    txtProduto.setText(txtProduto.getText()+"\n 1 - "+bebida+"\n");
                }else{
                    
                }
                
                
               
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNP = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTaxa = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPagamento = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProduto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Dom Giolo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("N. Pedido:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Taxa:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Valor total:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cliente:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Forma de pagamento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Pedido:");

        txtProduto.setColumns(20);
        txtProduto.setRows(5);
        txtProduto.setBorder(null);
        jScrollPane1.setViewportView(txtProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNP, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblVTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNP;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblTaxa;
    private javax.swing.JLabel lblVTotal;
    private javax.swing.JTextArea txtProduto;
    // End of variables declaration//GEN-END:variables
}
