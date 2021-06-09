package intergraf;


import modelo.Produto;
import gertarefas.GerenciadorInterfaceGrafica;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thaly
 */
public class DialogRealizarPedido extends javax.swing.JDialog {
    private GerenciadorInterfaceGrafica gerInterfaceGrafica;
    /**
     * Creates new form DialogRealizarPedido
     */
    private Produto prodSelecionado;
    
    public DialogRealizarPedido(java.awt.Frame parent, boolean modal, GerenciadorInterfaceGrafica gerInterfaceGrafica) {
        super(parent, modal);
        this.gerInterfaceGrafica = gerInterfaceGrafica;
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

        MenuPopUpExcluir = new javax.swing.JPopupMenu();
        menuExcluir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblAddProdCarrinho = new javax.swing.JLabel();
        txtNomeFiltro = new javax.swing.JTextField();
        btnBuscarComFiltros = new javax.swing.JButton();
        lblNomeFiltro = new javax.swing.JLabel();
        selectCategoriaFiltro = new javax.swing.JComboBox<>();
        qtdPorProd = new javax.swing.JSpinner();
        lblQtd = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tableProdScroll = new javax.swing.JScrollPane();
        tableCarrinhoPedido = new javax.swing.JTable();
        btnRemoverItem = new javax.swing.JButton();
        btnFinalizarPedido = new javax.swing.JButton();
        lblTipoPagamento = new javax.swing.JLabel();
        selectTipoPagamento = new javax.swing.JComboBox<>();
        btnLimparCarrinho = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAdicionaAoCarrinho = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCatProd = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        lblPrecoProduto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCategoriaFiltro = new javax.swing.JLabel();
        selectProdutos1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        menuExcluir.setText("Excluir");
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        MenuPopUpExcluir.add(menuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)), "Realizar Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(51, 0, 204))); // NOI18N

        lblAddProdCarrinho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAddProdCarrinho.setText("Adicione produtos ao carrinho:");

        btnBuscarComFiltros.setText("Buscar");

        lblNomeFiltro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNomeFiltro.setText("Nome:");

        selectCategoriaFiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectCategoriaFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCategoriaFiltroActionPerformed(evt);
            }
        });

        qtdPorProd.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        lblQtd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQtd.setText("Qtd:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 102)), "Carrinho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 255, 0))); // NOI18N

        tableCarrinhoPedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        tableCarrinhoPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableCarrinhoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Categoria", "Valor Unitário", "Quantidade", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCarrinhoPedido.setComponentPopupMenu(MenuPopUpExcluir);
        tableProdScroll.setViewportView(tableCarrinhoPedido);

        btnRemoverItem.setText("Remover item");

        btnFinalizarPedido.setText("Finalizar Pedido");
        btnFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoActionPerformed(evt);
            }
        });

        lblTipoPagamento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTipoPagamento.setText("Selecione o tipo de pagamento:");

        selectTipoPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão", "Cheque" }));
        selectTipoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTipoPagamentoActionPerformed(evt);
            }
        });

        btnLimparCarrinho.setText("Limpar Carrinho");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableProdScroll)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnLimparCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnFinalizarPedido)
                        .addGap(43, 43, 43)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTipoPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tableProdScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoPagamento)
                    .addComponent(selectTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        btnAdicionaAoCarrinho.setText("Adicionar ao Carrinho");
        btnAdicionaAoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaAoCarrinhoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Preço:");

        lblCatProd.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        lblCatProd.setForeground(new java.awt.Color(204, 204, 204));

        lblNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeProduto.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(255, 255, 0));

        lblPrecoProduto.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblPrecoProduto.setForeground(new java.awt.Color(255, 255, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoria:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(194, 194, 194)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(lblPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(lblCatProd, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblCatProd, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblNomeProduto)
                        .addComponent(lblPrecoProduto)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        lblCategoriaFiltro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCategoriaFiltro.setText("Categoria");

        selectProdutos1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProdutos1ActionPerformed(evt);
            }
        });

        jLabel4.setText("VALOR TOTAL DO PEDIDO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCategoriaFiltro)
                                .addGap(18, 18, 18)
                                .addComponent(selectCategoriaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnBuscarComFiltros))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeFiltro)
                                .addGap(35, 35, 35)
                                .addComponent(txtNomeFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAddProdCarrinho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lblQtd)
                                .addGap(18, 18, 18)
                                .addComponent(qtdPorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionaAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtNomeFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNomeFiltro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoriaFiltro)
                    .addComponent(selectCategoriaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarComFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddProdCarrinho)
                            .addComponent(qtdPorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtd)
                            .addComponent(selectProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionaAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        selectCategoriaFiltro.getAccessibleContext().setAccessibleName(selectCategoriaFiltro.getName());

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionaAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaAoCarrinhoActionPerformed

    }//GEN-LAST:event_btnAdicionaAoCarrinhoActionPerformed
  
    private void selectCategoriaFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCategoriaFiltroActionPerformed

    }//GEN-LAST:event_selectCategoriaFiltroActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void selectTipoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTipoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectTipoPagamentoActionPerformed

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
        gerInterfaceGrafica.fecharJanela(this);
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    private void selectProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProdutos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectProdutos1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu MenuPopUpExcluir;
    private javax.swing.JButton btnAdicionaAoCarrinho;
    private javax.swing.JButton btnBuscarComFiltros;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnLimparCarrinho;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddProdCarrinho;
    private javax.swing.JLabel lblCatProd;
    private javax.swing.JLabel lblCategoriaFiltro;
    private javax.swing.JLabel lblNomeFiltro;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblTipoPagamento;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JSpinner qtdPorProd;
    private javax.swing.JComboBox<String> selectCategoriaFiltro;
    private javax.swing.JComboBox<String> selectProdutos1;
    private javax.swing.JComboBox<String> selectTipoPagamento;
    private javax.swing.JTable tableCarrinhoPedido;
    private javax.swing.JScrollPane tableProdScroll;
    private javax.swing.JTextField txtNomeFiltro;
    // End of variables declaration//GEN-END:variables
}
