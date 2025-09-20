public class AppPincel {
    public static void main(String[] args) {
        Pincel p1 = new Pincel(); // valor inicial: null
        Pincel p2 = new Pincel(); // valor inicial: 0
        Pincel p3 = new Pincel(); // valor inicial: 0

        p1.mostrar();
        System.out.println("-----------------------");

        p1.cor = "azul";
        p1.preco = 2.24;
        p1.tamanho = 10;
        p1.mostrar();
        System.out.println("-----------------------");

        p1.limpar();
        p1.mostrar();
        System.out.println("-----------------------");

        p3.abrirTampa();
        p3.preco = 3.45;
        p3.mostrar();
        p3.fecharTampa();
    }
}
