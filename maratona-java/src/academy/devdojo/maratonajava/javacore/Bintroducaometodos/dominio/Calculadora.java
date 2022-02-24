package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divideDoisNumeros(double num1, double num2) {
        if (num1 == 0) {
            System.out.println("Valor inválido");


        } else if (num2 == 0) {
            System.out.println("Valor inválido");

        } else {
            System.out.println(num1 / num2);
        }


    }


    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro da Classe");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

    }

    public void somaDeVariosNumeros(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;

        }

        System.out.println(soma);
    }


}







