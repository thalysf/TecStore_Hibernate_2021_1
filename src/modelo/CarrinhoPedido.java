/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Map;

/**
 *
 * @author thaly
 */
public class CarrinhoPedido {
    Map<Produto, Integer> produtos;
    private Pedido pedido;

    public CarrinhoPedido(Map<Produto, Integer> produtos, Pedido pedido) {
        this.produtos = produtos;
        this.pedido = pedido;
    }

    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<Produto, Integer> produtos) {
        this.produtos = produtos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    
}
