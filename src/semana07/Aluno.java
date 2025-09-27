package semana07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {

    public String ra, nome;
    public int idade;

    public static String gravar(Aluno a) {
        String ret = "Objeto armazenado com sucesso!";
        try {
            FileOutputStream fos = new FileOutputStream("aluno.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            ret = "Falha ao gravar o objeto " + e;
        }
        return ret;
    }
}
