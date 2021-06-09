package modelo.util;

public enum PagamentoEnum {
    D("Dinheiro"),
    C("Cartão"),
    H("Cheque");
    
    private final String label;
    
    private PagamentoEnum(String label)
    {
        this.label = label;
    }

    public String getTipoPagamento() {
        return label;
    }
}
