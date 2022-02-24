package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valor da parcela >= 1000
    public static void main(String[] args) {

        double carValue = 30000;
        for (int parcel = 1; parcel <= carValue; parcel++) {
            double parcelValue = carValue / parcel;
            if (parcelValue < 1000) {
                break;
            }
            System.out.println("Parcel " + parcel + " £" + parcelValue);


        }
    }
}
