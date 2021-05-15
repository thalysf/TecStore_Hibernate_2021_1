package modelo.util;

public enum PagamentoEnum {
    DINHEIRO("Dinheiro"),
    CARTAO("Cartão"),
    CHEQUE("Cheque");
    
    private final String tipoPagamento;
    
    private PagamentoEnum(String tipoPagamento)
    {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}
