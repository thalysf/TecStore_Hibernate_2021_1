package modelo;
import modelo.util.*;
public class Usuario {
    private int id_usuario;
    private String nome;
    private String email;
    private SexoEnum sexo;
    private String senha;
    private String CPF;
    private TipoUsuarioEnum tipoUsuario;

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
