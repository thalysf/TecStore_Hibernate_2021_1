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
        
    }
    public void excluir(Produto prod) throws ClassNotFoundException, SQLException
    {
        
    }
    
    public void alterar (Produto prod) throws ClassNotFoundException, SQLException
    {
        
    }
    
    private List<Produto> pesquisar(String busca) throws ClassNotFoundException, SQLException
    {
        return null;
    }
    public List<Produto> pesquisarPorNome(String nomeFiltro) throws ClassNotFoundException, SQLException
    {
        return null;
    }
    public List<Produto> pesquisarPorCategoria(String categoriaFiltro) throws ClassNotFoundException, SQLException
    {
        return null;
    }
    public List<Produto> pesquisarPorNomeAndCategoria(String nomeFiltro, String categoriaFiltro) throws ClassNotFoundException, SQLException
    {
        return null;
    }
    public List<Produto> listar() throws ClassNotFoundException, SQLException
    {
        return null;
    }
}
