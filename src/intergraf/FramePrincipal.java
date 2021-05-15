package intergraf;

import modelo.Produto;
import gertarefas.GerenciadorInterfaceGrafica;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thaly
 */
public class FramePrincipal extends javax.swing.JFrame {

    private GerenciadorInterfaceGrafica gerInterfaceGrafica;

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal(GerenciadorInterfaceGrafica gerInterfaceGrafica) {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdm = new javax.swing.JMenu();
        menuItemCadastrarAdm = new javax.swing.JMenuItem();
        menuItemCadastrarProduto = new javax.swing.JMenuItem();
        menuItemCadastrarCategoriaProduto = new javax.swing.JMenuItem();
        menuItemVisualizarProdutos = new javax.swing.JMenuItem();
        menuItemVisualizarCategoriaProduto = new javax.swing.JMenuItem();
        menuItemVisualizarPedido = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuItemCadastrarCliente = new javax.swing.JMenuItem();
        menuItemRealizarPedidos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemGerarRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Tec Store");

        menuAdm.setText("Administrador");

        menuItemCadastrarAdm.setText("Cadastrar Adm");
        menuItemCadastrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarAdmActionPerformed(evt);
            }
        });
        menuAdm.add(menuItemCadastrarAdm);

        menuItemCadastrarProduto.setText("Cadastrar Produtos");
        menuItemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarProdutoActionPerformed(evt);
            }
        });
        menuAdm.add(menuItemCadastrarProduto);

        menuItemCadastrarCategoriaProduto.setText("Cadastrar Categoria de Produto");
        menuItemCadastrarCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarCategoriaProdutoActionPerformed(evt);
            }
        });
        menuAdm.add(menuItemCadastrarCategoriaProduto);

        menuItemVisualizarProdutos.setText("Visualizar Produtos");
        menuItemVisualizarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarProdutosActionPerformed(evt);
            }
        });
        menuAdm.add(menuItemVisualizarProdutos);

        menuItemVisualizarCategoriaProduto.setText("Visualizar Categoria de Produto");
        menuItemVisualizarCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarCategoriaProdutoActionPerformed(evt);
            }
        });
        menuAdm.add(menuItemVisualizarCategoriaProduto);

        menuItemVisualizarPedido.setText("Visualizar Pedidos");
        menuItemVisualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPedidoActionPerformed(evt);
            }
        });
        menuAdm.add(menuItemVisualizarPedido);

        jMenuBar1.add(menuAdm);

        menuCliente.setText("Cliente");

        menuItemCadastrarCliente.setText("Cadastrar Clientes");
        menuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemCadastrarCliente);

        menuItemRealizarPedidos.setText("Realizar Pedidos");
        menuItemRealizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRealizarPedidosActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemRealizarPedidos);

        jMenuBar1.add(menuCliente);

        jMenu1.setText("Relatórios");

        menuItemGerarRelatorio.setText("Gerar Relatório");
        menuItemGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGerarRelatorioActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemGerarRelatorio);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCadastrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarAdmActionPerformed
        gerInterfaceGrafica.abrirDlgCadastrarAdm();
    }//GEN-LAST:event_menuItemCadastrarAdmActionPerformed

    private void menuItemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarProdutoActionPerformed
        gerInterfaceGrafica.abrirDlgCadastrarProduto();
    }//GEN-LAST:event_menuItemCadastrarProdutoActionPerformed

    private void menuItemCadastrarCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarCategoriaProdutoActionPerformed
        gerInterfaceGrafica.abrirDlgCadastrarCategoria();
    }//GEN-LAST:event_menuItemCadastrarCategoriaProdutoActionPerformed

    private void menuItemVisualizarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarProdutosActionPerformed
        gerInterfaceGrafica.abrirDlgVisualizarProdutos();
    }//GEN-LAST:event_menuItemVisualizarProdutosActionPerformed

    private void menuItemVisualizarCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarCategoriaProdutoActionPerformed
        gerInterfaceGrafica.abrirDlgVisualizarCategorias();
    }//GEN-LAST:event_menuItemVisualizarCategoriaProdutoActionPerformed

    private void menuItemVisualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarPedidoActionPerformed
        gerInterfaceGrafica.abrirDlgVisualizarPedidos();
    }//GEN-LAST:event_menuItemVisualizarPedidoActionPerformed

    private void menuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarClienteActionPerformed
        gerInterfaceGrafica.abrirDlgCadastrarCliente();
    }//GEN-LAST:event_menuItemCadastrarClienteActionPerformed

    private void menuItemRealizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRealizarPedidosActionPerformed
        gerInterfaceGrafica.abrirDlgRealizarPedido();
    }//GEN-LAST:event_menuItemRealizarPedidosActionPerformed

    private void menuItemGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGerarRelatorioActionPerformed
        gerInterfaceGrafica.abrirDlgGerarRelatorio();
    }//GEN-LAST:event_menuItemGerarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAdm;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuItemCadastrarAdm;
    private javax.swing.JMenuItem menuItemCadastrarCategoriaProduto;
    private javax.swing.JMenuItem menuItemCadastrarCliente;
    private javax.swing.JMenuItem menuItemCadastrarProduto;
    private javax.swing.JMenuItem menuItemGerarRelatorio;
    private javax.swing.JMenuItem menuItemRealizarPedidos;
    private javax.swing.JMenuItem menuItemVisualizarCategoriaProduto;
    private javax.swing.JMenuItem menuItemVisualizarPedido;
    private javax.swing.JMenuItem menuItemVisualizarProdutos;
    // End of variables declaration//GEN-END:variables
}