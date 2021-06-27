package modelo;

import java.util.Date;
import modelo.util.PagamentoEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Cliente usuario;

    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private PagamentoEnum tipoPagamento;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPedido;

    @Column(nullable = false)
    private Double valorTotalPedido;

    @OneToMany (mappedBy = "idComposto.pedido", 
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL )
    private List<ItemPedido> itensPedidos;

    public Pedido() {
    }

    public Pedido(int id_pedido, Cliente usuario, PagamentoEnum tipoPagamento, Date dataPedido, Double valorTotalPedido) {
        this.id_pedido = id_pedido;
        this.usuario = usuario;
        this.tipoPagamento = tipoPagamento;
        this.dataPedido = dataPedido;
        this.valorTotalPedido = valorTotalPedido;
        this.itensPedidos = new ArrayList();
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
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

    public Double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(Double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }
}
