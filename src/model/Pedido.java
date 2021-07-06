package model;

import java.util.Date;
import modelo.util.PagamentoEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import modelo.util.FuncoesUteis;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private PagamentoEnum tipoPagamento;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPedido;

    @OneToMany (mappedBy = "idComposto.pedido", 
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL )
    private List<ItemPedido> itensPedidos;

    public Pedido() {
    }

    public Pedido(int id_pedido, Cliente cliente, PagamentoEnum tipoPagamento, Date dataPedido) {
        this.id_pedido = id_pedido;
        this.cliente = cliente;
        this.tipoPagamento = tipoPagamento;
        this.dataPedido = dataPedido;
        this.itensPedidos = new ArrayList();
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PagamentoEnum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(PagamentoEnum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    @Override
    public String toString() {
        return String.valueOf(id_pedido);
    }
    
    public Object[] toArray()
    {
        return new Object[]{this, cliente.getNome(), FuncoesUteis.dateToStr(dataPedido), tipoPagamento.getTipoPagamento()};
    }
}
