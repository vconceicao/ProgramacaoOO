import java.util.ArrayList;
import java.util.StringJoiner;

public class Departamento {

    String nome;
    ArrayList<Professor> professores;

    public Departamento(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<Professor>();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Departamento.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("professores=" + professores)
                .toString();
    }
}
