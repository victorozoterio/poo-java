import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Arquivo {
    public static void main(String[] args) {
        gravar();
       try {
           salvar();
       } catch (FileNotFoundException e) {}
    }

    public static void gravar() {
        try {
            PrintWriter pw = new PrintWriter("ar.txt");
        } catch (FileNotFoundException e) {}
    }

    // quem chamar esse metodo terá que tratar o erro
    public static void salvar() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("ar.txt");
    }
}
