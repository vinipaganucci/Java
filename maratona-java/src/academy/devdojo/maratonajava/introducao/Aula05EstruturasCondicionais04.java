package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salaryPerson = 70000;
        double percentage1 = salaryPerson * 0.097;
        double percentage2 = salaryPerson * 0.3735;
        double percentage3 = salaryPerson * 0.495;
        double result;

        if (salaryPerson < 34713){
            result = percentage1;
        }
        else if (salaryPerson >= 34713 && salaryPerson < 68507) {
            result = percentage2;
        }
        else {
            result = percentage3;
        }

        System.out.println("Will be taken £"+result+" per year from your salary");




    }
}
