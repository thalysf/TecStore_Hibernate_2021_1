package modelo.util;

public enum SexoEnum {
    M("Masculino"),
    F("Feminino");
    
    private final String label;
    
    private SexoEnum(String label)
    {
        this.label = label;
    }

    public String getSexo() {
        return label;
    }
}
