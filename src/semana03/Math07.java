package semana03;

public class Math07 {
    public static void main(String[] args) {
        String[] alunos = {"João", "Maria", "Pedro", "Ana", "Bruno", "Carla", "David", "Eva", "Fábio", "Gustavo"};

        int indiceSorteado = (int) (Math.random() * alunos.length);
        System.out.println(alunos[indiceSorteado]);
    }
}
