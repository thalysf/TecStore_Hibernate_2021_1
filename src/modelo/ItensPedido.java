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

    public ItensPedido(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
