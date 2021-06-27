package modelo;
import modelo.util.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String email;
    
    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private SexoEnum sexo;
   
  
    @Column(nullable = false, length = 14)
    private String CPF;
    
    @OneToMany ( mappedBy = "usuario", fetch = FetchType.LAZY )
    private List<Pedido> pedidos = new ArrayList();

    public Cliente() {
    }

    
    public Cliente(int id_usuario, String nome, String email, SexoEnum sexo, String CPF) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.CPF = CPF;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    } 

    @Override
    public String toString() {
        return nome;
    }

    public Object[] toArray() {
         return new Object[]{this, nome, email, CPF, sexo};
    }
}
