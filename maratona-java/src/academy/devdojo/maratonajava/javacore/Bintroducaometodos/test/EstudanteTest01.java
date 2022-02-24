package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Maynard";
        estudante01.idade = 55;
        estudante01.sexo = 'M';


        estudante02.nome = "Zack";
        estudante02.idade = 56;
        estudante02.sexo = 'M';

        estudante03.nome = "Chino";
        estudante03.idade = 45;
        estudante03.sexo = 'M';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
        impressoraEstudante.imprime(estudante03);



    }
}
