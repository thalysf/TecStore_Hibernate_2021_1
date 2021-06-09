package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Produto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produto;
    
    @Column(length = 200, nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private Double preco;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ItensPedido", 
            joinColumns  = {@JoinColumn (name="id_produto")},
            inverseJoinColumns = {@JoinColumn(name="id_pedido")}
    )
    private List<Pedido> pedidos;
    
    public Produto(int id_produto, String nome, Double preco, Categoria categoria) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public Object[] toArray()
    {
        return new Object[]{this, categoria, preco};
    }
}
