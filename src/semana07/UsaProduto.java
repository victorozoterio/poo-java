package semana07;

public class UsaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "toddy"); // Produto() é o método construtor
        p1.setCodigo(1);
        p1.setNome("sabonete");
        p1.setTipo('S');
        p1.setValor(2.34);
        p1.setNovo(true);
        System.out.println(p1); // imprime o estado atual do produto

        Produto p2 = new Produto(2, "Maionese", true);
        
    }
}
