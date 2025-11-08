package semana12;

import java.sql.SQLException;

public class ProdutoConsultar {
    public static void main(String[] args) {
        lerTodos();
        lerComFiltroDeNome("Sa");
    }

    public static void lerTodos() {
        BD bd = new BD();

        if (bd.getConnection() == true) {
            String sql = "SELECT * FROM produtos";

            try {
                bd.st = bd.con.prepareStatement(sql); // prepara o sql para ser executado
                bd.rs = bd.st.executeQuery(); // executa o sql
                while (bd.rs.next()) { // enquanto existir uma próxima linha, executa oq está dentro do laço
                    System.out.println(bd.rs.getInt("codigo"));
                    System.out.println(bd.rs.getString("nome"));
                    System.out.println(bd.rs.getInt("qtdeEstoque"));
                    System.out.println(bd.rs.getDouble("preco"));
                    System.out.println("-----------------------------------");
                }

            } catch (SQLException e) {
                System.out.println("Deu erro: " + e);
            } finally {
                bd.close();
            }
        } else {
            System.out.println("Falha na conexão, tente novamente mais tarde!");
        }
    }

    public static void lerComFiltroDeNome(String nome) {
        BD bd = new BD();

        if (bd.getConnection() == true) {
            String sql = "SELECT * FROM produtos WHERE nome LIKE ?";

            try {
                bd.st = bd.con.prepareStatement(sql); // prepara o sql para ser executado
                bd.st.setString(1, "%" + nome + "%");
                bd.rs = bd.st.executeQuery(); // executa o sql
                while (bd.rs.next()) { // enquanto existir uma próxima linha, executa oq está dentro do laço
                    System.out.println(bd.rs.getInt("codigo")); // posso referenciar pelo nome, ou pelo número da coluna, ex: 1
                    System.out.println(bd.rs.getString("nome")); // posso referenciar pelo nome, ou pelo número da coluna, ex: 2
                    System.out.println(bd.rs.getInt("qtdeEstoque")); // posso referenciar pelo nome, ou pelo número da coluna, ex: 3
                    System.out.println(bd.rs.getDouble("preco")); // posso referenciar pelo nome, ou pelo número da coluna, ex: 4
                    System.out.println("-----------------------------------");
                }

            } catch (SQLException e) {
                System.out.println("Deu erro: " + e);
            } finally {
                bd.close();
            }
        } else {
            System.out.println("Falha na conexão, tente novamente mais tarde!");
        }
    }
}
