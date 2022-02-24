package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário for maior do que 5000
        double salary = 6000;
        String messageDonate = "Eu vou doar 500 pro DevDojo";
        String messageNoDonate = "Ainda não tenho condições, mas vou ter.";
        //(condição) ? verdadeiro : falso
        String result = salary > 5000 ? messageDonate : messageNoDonate;

        System.out.println(result);
    }
}
