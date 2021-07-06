package dao;

import java.util.ArrayList;
import java.util.List;
import model.Categoria;
import model.Produto;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CategoriaDAO extends GenericDAO{

    private List<Categoria> pesquisar(String busca, int tipo) throws HibernateException {
        Session sessao = null;
        List list = new ArrayList<>();
        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Categoria.class);
            
            if(tipo == 1)
            {
                consulta.add(Restrictions.ilike("nome", busca+"%"));
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

    public List<Categoria> pesquisarPorNome(String nomeFiltro) throws HibernateException {
        
        return pesquisar(nomeFiltro, 1);
    }
    public List<Categoria> listar() throws HibernateException {
        return pesquisar("", 0);
    }
}
