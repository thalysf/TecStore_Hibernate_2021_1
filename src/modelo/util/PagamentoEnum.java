package modelo.util;

public enum PagamentoEnum {
    DINHEIRO("D"),
    CARTAO("C"),
    CHEQUE("H");
    
    private final String tipoPagamento;
    
    private PagamentoEnum(String tipoPagamento)
    {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}
