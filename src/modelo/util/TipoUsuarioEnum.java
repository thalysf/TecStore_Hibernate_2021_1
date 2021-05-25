/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.util;

/**
 *
 * @author thaly
 */
public enum TipoUsuarioEnum {
    ADMINISTRADOR("A"),
    CLIENTE("C");
    
    private final String tipo;
    
    private TipoUsuarioEnum(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
