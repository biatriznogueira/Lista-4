package Lista4;

public class Exercicio_12 {


    public static void main(String[] args) {
        boolean ePrimo = true;
        int numero = 7;

        for(int i = 2; i < numero; ++i) {
            if (numero % i == 0) {
                ePrimo = false;
            }
        }

        if (ePrimo) {
            System.out.println("O numero é primo!");
        } else {
            System.out.println("Não é um primo!");
        }

    }
}
