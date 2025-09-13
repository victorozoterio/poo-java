package semana05;

public class Impressora {
    /**
     * 
     */
    public static void imprimir() {
        System.out.println("Apostila de Java");
    }

    /**
     * Imprime em tela o texto recebido
     * @param texto - o texto recebido
     */
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    /**
     * Imprime em tela o texto recebido n vezes
     * @param texto - o texto a ser impresso
     * @param quantidade - a quantidade de vezes
     */
    public static void imprimir(String texto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(texto);
        }
    }

    /**
     * Imprime em tela o texto recebido em caixa alta ou caixa baixa
     * @param texto - o texto a ser impresso
     * @param caixa - para imprimir em maisculo, forneça a palavra "maiuscula"
     * ou qualquer outra coisa para imprimir em minusculo
     */
    public static void imprimir(String texto, String caixa) {
        if(caixa.equalsIgnoreCase("maiuscula")) {
            System.out.println(texto.toUpperCase());
        } else {
            System.out.println(texto.toLowerCase());
        }
    }
}
