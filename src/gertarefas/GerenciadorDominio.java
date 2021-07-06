package gertarefas;

import model.ItemPedido;
import model.Cliente;
import model.Categoria;
import model.Pedido;
import model.Produto;
import dao.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.JTable;
import modelo.util.PagamentoEnum;
import org.hibernate.HibernateException;

public class GerenciadorDominio {

    // DAO
    private GenericDAO genericDAO;
    private ProdutoDAO produtoDAO;
    private CategoriaDAO categoriaDAO; 
    private ClienteDAO clienteDAO;
    private PedidoDAO pedidoDAO;
    public GerenciadorDominio() throws HibernateException {
        ConexaoHibernate.getSessionFactory(); // abrir conexão hibernate com bd postgresql
        this.genericDAO = new GenericDAO();
        this.produtoDAO = new ProdutoDAO();
        this.categoriaDAO = new CategoriaDAO();
        this.clienteDAO = new ClienteDAO();
        this.pedidoDAO = new PedidoDAO();
    }

    public void inserir(Object item) throws HibernateException {
        genericDAO.inserir(item);
    }

    public void alterar(Object item) throws HibernateException {
        genericDAO.alterar(item);
    }

    public void excluir(Object item) throws HibernateException {
        genericDAO.excluir(item);
    }

    public List listar(Class classe) throws HibernateException {
        return genericDAO.listar(classe);
    }

    public List<Produto> pesquisarProduto(String nomeFiltro, String categoriaFilro, int op) throws HibernateException {
        List<Produto> resultadoBusca = new ArrayList<>();
        switch (op) {
            case 0:
                resultadoBusca = produtoDAO.listar();
                break;
            case 1:
                resultadoBusca = produtoDAO.pesquisarPorNome(nomeFiltro);
                break;
            case 2:
                resultadoBusca = produtoDAO.pesquisarPorCategoria(categoriaFilro);
                break;
            case 3:
                resultadoBusca = produtoDAO.pesquisarPorNomeAndCategoria(nomeFiltro, categoriaFilro);
                break;
        }
        return resultadoBusca;
    }

    public List<Categoria> pesquisarCategoria(String nomeFiltro, int op) {
        List<Categoria> resultadoBusca = new ArrayList<>();
        switch (op) {
            case 0:
                resultadoBusca = categoriaDAO.listar();
                break;
            case 1:
                resultadoBusca = categoriaDAO.pesquisarPorNome(nomeFiltro);
                break;
        }
        return resultadoBusca;
    }

    public List<Cliente> pesquisarCliente(String nomeFiltro, int op) {
        List<Cliente> resultadoBusca = new ArrayList<>();
        switch (op) {
            case 0:
                resultadoBusca = clienteDAO.listar();
                break;
            case 1:
                resultadoBusca = clienteDAO.pesquisarPorNome(nomeFiltro);
                break;
        }
        return resultadoBusca;
    }
    public List<Pedido> pesquisarPedidos(PagamentoEnum pagEnum, String dataInicioFormatada, String dataFimFormatada, Integer codigo, String cliente) {
        return pedidoDAO.pesquisar(pagEnum, dataInicioFormatada, dataFimFormatada, codigo, cliente);
    }
    
    
    public int inserirPedido(Cliente clienteSelecionado, PagamentoEnum pagamentoEnum, JTable tableCarrinhoPedido) {
        Pedido pedido = new Pedido(0, clienteSelecionado, pagamentoEnum, new Date());

        List<ItemPedido> itensPedidos = pedido.getItensPedidos();
        int col = 0, qtd;
        for (int i = 0; i < tableCarrinhoPedido.getRowCount(); i++) {
            col = 0;
            Produto produto = (Produto) tableCarrinhoPedido.getValueAt(i, col++);
            qtd = Integer.parseInt(tableCarrinhoPedido.getValueAt(i, col++).toString());
            ItemPedido item = new ItemPedido(pedido, produto, qtd);
            itensPedidos.add(item);
        }
        genericDAO.inserir(pedido);
        return pedido.getId_pedido();
    }

    


    
}
