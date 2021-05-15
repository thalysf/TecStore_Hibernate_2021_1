package gertarefas;

import dao.CategoriaDAO;
import dao.ConexaoPostgreSQL;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class GerenciadorDominio {
    private CategoriaDAO categoriaDAO;
    private ProdutoDAO produtoDAO;
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
       ConexaoPostgreSQL.obterConexao();    
       this.categoriaDAO = new CategoriaDAO();
       this.produtoDAO = new ProdutoDAO();
    }
    // Categorias CRUD
    
    public List<Categoria> listarCategorias() throws ClassNotFoundException, SQLException
    {
        return categoriaDAO.listar();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public void inserirNaTabela(JTable tableCarrinhoPedido, Produto prod, JSpinner qtdPorProd) {
        ((DefaultTableModel) tableCarrinhoPedido.getModel()).addRow(new Object[4]);
        int linhaAtual = tableCarrinhoPedido.getRowCount() - 1;
        int i = 0;
        Integer qtdPedido = Integer.parseInt(qtdPorProd.getValue().toString());
        Double valorPedido = qtdPedido * prod.getPreco();

        tableCarrinhoPedido.setValueAt(prod.getNome(), linhaAtual, i++);
        tableCarrinhoPedido.setValueAt(prod.getCategoria(), linhaAtual, i++);
        tableCarrinhoPedido.setValueAt(prod.getPreco(), linhaAtual, i++);
        tableCarrinhoPedido.setValueAt(qtdPedido, linhaAtual, i++);
        tableCarrinhoPedido.setValueAt(valorPedido, linhaAtual, i++);
    }

    public void inserirItemCarrinho() {

    }

    public void excluirItemSelecionadoTabela(JTable tableCarrinhoPedido) {
        int linhaSelecionada = tableCarrinhoPedido.getSelectedRow();

        if (linhaSelecionada != -1) {
            ((DefaultTableModel) tableCarrinhoPedido.getModel()).removeRow(linhaSelecionada);
        }
    }
    */
}
