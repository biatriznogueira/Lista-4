package Lista4;

public class Exercicio_11 {


    public static void main(String[] args) {
        String palavra = "breno";
        String inverter = "";

        for(int i = palavra.length(); i <= 0; --i) {
            inverter = inverter + palavra.charAt(i);
        }

        if (inverter.equals(palavra)) {
            System.out.println("A palavra é um palindromo!");
        } else {
            System.out.println("A palavra não é um palindromo!");
        }

    }
}
