package dao;

import java.util.List;
import modelo.Produto;
import org.hibernate.HibernateException;

public class ProdutoDAO extends GenericDAO{

    private List<Produto> pesquisar(String busca) throws HibernateException {
        return null;
    }

    public List<Produto> pesquisarPorNome(String nomeFiltro) throws HibernateException {
        return null;
    }

    public List<Produto> pesquisarPorCategoria(String categoriaFiltro) throws HibernateException {
        return null;
    }

    public List<Produto> pesquisarPorNomeAndCategoria(String nomeFiltro, String categoriaFiltro) throws HibernateException {
        return null;
    }

    public List<Produto> listar() throws HibernateException {
        return null;
    }
}
