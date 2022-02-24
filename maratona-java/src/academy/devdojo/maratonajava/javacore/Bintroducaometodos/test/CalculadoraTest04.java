package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int number1 = 1;
        int number2 = 2;


        calculadora.alteraDoisNumeros(number1,number2);
        System.out.println("Dentro do Teste");
        System.out.println("Num1 "+number1);
        System.out.println("Num2 "+number2);

    }
}
