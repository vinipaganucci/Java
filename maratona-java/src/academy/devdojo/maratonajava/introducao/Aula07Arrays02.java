package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, long, int, long, float e double 0
        // char  '\u0000' ' '
        // boolean false
        // String null

        String[] names = new String[4];
        names [0] = "Carlos 1";
        names [1] = "Carlos 2";
        names [2] = "Carlos 3";
        names [3] = "Carlos 4";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
