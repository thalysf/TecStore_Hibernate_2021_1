package modelo;

public class Produto {
    private int id_produto;
    private String nome;
    private Double preco;
    private Categoria categoria;

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

    
}
