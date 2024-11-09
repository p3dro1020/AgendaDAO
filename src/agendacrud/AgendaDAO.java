package agendacrud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgendaDAO {
    private Connection con;
    private PreparedStatement cmd;
    
    public int inserir(Contato contato)
    {
        try{
            String sql = "INSERT INTO contato (nome,grupo,telefone) "
                    + "VALUES(?,?,?)";
            con = Conexao.conectar();
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, contato.getNome());
            cmd.setString(2, contato.getGrupo());
            cmd.setString(3, contato.getNumero());
            
            if(cmd.executeUpdate() > 0)
            {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            }
            return -1;
        } catch(SQLException e)
        {
            System.out.println("ERRO: "+e.getMessage());
            return -1;
        }finally
        {
            Conexao.desconectar(con);
        }
    }
    
    public List<Contato> listar()
    {
        try
        {
            String sql = "SELECT id_contato, nome, grupo,telefone FROM contato";
            con = Conexao.conectar();
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            List<Contato> lista = new ArrayList<>();
            while(rs.next())
            {
                int id = rs.getInt("id_contato");
                String nome = rs.getString("nome");
                String grupo = rs.getString("grupo");
                String telefone = rs.getString("telefone");
                Contato c = new Contato(telefone,nome,grupo);
                c.setId(id);
                lista.add(c);
            }
            return lista;
        }
        catch(SQLException e)
        {
            System.out.println("ERRO: "+e.getMessage());
            return null;
        }
        finally
        {
            Conexao.desconectar(con);
        }
    }
    
    public int deletar(int id)
    {
        try {
            String sql = "DELETE FROM contato WHERE id_contato = ?;";
            con = Conexao.conectar();
            cmd = con.prepareStatement(sql);

            cmd.setInt(1, id);

            int rowsAffected = cmd.executeUpdate();

            if (rowsAffected > 0) {
                return id;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }

    }
    
    public int atualizar(Contato contato)
    {
        try{
            String sql = "UPDATE contato SET nome=?,grupo=?,telefone=? WHERE id_contato=?";
            con = Conexao.conectar();
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, contato.getNome());
            cmd.setString(2, contato.getGrupo());
            cmd.setString(3, contato.getNumero());
            cmd.setInt(4, contato.getId());
            
            if(cmd.executeUpdate() > 0)
            {
               return contato.getId();
            }
            return -1;
        } catch(SQLException e)
        {
            System.out.println("ERRO: "+e.getMessage());
            return -1;
        }finally
        {
            Conexao.desconectar(con);
        }
    }
    
}
