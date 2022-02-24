package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Lucros: ");
        if (salarios == null) {
            return;
        }
        for (double num : this.salarios) {
            System.out.print("£" + num + "|");
        }


        imprimeMedia();
    }

    public void imprimeMedia() {

        for (double num : this.salarios) {
            media += num;
        }
        media /= salarios.length;
        if (media == 0) {
            return;
        }
        System.out.println("\n" + "Média dos lucros: " + media);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
