package gertarefas;

import dao.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class GerenciadorDominio {
    // DAO's
    private CategoriaDAO categoriaDAO;
    private ProdutoDAO produtoDAO;
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
       ConexaoHibernate.getSessionFactory(); // abrir conexão hibernate com bd postgresql
       this.categoriaDAO = new CategoriaDAO();
       this.produtoDAO = new ProdutoDAO();
    }
    // Categorias CRUD
    
    public List<Categoria> listarCategorias() throws ClassNotFoundException, SQLException
    {
        return categoriaDAO.listar();
    }
    
    public void inserirCategoria(Categoria cat) throws ClassNotFoundException, SQLException
    {
        categoriaDAO.inserir(cat);
    }
    
    // Produto CRUD
    
    public void inserirProduto(Produto prod) throws ClassNotFoundException, SQLException
    {
        produtoDAO.inserir(prod);
    }
    public void alterarProduto(Produto prod) throws ClassNotFoundException, SQLException
    {
        produtoDAO.alterar(prod);
    }
    public void excluirProduto(Produto prod)  throws ClassNotFoundException, SQLException
    {
        produtoDAO.excluir(prod);
    }
    public List<Produto> pesquisarProduto(String nomeFiltro, String categoriaFilro, int tipoBusca) throws ClassNotFoundException, SQLException
    {
        List<Produto> resultadoBusca = new ArrayList<>();
        switch(tipoBusca)
        {
            case 1: resultadoBusca = produtoDAO.listar(); break;
            case 2: resultadoBusca = produtoDAO.pesquisarPorNome(nomeFiltro); break;
            case 3: resultadoBusca = produtoDAO.pesquisarPorCategoria(categoriaFilro);break;
            case 4: resultadoBusca = produtoDAO.pesquisarPorNomeAndCategoria(nomeFiltro, categoriaFilro); break;
        }
        return resultadoBusca;
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
