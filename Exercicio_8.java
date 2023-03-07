package Lista4;

public class Exercicio_8 {

    public static int SomaDosNumeros(int N1, int N2, int N3) {
        return N1 + N2 + N3;
    }

    public static void main(String[] args) {
        int ValorDaSoma = SomaDosNumeros(50, 5, 39);
        double media = (double)(ValorDaSoma / 3);
        System.out.println(media);
    }
}
