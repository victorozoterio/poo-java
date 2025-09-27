package semana07;

public class AppProduto {
    public static void main(String[] args) {
        // ambos são objetos/instâncias
        Produto p1 = new Produto();
        p1.setCodigo(1);
        Produto.empresa = "Fatec";
        System.out.println(p1);

        Produto p2 = new Produto();
        p2.setCodigo(2);
        System.out.println(p2);
    }
}
