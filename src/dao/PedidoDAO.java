/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Pedido;
import modelo.util.PagamentoEnum;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author thaly
 */
public class PedidoDAO extends GenericDAO {

    public List<Pedido> pesquisar(PagamentoEnum pagEnum, String dataInicioFormatada, String dataFimFormatada, Integer codigo, String cliente) throws HibernateException {
        Session sessao = null;
        List list = new ArrayList<>();
        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Pedido.class);
            consulta.setFetchMode("itensPedidos", FetchMode.JOIN); // forçando Join com a tabela itens de pedido
            consulta.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY); // evita repetição por conta da junção feita antes c
            consulta.addOrder(Order.desc("dataPedido"));
            if (pagEnum != null) {
                   consulta.add(Restrictions.eq("tipoPagamento", pagEnum));
            }
            if (dataInicioFormatada != null) {
                if (!dataInicioFormatada.isEmpty()) {
                    consulta.add(Restrictions.sqlRestriction("dataPedido >= '" + dataInicioFormatada +"'"));
                }

            }
            if (dataFimFormatada != null) {
                if (!dataFimFormatada.isEmpty()) {
                    consulta.add(Restrictions.sqlRestriction("dataPedido <= '" + dataFimFormatada +"'"));
                }
            }
            if (codigo != null) {
                if (codigo > 0) {
                    consulta.add(Restrictions.eq("id_pedido", codigo));
                }
            }
            if (cliente != null) {
                if (!cliente.isEmpty()) {
                    consulta.createAlias("cliente", "clien");
                    consulta.add(Restrictions.ilike("clien.nome", cliente + "%"));
                }
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
}
