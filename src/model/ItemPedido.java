/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author thalys
 */
@Entity
public class ItemPedido implements Serializable{
    @EmbeddedId
    private ItemPedidoPK idComposto;
    
    @Column(nullable = false)
    private int quantidade;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
        this.idComposto = new ItemPedidoPK(pedido, produto);
        this.quantidade = quantidade;
    }

    public ItemPedidoPK getIdComposto() {
        return idComposto;
    }

    public void setIdComposto(ItemPedidoPK idComposto) {
        this.idComposto = idComposto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
