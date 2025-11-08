package semana12;

import java.sql.SQLException;
import java.util.List;

public class ProdutoListar {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        System.out.println(dao.toCSV());
//        dao.setCodigo(5);
//        dao.setNome("Ypê");
//        dao.setQtdeEstoque(10);
//        dao.setPreco(10.45);
//        // System.out.println(dao.inserir());
//        // System.out.println(dao.alterar());
//        System.out.println(dao.excluir());
//
//        List<Produto> lista = dao.getAll();
//        for(Produto p : lista) {
//            System.out.println(p);
//        }
    }
}
