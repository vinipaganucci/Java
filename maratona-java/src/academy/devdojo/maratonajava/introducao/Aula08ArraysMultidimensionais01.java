package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 5;
        notasAlunos[0][1] = 4;
        notasAlunos[0][2] = 3;
        notasAlunos[0][3] = 2;

        notasAlunos[1][0] = 4;
        notasAlunos[1][1] = 2.3;
        notasAlunos[1][2] = 3.5;
        notasAlunos[1][3] = 2;

        notasAlunos[2][0] = 4;
        notasAlunos[2][1] = 2.3;
        notasAlunos[2][2] = 3.5;
        notasAlunos[2][3] = 2;


        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j]);
            }

        }
        System.out.println("---------------------------------------------------");
        for (double [] arrayBase: notasAlunos) {
            for (double num : arrayBase) {
                System.out.println(num);
            }

        }

    }

}

