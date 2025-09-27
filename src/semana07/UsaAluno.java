package semana07;

public class UsaAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Paulo";
        a.ra = "123";
        a.idade = 20;

        System.out.println(Aluno.gravar(a));
    }
}
