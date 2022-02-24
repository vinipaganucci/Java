package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "João";
        professor.idade = 24;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome + " | Idade: " + professor.idade + " | Sexo: " + professor.sexo);
    }
}
