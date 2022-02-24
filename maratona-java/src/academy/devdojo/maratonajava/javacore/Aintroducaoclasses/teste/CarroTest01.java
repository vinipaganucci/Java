package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.name = "Chevrolet";
        carro.model = "Onix";
        carro.year = 2018;

        carro2.name = "Fiat";
        carro2.model = "Freemont";
        carro2.year = 2015;

        carro = carro2;

        System.out.println("Car 01 name: " + carro.name + " | Car Model: " + carro.model + " | Car Year: " + carro.year);
        System.out.println("Car 02 name: " + carro2.name + " | Car Model: " + carro2.model + " | Car Year: " + carro2.year);


    }
}
