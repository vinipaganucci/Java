package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Renato");
        funcionario01.setIdade(34);
        funcionario01.setSalarios(new double[]{8000,2000,5000});
        funcionario01.imprime();





    }
}
