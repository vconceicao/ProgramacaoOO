public class ProgramaPrincipal {

    public static void main(String[] args) {
        System.out.println("Ok");


        Universidade uniTeste = new Universidade("UniTeste");
        Departamento cienciasExatasDepartamento = new Departamento("Ciencias Exatas");
        Departamento cienciasHumanasDepartamento = new Departamento("Ciencias Humanas");
        Professor professorJailson = new Professor("Jailson", "Matematica");
        Professor professorRubens = new Professor("Rubens", "Historia");

        cienciasExatasDepartamento.professores.add(professorJailson);
        cienciasHumanasDepartamento.professores.add(professorRubens);

        uniTeste.departamentos.add(cienciasExatasDepartamento);
        uniTeste.departamentos.add(cienciasHumanasDepartamento);

        System.out.println(uniTeste);



    }
}
