package gertarefas;

import intergraf.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Cliente;
import modelo.Produto;
import org.hibernate.HibernateException;


public class GerenciadorInterfaceGrafica {

    private FramePrincipal frmPrincipal;
    private DialogCadastrarCategoria dlgCadastrarCategoria;
    private DialogCadastrarCliente dlgCadastrarCliente;
    private DialogCadastrarProduto dlgCadastrarProduto;
    private DialogDetalharPedido dlgDetalharPedido;
    private DialogGerarRelatorio dlgGerarRelatorio;
    private DialogRealizarPedido dlgRealizarPedido;
    private DialogVisualizarCategorias dlgVisualizarCategorias;
    private DialogVisualizarPedidos dlgVisualizarPedidos;
    private DialogVisualizarProdutos dlgVisualizarProdutos;
    private DialogVisualizarClientes dlgVisualizarClientes;
    private GerenciadorDominio gerenciadorDominio;
    
    public GerenciadorInterfaceGrafica() {
        this.frmPrincipal = new FramePrincipal(this);
        this.dlgCadastrarCategoria = new DialogCadastrarCategoria(frmPrincipal, true, this);
        this.dlgCadastrarCliente = new DialogCadastrarCliente(frmPrincipal, true, this);
        this.dlgCadastrarProduto = new DialogCadastrarProduto(frmPrincipal, true, this);
        this.dlgDetalharPedido = new DialogDetalharPedido(frmPrincipal, true, this);
        this.dlgGerarRelatorio = new DialogGerarRelatorio(frmPrincipal, true, this);
        this.dlgRealizarPedido = new DialogRealizarPedido(frmPrincipal, true, this);
        this.dlgVisualizarCategorias = new DialogVisualizarCategorias(frmPrincipal, true, this);
        this.dlgVisualizarPedidos = new DialogVisualizarPedidos(frmPrincipal, true, this);
        this.dlgVisualizarProdutos = new DialogVisualizarProdutos(frmPrincipal, true, this);
        this.dlgVisualizarClientes = new DialogVisualizarClientes(frmPrincipal, true, this);
        try {
            this.gerenciadorDominio = new GerenciadorDominio();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(frmPrincipal, e);
            System.exit(-1);
        }
    }
    // Abertura de janelas
    public void abrirJanela(JDialog dlg)
    {
        dlg.setVisible(true);
    }
    public void fecharJanela(JDialog dlg)
    {
        dlg.dispose();
    }
    public void abrirFramePrincial()
    {
        frmPrincipal.setVisible(true);
    }
 
    public void abrirDlgCadastrarCategoria(){
        abrirJanela(dlgCadastrarCategoria);
    }
    public void abrirDlgCadastrarCliente(){
        abrirJanela(dlgCadastrarCliente);
    }
    
    public void abrirDlgCadastrarProduto(){
        abrirJanela(dlgCadastrarProduto);
    }
    
    public void abrirDlgDetalharPedido(){
        abrirJanela(dlgDetalharPedido);
    }
    public void abrirDlgGerarRelatorio(){
        abrirJanela(dlgGerarRelatorio);
    }
    public void abrirDlgRealizarPedido(){
        abrirJanela(dlgRealizarPedido);
    }
    public void abrirDlgVisualizarCategorias(){
        abrirJanela(dlgVisualizarCategorias);
    }
    public void abrirDlgVisualizarPedidos(){
        abrirJanela(dlgVisualizarPedidos);
    }
    public void abrirDlgVisualizarProdutos(){
        abrirJanela(dlgVisualizarProdutos);
    }
    public void abrirDlgVisualizarClientes()
    {
        abrirJanela(dlgVisualizarClientes);
    }
    // Telas de edição
    public void abrirDlgCadastrarProduto(Produto produtoSelecionado){
        dlgCadastrarProduto.setProdutoSelecionado(produtoSelecionado);
        abrirJanela(dlgCadastrarProduto);
    }
    
    // Tela de seleção
    public void abrirDlgRealizarPedidoCarregarProduto(Produto produtoSelecionado){
        dlgRealizarPedido.setProdSelecionado(produtoSelecionado);
        dlgRealizarPedido.carregarInfoProd();
        abrirJanela(dlgRealizarPedido);
    }
    public void abrirDlgRealizarPedidoCarregarCliente(Cliente clienteSelecionado){
        dlgRealizarPedido.setClienteSelecionado(clienteSelecionado);
        dlgRealizarPedido.carregarInfoCliente();
        abrirJanela(dlgRealizarPedido);
    }
    
    // Carregar informações na tela a partir do banco ( carrega combo )
    
    public void carregarCombobox(JComboBox combo, Class classe)
    {
        List<Categoria> list;
        try {
            list = gerenciadorDominio.listar(classe);
            combo.setModel(new DefaultComboBoxModel(list.toArray()));
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(frmPrincipal, e);
        } 
    }
    
    // Inserir na tabela de pedido
    public void insereNaTabelaPedido(Produto prod, int qtdProd, JTable tabela)  
    {
        ((DefaultTableModel) tabela.getModel()).addRow(new Object[4]);
        int linhaAtual = tabela.getRowCount() - 1;
        int i = 0;
        
        tabela.setValueAt(prod, linhaAtual, i++);
        tabela.setValueAt(qtdProd, linhaAtual, i++);
        tabela.setValueAt(prod.getCategoria().getNome(), linhaAtual, i++);
        tabela.setValueAt(prod.getPreco(), linhaAtual, i++);
        tabela.setValueAt(qtdProd * prod.getPreco(), linhaAtual, i++);
    }
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        GerenciadorInterfaceGrafica gerInGraf = new GerenciadorInterfaceGrafica();
        gerInGraf.abrirFramePrincial();
    }

    public GerenciadorDominio getGerenciadorDominio() {
        return gerenciadorDominio;
    }
}
