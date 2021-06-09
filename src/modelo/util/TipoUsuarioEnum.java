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
    A("Administrador"),
    C("Cliente");
    
    private final String label;
    
    private TipoUsuarioEnum(String label)
    {
        this.label = label;
    }

    public String getTipo() {
        return label;
    }
}
