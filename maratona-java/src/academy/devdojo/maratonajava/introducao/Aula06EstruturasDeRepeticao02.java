package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares até dez mil

        for (int i = 0; i <= 10000 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}
