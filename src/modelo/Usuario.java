package modelo;
import modelo.util.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable{
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
   
    @Column(nullable = false, length = 120)
    private String senha;
    
    @Column(nullable = false, length = 14)
    private String CPF;
    
    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoUsuarioEnum tipoUsuario;
    
    @OneToMany ( mappedBy = "usuario", fetch = FetchType.LAZY )
    private List<Pedido> pedidos = new ArrayList();

    public Usuario(int id_usuario, String nome, String email, SexoEnum sexo, String senha, String CPF, TipoUsuarioEnum tipoUsuario) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.senha = senha;
        this.CPF = CPF;
        this.tipoUsuario = tipoUsuario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public TipoUsuarioEnum getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    
}
