package modelo;

import java.util.Date;
import modelo.util.PagamentoEnum;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private PagamentoEnum tipoPagamento;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPedido;

    @Column(nullable = false)
    private Double valorTotalPedido;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ItensPedido", 
            joinColumns  = {@JoinColumn (name="id_pedido")},
            inverseJoinColumns = {@JoinColumn(name="id_produto")}
    )
    private List<Produto> produtos;

    public Pedido(int id_pedido, Usuario usuario, PagamentoEnum tipoPagamento, Date dataPedido, Double valorTotalPedido) {
        this.id_pedido = id_pedido;
        this.usuario = usuario;
        this.tipoPagamento = tipoPagamento;
        this.dataPedido = dataPedido;
        this.valorTotalPedido = valorTotalPedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
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

}
