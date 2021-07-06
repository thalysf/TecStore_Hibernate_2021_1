
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Categoria;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericDAO {
    public void inserir(Object item) throws HibernateException {
        Session sessao = null;
        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Categoria.class);

            sessao.save(item);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(e);
        }
    }

    public void excluir(Object item) throws HibernateException {
        Session sessao = null;
        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Categoria.class);

            sessao.delete(item);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(e);
        }
    }

    public void alterar(Object item) throws HibernateException {
        Session sessao = null;
        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Categoria.class);

            sessao.update(item);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(e);
        }
    }
    
    public List listar(Class classe) throws HibernateException {

        Session sessao = null;
        List list = new ArrayList<>();
        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(classe);
            list = consulta.list();
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException e) {
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(e);
        }
        return list;
    }
}
