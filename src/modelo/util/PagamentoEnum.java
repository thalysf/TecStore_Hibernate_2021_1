package modelo.util;

public enum PagamentoEnum {
    D("Dinheiro"),
    C("Cartão"),
    B("Boleto");
    
    private final String label;
    
    private PagamentoEnum(String label)
    {
        this.label = label;
    }

    public String getTipoPagamento() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
    
}
