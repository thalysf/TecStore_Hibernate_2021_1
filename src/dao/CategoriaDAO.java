package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

public class CategoriaDAO {
    public List<Categoria> listar() throws ClassNotFoundException, SQLException
    {
        Statement statement = ConexaoPostgreSQL.obterConexao().createStatement();
        String sql = "SELECT * FROM CATEGORIA";
        ResultSet result = statement.executeQuery(sql);
        
        List<Categoria> listCat = new ArrayList<>();
        Categoria cat;
        while(result.next())
        {
            cat = new Categoria(result.getInt("id_categoria"), result.getString("nome"));
            listCat.add(cat);
        }
        return listCat;
    }
    public void inserir(Categoria cat) throws ClassNotFoundException, SQLException
    {
        String sql = "INSERT INTO CATEGORIA(nome) VALUES (?)";
        PreparedStatement pst =ConexaoPostgreSQL.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setString(1, cat.getNome());
        pst.execute();
        ResultSet res = pst.getGeneratedKeys();
        if(res.next())
        {
            int id = res.getInt(1);
            cat.setId_categoria(id);
        }
    }
}