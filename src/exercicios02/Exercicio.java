import java.util.List;
import java.util.Random;

public class Exercicio {

    // a) Método que recebe uma palavra e apresenta as letras separadas
    public void separarLetras(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }

    // b) Método que recebe um número entre 1 e 10 e valida
    public void validarNumero(int numero) {
        if (numero >= 1 && numero <= 10) {
            for (int i = 0; i < 10, i++) {
                System.ou.println(numero + ' x ' + i + ' = ' + (numero * i));
            }
        } else {
            System.out.println("Número inválido.");
        }
    }

    // c) Método que imprime 5 números aleatórios entre 1 e 100
    public void imprimirNumerosAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(100) + 1);
        }
    }

    // d) Método que recebe um número de 1 a 7 e mostra o dia da semana
    public void mostrarDiaSemana(int numero) {
        switch (numero) {
            case 1: System.out.println("domingo"); break;
            case 2: System.out.println("segunda"); break;
            case 3: System.out.println("terça"); break;
            case 4: System.out.println("quarta"); break;
            case 5: System.out.println("quinta"); break;
            case 6: System.out.println("sexta"); break;
            case 7: System.out.println("sábado"); break;
            default: System.out.println("inexistente"); break;
        }
    }

    // e) Método que recebe uma lista de nomes e imprime os nomes existentes
    public void imprimirNomesValidos(List<String> nomes) {
        for (String nome : nomes) {
            if (nome != null && !nome.isEmpty()) {
                System.out.println(nome);
            }
        }
    }

    // f) Método que retorna a quantidade de números pares em uma lista
    public int contarPares(List<Integer> numeros) {
        int count = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // g) Método que recebe um array de 10 elementos e retorna a soma
    public int somaArray(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    // h) Método que recebe notas e retorna a média
    public double calcularMedia(double... notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // i) Método que retorna um vetor com números aleatórios entre 0 e n2
    public int[] gerarNumerosAleatorios(int n1, int n2) {
        Random rand = new Random();
        int[] numeros = new int[n1];
        for (int i = 0; i < n1; i++) {
            numeros[i] = rand.nextInt(n2 + 1); // inclui 0 até n2
        }
        return numeros;
    }

    // j) Método que verifica se o número de CPF é válido
    public boolean validarCPF(String cpf) {
        if (cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
            return true;
        }
        return false;
    }
}
