package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //     +  -  /  *
        double number01 = 10;
        double number02 = 20;
        double division = number01 / number02;

        System.out.println("The value is "+division);

        // %

        int resto = 20 % 2;
        System.out.println(resto);

        // < >  <= >= == !=

        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenUnequalToTen = 10 != 10;
        System.out.println("isTenBiggerThanTwenty --> "+isTenBiggerThanTwenty);
        System.out.println("isTenSmallerThanTwenty --> "+isTenSmallerThanTwenty);
        System.out.println("isTenEqualToTwenty --> "+isTenEqualToTwenty);
        System.out.println("isTenEqualToTen --> "+isTenEqualToTen);
        System.out.println("isTenUnequalToTen --> "+isTenUnequalToTen);


        // && || !

        int age = 29;
        float salary = 3500F;

        boolean isLegalOlderThanThirty = age > 30 && salary >= 4612;
        boolean isLegalUnderThirty = age < 30 && salary >= 3381;

        System.out.println("is Legal Older Than Thirty --> " + isLegalOlderThanThirty);
        System.out.println("is Legal Under Thirty --> " + isLegalUnderThirty);

        double totalValueCheckingAccount = 200;
        double totalValueSavingsAccount = 10000;
        float play5Price = 5000F;

        boolean isPlay5Purchasable = totalValueCheckingAccount > play5Price || totalValueSavingsAccount > play5Price;

        System.out.println("Is Ps5 purchasable? --> "+isPlay5Purchasable);


        // =  +=  *= /=  %=

        double salary2 = 1000; // 1800
        double bonus = 1800;
        bonus += salary2;      // 2800
        bonus -= salary2;     // 1800
        bonus *= 2;     // 3600
        bonus /= 2;     //1800
        bonus %= 2;     //1800
        boolean evenOrOdd = bonus == 0;
        System.out.println("Is bonus an even number? --> " + evenOrOdd);

        // ++  --
        int incrementador = 0; // contador + 1;
        incrementador += 1;
        incrementador++;
        incrementador--;
        ++incrementador;
        --incrementador;
        int contador2 = 0;

        System.out.println(++contador2);


    }
}
