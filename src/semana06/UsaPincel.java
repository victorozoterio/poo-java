public class UsaPincel {
    public static void main(String[] args) {
        Pincel p; // reserva espaço para armazenar objeto pincel
        // p.cor = "verde";
        p = new Pincel(); // cria objeto e atribui valores iniciais


        // Pincel --> Classe
        // pincel --> objeto/instância
        Pincel pincel = new Pincel();
        pincel.cor = "azul";
        pincel.preco = 3.45;
        pincel.tamanho = 10;
    }
}
