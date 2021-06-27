package gertarefas;

import dao.*;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import modelo.*;
import modelo.util.PagamentoEnum;
import org.hibernate.HibernateException;

public class GerenciadorDominio {

    // DAO
    private GenericDAO genericDAO;
    private ProdutoDAO produtoDAO;

    public GerenciadorDominio() throws HibernateException {
        ConexaoHibernate.getSessionFactory(); // abrir conexão hibernate com bd postgresql
        this.genericDAO = new GenericDAO();
        this.produtoDAO = new ProdutoDAO();
    }

    public void inserir(Object item) throws HibernateException {
        produtoDAO.inserir(item);
    }

    public void alterar(Object item) throws HibernateException {
        produtoDAO.alterar(item);
    }

    public void excluir(Object item) throws HibernateException {
        produtoDAO.excluir(item);
    }

    public List listar(Class classe) throws HibernateException {
        return genericDAO.listar(classe);
    }

    public List<Produto> pesquisarProduto(String nomeFiltro, String categoriaFilro, int tipoBusca) throws HibernateException {
//        List<Produto> resultadoBusca = new ArrayList<>();
//        switch(tipoBusca)
//        {
//            case 1: resultadoBusca = produtoDAO.listar(); break;
//            case 2: resultadoBusca = produtoDAO.pesquisarPorNome(nomeFiltro); break;
//            case 3: resultadoBusca = produtoDAO.pesquisarPorCategoria(categoriaFilro);break;
//            case 4: resultadoBusca = produtoDAO.pesquisarPorNomeAndCategoria(nomeFiltro, categoriaFilro); break;
//        }
        return produtoDAO.listar(Produto.class);
    }

    public int inserirPedido(Cliente clienteSelecionado, PagamentoEnum pagamentoEnum, JTable tableCarrinhoPedido, Double valorTotalPedido) {
        Pedido pedido = new Pedido(0, clienteSelecionado, pagamentoEnum, new Date(), valorTotalPedido);

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
