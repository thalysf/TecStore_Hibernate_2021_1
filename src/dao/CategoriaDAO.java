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
}