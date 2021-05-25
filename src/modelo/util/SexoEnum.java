package modelo.util;

public enum SexoEnum {
    MASCULINO("M"),
    FEMININO("F");
    
    private final String sexo;
    
    private SexoEnum(String sexo)
    {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
}
