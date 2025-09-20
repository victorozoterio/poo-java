// ExerciciosTest.java
import java.util.Arrays;
import java.util.List;

public class ExerciciosTest {
    public static void main(String[] args) {

        Exercicio ex = new Exercicio();

        System.out.println("a) separarLetras:");
        ex.separarLetras("Programar");

        System.out.println("\nb) tabuadaDeUm:");
        ex.tabuadaDeUm(7);
        ex.tabuadaDeUm(15); // fora da faixa

        System.out.println("\nc) imprimirNumerosAleatorios:");
        ex.imprimirNumerosAleatorios();

        System.out.println("\nd) mostrarDiaSemana:");
        ex.mostrarDiaSemana(1);
        ex.mostrarDiaSemana(8);

        System.out.println("\ne) imprimirNomes:");
        List<String> nomes = Arrays.asList("Ana", "Bruno", "", "Carla", null, "Diego");
        ex.imprimirNomes(nomes);

        System.out.println("\nf) contarPares:");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 6, 9, 10);
        System.out.println("Qtd pares = " + ex.contarPares(numeros));

        System.out.println("\ng) somaArray:");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Soma = " + ex.somaArray(arr));

        System.out.println("\nh) mediaDeQuatro:");
        System.out.println("Média = " + ex.mediaDeQuatro(7.5, 8.0, 6.0, 9.0));

        System.out.println("\ni) gerarNumerosAleatorios:");
        int[] aleatorios = ex.gerarNumerosAleatorios(5, 20);
        System.out.println("Vetor: " + Arrays.toString(aleatorios));

        System.out.println("\nj) validarCPF:");
        System.out.println(ex.validarCPF("123.456.789-09")); // true (formato)
        System.out.println(ex.validarCPF("12345678909"));    // false
    }
}
