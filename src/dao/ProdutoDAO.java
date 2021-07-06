package dao;

import java.util.ArrayList;
import java.util.List;
import model.Produto;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ProdutoDAO extends GenericDAO{

    private List<Produto> pesquisar(String[] busca, int tipo) throws HibernateException {
        Session sessao = null;
        List list = new ArrayList<>();
        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Produto.class);
            
            switch(tipo)
            {
                case 1: 
                        consulta.add(Restrictions.ilike("nome", busca[0]+"%"));
                        break;
                case 2: 
                        consulta.createAlias("categoria", "cat");
                        consulta.add(Restrictions.ilike("cat.nome", busca[1]+"%"));
                        break;
                case 3: 
                        consulta.createAlias("categoria", "cat");
                        consulta.add(Restrictions.ilike("nome", busca[0]+"%"));
                        consulta.add(Restrictions.ilike("cat.nome", busca[1]+"%"));
                        break;
            }
            list = consulta.list();
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(e);
        }
        return list;
    }

    public List<Produto> pesquisarPorNome(String nomeFiltro) throws HibernateException {
        
        return pesquisar( new String[]{nomeFiltro}, 1);
    }

    public List<Produto> pesquisarPorCategoria(String categoriaFiltro) throws HibernateException {
        return pesquisar( new String[]{categoriaFiltro}, 2);
    }

    public List<Produto> pesquisarPorNomeAndCategoria(String nomeFiltro, String categoriaFiltro) throws HibernateException {
        return pesquisar( new String[]{nomeFiltro, categoriaFiltro}, 3);
    }

    public List<Produto> listar() throws HibernateException {
        return pesquisar( new String[]{}, 0);
    }
}
