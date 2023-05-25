
package aplicacao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    
    private Connection conn;
    private PreparedStatement ps;
    private String sqlInsert = "insert into filmes (nome, datalancamento, categoria) values (?,?,?)";
    
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cenaflix","root","1234");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean salvarDados(Filme filme){
        try {
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, filme.getNome());
            ps.setDate(2, Date.valueOf(filme.getData()));
            ps.setString(3, filme.getCategoria());
            ps.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean desconectar(){
        try {
            conn.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
}
