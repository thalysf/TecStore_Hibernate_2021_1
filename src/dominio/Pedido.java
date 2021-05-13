package dominio;

import dominio.util.PagamentoEnum;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private PagamentoEnum tipoPagamento;

    public Pedido(List<Produto> produtos, PagamentoEnum tipoPagamento) {
        this.produtos = produtos;
        this.tipoPagamento = tipoPagamento;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public PagamentoEnum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(PagamentoEnum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    
}
