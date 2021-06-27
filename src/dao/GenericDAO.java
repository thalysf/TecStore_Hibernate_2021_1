
package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Produto;
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
    
    // -----------------------------------------------
    // Se não existir no banco retorna NULL
    // -----------------------------------------------
    public Object get(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try   {
          sessao = ConexaoHibernate.getSessionFactory().openSession();
          sessao.getTransaction().begin();

          objReturn = sessao.get(classe, id );

          sessao.getTransaction().commit();
          sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return objReturn;

    }
    
    
    // -----------------------------------------------------
    //  Se não existir no banco, retorna uma EXCEÇÃO
    // ----------------------------------------------------
    // Sempre retorna um PROXY e não o objeto em si.
    // PROXY é apenas uma referência ao objeto. 
    // Ele será realmente carregado quando o primeiro acesso
    // for feito ao objeto
    // ENTÃO, por isso que colocamos um primeiro acesso ao objeto 
    // dentro dessa função, como o método toString (somente para teste)
    public Object load(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try   {
          sessao = ConexaoHibernate.getSessionFactory().openSession();
          sessao.getTransaction().begin();

          objReturn = sessao.load(classe, id );
          objReturn.toString(); // Evita Lazzy Exception, pois o primeiro acesso será realizado e o objeto será carregado

          sessao.getTransaction().commit();
          sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return objReturn;

    }
}
