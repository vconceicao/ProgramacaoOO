import java.util.StringJoiner;

public class Professor {

    String nome;
    String materia;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Professor.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("materia='" + materia + "'")
                .toString();
    }
}
