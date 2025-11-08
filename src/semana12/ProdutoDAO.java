package semana12;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO extends Produto {

    public List<Produto> lista = new ArrayList<Produto>();

    public String toCSV() {
        String s = "Arquivo CSV gerado com sucesso";
        BD bd = new BD();
        bd.getConnection();
        String sql = "SELECT * FROM produtos";

        try {
            PrintWriter pw = new PrintWriter("produtos.csv");
            bd.st = bd.con.prepareStatement(sql); // prepara o sql para ser executado
            bd.rs = bd.st.executeQuery();
            while (bd.rs.next()) {
                pw.print(bd.rs.getInt(1) + ";");
                pw.print(bd.rs.getString(2) + ";");
                pw.print(bd.rs.getInt(3) + ";");
                pw.print(bd.rs.getDouble(4) + "\n");
            }
            pw.close();
        } catch (Exception e) {
            s = "Falha ao gerar arquivo CSV";
            return null;
        } finally {
            bd.close();
        }
           return s;
    }

    /**
     * Excluí um produto do banco de dados
     * @return - Uma mensagem contendo o resultado da operação
     */
    public String excluir() {
        String s = "Produto excluído com sucesso!";
        BD bd = new BD();
        bd.getConnection();
        String sql = "DELETE FROM produtos where codigo=?";

        try {
            bd.st = bd.con.prepareStatement(sql); // prepara o sql para ser executado
            bd.st.setInt(1, getCodigo());

            int numeroDeLinhasAfetadas = bd.st.executeUpdate();
            if (numeroDeLinhasAfetadas == 0) {
                s = "Produto não encontrado!";
            }
        } catch (SQLException e) {
            s = "Falha na exclusão do produto " + e;
        } finally {
            bd.close();
        }

        return s;
    }

    /**
     * Altera um produto do banco de dados
     * @return - Uma mensagem contendo o resultado da operação
     */
    public String alterar() {
        String s = "Produto alterado com sucesso!";
        BD bd = new BD();
        bd.getConnection();
        String sql = "UPDATE produtos SET nome=?, qtdeEstoque=?, preco=? where codigo=?";

        try {
            bd.st = bd.con.prepareStatement(sql); // prepara o sql para ser executado
            bd.st.setInt(4, getCodigo());
            bd.st.setString(1, getNome());
            bd.st.setInt(2, getQtdeEstoque());
            bd.st.setDouble(3, getPreco());

            int numeroDeLinhasAfetadas = bd.st.executeUpdate();
            if (numeroDeLinhasAfetadas == 0) {
                s = "Produto não encontrado!";
            }
        } catch (SQLException e) {
            s = "Falha na alteração do produto " + e;
        } finally {
            bd.close();
        }

        return s;
    }

    /**
     * Insere no banco de dados o estado atual do produto
     * Antes de realizar a inclusão o produto deve estar preenchido
     * @return - Uma mensagem contendo o resultado da operação
     */
    public String inserir() {
        String s = "Produto inserido com sucesso!";
        BD bd = new BD();
        bd.getConnection();
        String sql = "INSERT INTO produtos VALUES (?, ?, ?, ?)";

        try {
            bd.st = bd.con.prepareStatement(sql); // prepara o sql para ser executado
            bd.st.setInt(1, getCodigo());
            bd.st.setString(2, getNome());
            bd.st.setInt(3, getQtdeEstoque());
            bd.st.setDouble(4, getPreco());

            int numeroDeLinhasAfetadas = bd.st.executeUpdate();
        } catch (SQLException e) {
            s = "Falha na inserção do produto " + e;
        } finally {
            bd.close();
        }

        return s;
    }

    /**
     * Retorna uma lista contendo todos os produtos da tabela
     * @return - lista de produtos
     */
    public List<Produto> getAll() {
        BD bd = new BD();
        bd.getConnection();
        String sql = "SELECT * FROM produtos";

        try {
            bd.st = bd.con.prepareStatement(sql); // prepara o sql para ser executado
            bd.rs = bd.st.executeQuery(); // executa o sql
            while (bd.rs.next()) { // enquanto existir uma próxima linha, executa oq está dentro do laço
                Produto p = new Produto(bd.rs.getInt(1), bd.rs.getString(2), bd.rs.getInt(3), bd.rs.getDouble(4));
                lista.add(p);
            }
            return lista;
        } catch (SQLException e) {
            return null;
        } finally {
            bd.close();
        }
    }
}
