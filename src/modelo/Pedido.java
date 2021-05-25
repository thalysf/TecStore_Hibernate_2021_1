package modelo;

import java.util.Date;
import modelo.util.PagamentoEnum;

public class Pedido {
    private int id_pedido;
    private Usuario usuario;
    private PagamentoEnum tipoPagamento;
    private Date dataPedido;
    private Double valorTotalPedido;

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
