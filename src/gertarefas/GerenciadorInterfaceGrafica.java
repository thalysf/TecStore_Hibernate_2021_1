package gertarefas;

import dominio.Produto;
import intergraf.*;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class GerenciadorInterfaceGrafica {

    private FramePrincipal frmPrincipal;
    private DialogCadastrarAdm dlgCadastrarAdm;
    private DialogCadastrarCategoria dlgCadastrarCategoria;
    private DialogCadastrarCliente dlgCadastrarCliente;
    private DialogCadastrarProduto dlgCadastrarProduto;
    private DialogDetalharPedido dlgDetalharPedido;
    private DialogGerarRelatorio dlgGerarRelatorio;
    private DialogRealizarPedido dlgRealizarPedido;
    private DialogVisualizarCategorias dlgVisualizarCategorias;
    private DialogVisualizarPedidos dlgVisualizarPedidos;
    private DialogVisualizarProdutos dlgVisualizarProdutos;

    public GerenciadorInterfaceGrafica() {
        this.frmPrincipal = new FramePrincipal(this);
        this.dlgCadastrarAdm = new DialogCadastrarAdm(frmPrincipal, true, this);
        this.dlgCadastrarCategoria = new DialogCadastrarCategoria(frmPrincipal, true, this);
        this.dlgCadastrarCliente = new DialogCadastrarCliente(frmPrincipal, true, this);
        this.dlgCadastrarProduto = new DialogCadastrarProduto(frmPrincipal, true, this);
        this.dlgDetalharPedido = new DialogDetalharPedido(frmPrincipal, true, this);
        this.dlgGerarRelatorio = new DialogGerarRelatorio(frmPrincipal, true, this);
        this.dlgRealizarPedido = new DialogRealizarPedido(frmPrincipal, true, this);
        this.dlgVisualizarCategorias = new DialogVisualizarCategorias(frmPrincipal, true, this);
        this.dlgVisualizarPedidos = new DialogVisualizarPedidos(frmPrincipal, true, this);
        this.dlgVisualizarProdutos = new DialogVisualizarProdutos(frmPrincipal, true, this);
    }
    
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
    
    public void abrirDlgCadastrarAdm(){
        abrirJanela(dlgCadastrarAdm);
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

   
}
