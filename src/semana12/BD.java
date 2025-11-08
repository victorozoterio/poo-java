package semana12;

import java.sql.*;

public class BD {

    public Connection con = null; // Realiza a conexão
    public PreparedStatement st = null; // Executa as instruções
    public ResultSet rs = null;

    public final String DATABASE = "Empresa";
    public final String URL = "jdbc:postgresql://localhost:5432/" + DATABASE;
    public final String LOGIN = "postgres";
    public final String SENHA = "Senha@123";

    /**
     * Realiza a conexão ao banco de dados
     * @return - true em caso de sucesso, ou false caso contrário
     */
    public boolean getConnection() {
        try {
            con = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conexão realizada com sucesso.");
            return true;
        } catch (SQLException erro) {
            System.out.println("Falha na conexão " + erro);
            return false;
        }
    }

    public void close() {
        try {
            if(rs !=null ) {
                rs.close();
            }
        } catch (SQLException e) {

        }

        try {
            if(con != null) {
                con.close();
                System.out.println("Desconectou...");
            }
        } catch (SQLException e) {

        }

        try {
            if(st !=null ) {
                st.close();
            }
        } catch (SQLException e) {

        }
    }

    public static void main(String[] args) {
        BD bd = new BD();
        bd.getConnection();
        // Realizo a ação ...
        bd.close(); // Depois fecho o banco
    }
}
