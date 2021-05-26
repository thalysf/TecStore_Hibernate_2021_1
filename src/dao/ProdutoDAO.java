package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Produto;

public class ProdutoDAO {
    public void inserir(Produto prod) throws ClassNotFoundException, SQLException
    {
        String sql = "INSERT INTO PRODUTO(id_categoria, nome, preco) "
                    + "VALUES (?, ?, ?)";
        PreparedStatement pst =ConexaoPostgreSQL.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        int i = 1;
        pst.setInt(i++, prod.getCategoria().getId_categoria());
        pst.setString(i++, prod.getNome());
        pst.setDouble(i++, prod.getPreco());
        pst.execute();
        
        ResultSet res = pst.getGeneratedKeys();
        if(res.next())
        {
            int id = res.getInt(1);
            prod.setId_produto(id);
        }
        
    }
    public void excluir(Produto prod) throws ClassNotFoundException, SQLException
    {
        Statement st = ConexaoPostgreSQL.obterConexao().createStatement();
        String sql = "DELETE FROM PRODUTO WHERE id_produto = " + prod.getId_produto(); 
        st.execute(sql);
    }
    
    public void alterar (Produto prod) throws ClassNotFoundException, SQLException
    {
        String sql = "UPDATE PRODUTO SET id_categoria = ?, nome = ?, preco = ? WHERE id_produto = " + prod.getId_produto();
        PreparedStatement pst =ConexaoPostgreSQL.obterConexao().prepareStatement(sql);
        int i = 1;
        pst.setInt(i++, prod.getCategoria().getId_categoria());
        pst.setString(i++, prod.getNome());
        pst.setDouble(i++, prod.getPreco());
        pst.execute();
    }
    
    private List<Produto> pesquisar(String busca) throws ClassNotFoundException, SQLException
    {
        Statement st = ConexaoPostgreSQL.obterConexao().createStatement();
        
        String sql = "SELECT id_produto, prod.id_categoria, preco, prod.nome as nomeProd, cat.nome as nomeCat FROM produto as prod, categoria as cat WHERE prod.id_categoria  = cat.id_categoria" + busca;
        st.execute(sql);
        
        ResultSet result = st.executeQuery(sql);
        List<Produto> produtos = new ArrayList<>();
        Categoria cat;
        Produto prod;
        while(result.next())
        {
            cat = new Categoria(result.getInt("id_categoria"), result.getString("nomeCat"));
            prod = new Produto(result.getInt("id_produto"), result.getString("nomeProd"), result.getDouble("preco"), cat);
            produtos.add(prod);
        }
        return produtos;
    }
    public List<Produto> pesquisarPorNome(String nomeFiltro) throws ClassNotFoundException, SQLException
    {
        String busca = " AND prod.nome ILIKE '" + nomeFiltro + "%'"; 
        return pesquisar(busca);
    }
    public List<Produto> pesquisarPorCategoria(String categoriaFiltro) throws ClassNotFoundException, SQLException
    {
        String busca = " AND cat.nome ILIKE '" + categoriaFiltro + "%'"; 
        return pesquisar(busca);
    }
    public List<Produto> pesquisarPorNomeAndCategoria(String nomeFiltro, String categoriaFiltro) throws ClassNotFoundException, SQLException
    {
        String busca = " AND prod.nome ILIKE '" + nomeFiltro + "%' "
                       + " AND  cat.nome ILIKE '" + categoriaFiltro + "%' ";
        return pesquisar(busca);
    }
    public List<Produto> listar() throws ClassNotFoundException, SQLException
    {
        String busca = "";
        return pesquisar(busca);
    }
}
