package semana05;

public class UsaImpressora {
    public static void main(String[] args) {
        Impressora.imprimir();
        Impressora.imprimir();
        Impressora.imprimir("Outra coisa");
        Impressora.imprimir("Eu amo Java", 30);
        Impressora.imprimir("Eu amo Java", "maiuscula");
    }
}
