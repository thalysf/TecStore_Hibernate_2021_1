/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author thalys
 */
@Entity
public class ItensPedido implements Serializable{
    @EmbeddedId
    private ItensPedidoPK idComposto;
    
    @Column(nullable = false)
    private int quantidade;

    public ItensPedido() {
    }

    public ItensPedido(Pedido pedido, Produto produto, int quantidade) {
        this.idComposto = new ItensPedidoPK(pedido, produto);
        this.quantidade = quantidade;
    }

    public ItensPedidoPK getIdComposto() {
        return idComposto;
    }

    public void setIdComposto(ItensPedidoPK idComposto) {
        this.idComposto = idComposto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
