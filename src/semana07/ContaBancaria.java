package semana07;

public class ContaBancaria {
    private int numero;
    public String titular; // não encapsulado
    private double saldo;
    private final int VALOR_MAXIMO_DE_SAQUE = 1000; //

    public static void fazerPix(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
    }

    /**
     * Retorna o estado atual do objeto em tipo String
     */
    public String toString() {
        return "[" + numero + ";" + titular + ";" + saldo + "]";
    }

    /**
     * Debita o saldo a partir do valor recebido
     * @param valor
     * @return
     */
    public String sacar(double valor) {
        String ret = "Saque realizado com sucesso";
        if(valor >= VALOR_MAXIMO_DE_SAQUE) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                ret = "Saldo insuficiente para o saque";
            }
        } else {
            ret = "O limite para saque é " + VALOR_MAXIMO_DE_SAQUE;
        }

        return ret;
    }

    /*
     * Em um ambiente encapsulado é possível definir regras de negócios
     */

    /**
     * Recebe um valor positivo e o adiciona ao saldo
     * @param valor - o valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    /**
     * Retorna o valor atual do saldo
     * @return
     */
    public double consultar() {
        return saldo;
    }

    /**
     * Armazena o número da conta que deve ser superior a 0.
     * @param n
     */
    public void definirNumero(int n) {
        if (n > 0) {
            numero = n;
        }
    }

    public int pegarNumero() {
        return numero;
    }
}
