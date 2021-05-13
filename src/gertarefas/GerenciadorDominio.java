/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gertarefas;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thalys
 */
public class GerenciadorDominio {

    public GerenciadorDominio() {
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
