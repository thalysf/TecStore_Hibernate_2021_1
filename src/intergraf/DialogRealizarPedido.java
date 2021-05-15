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
        txtBuscaProd = new javax.swing.JTextField();
        btnBuscarProd = new javax.swing.JButton();
        lblBuscaProd = new javax.swing.JLabel();
        selectProdutos = new javax.swing.JComboBox<>();
        qtdPorProd = new javax.swing.JSpinner();
        lblQtd = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tableProdScroll = new javax.swing.JScrollPane();
        tableCarrinhoPedido = new javax.swing.JTable();
        btnRemoverDoCarrinho = new javax.swing.JButton();
        btnEditarItemCarrinho = new javax.swing.JButton();
        btnFinalizarPedido = new javax.swing.JButton();
        lblTipoPagamento = new javax.swing.JLabel();
        selectTipoPagamento = new javax.swing.JComboBox<>();
        btnAdicionaAoCarrinho = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCatProd = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        lblPrecoProduto = new javax.swing.JLabel();

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
        lblAddProdCarrinho.setText("Adicione produtos ao carrinho");

        btnBuscarProd.setText("Buscar");

        lblBuscaProd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBuscaProd.setText("Busque produtos:");

        selectProdutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProdutosActionPerformed(evt);
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

        btnRemoverDoCarrinho.setText("Remover");

        btnEditarItemCarrinho.setText("Editar");
        btnEditarItemCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarItemCarrinhoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableProdScroll)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnEditarItemCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnRemoverDoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnFinalizarPedido))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTipoPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tableProdScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoPagamento)
                    .addComponent(selectTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverDoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarItemCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(lblNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(lblPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(lblCatProd, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(lblPrecoProduto)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBuscaProd)
                        .addGap(35, 35, 35)
                        .addComponent(txtBuscaProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAddProdCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(selectProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtd)
                    .addComponent(btnBuscarProd))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnAdicionaAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 834, Short.MAX_VALUE)
                        .addComponent(qtdPorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBuscaProd)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddProdCarrinho)
                    .addComponent(selectProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdPorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAdicionaAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        selectProdutos.getAccessibleContext().setAccessibleName(selectProdutos.getName());

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarItemCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarItemCarrinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarItemCarrinhoActionPerformed

    private void btnAdicionaAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaAoCarrinhoActionPerformed

    }//GEN-LAST:event_btnAdicionaAoCarrinhoActionPerformed
  
    private void selectProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProdutosActionPerformed

    }//GEN-LAST:event_selectProdutosActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void selectTipoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTipoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectTipoPagamentoActionPerformed

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
        gerInterfaceGrafica.fecharJanela(this);
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu MenuPopUpExcluir;
    private javax.swing.JButton btnAdicionaAoCarrinho;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnEditarItemCarrinho;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnRemoverDoCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddProdCarrinho;
    private javax.swing.JLabel lblBuscaProd;
    private javax.swing.JLabel lblCatProd;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblTipoPagamento;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JSpinner qtdPorProd;
    private javax.swing.JComboBox<String> selectProdutos;
    private javax.swing.JComboBox<String> selectTipoPagamento;
    private javax.swing.JTable tableCarrinhoPedido;
    private javax.swing.JScrollPane tableProdScroll;
    private javax.swing.JTextField txtBuscaProd;
    // End of variables declaration//GEN-END:variables
}