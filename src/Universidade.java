import java.util.ArrayList;
import java.util.StringJoiner;

public class Universidade {

    String nome;
    public ArrayList<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<Departamento>();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Universidade.class.getName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("departamentos=" + departamentos)
                .toString();
    }
}
