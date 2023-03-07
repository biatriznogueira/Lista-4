package Lista4;

public class Exercicio_6 {

    public static void main(String[] args) {
        double[] temperaturas = new double[]{23.0, 34.0, 31.0, 43.0, 29.0, 19.0, 25.0};
        double menorTemp = 2.147483647E9;
        double maiorTemp = -2.147483648E9;
        double somaDasTemperaturas = 0.0;
        double diasDaSemana = 0.0;
        double[] var12 = temperaturas;
        int var13 = temperaturas.length;

        int var14;
        double temperatura;
        for(var14 = 0; var14 < var13; ++var14) {
            temperatura = var12[var14];
            if (temperatura < menorTemp) {
                menorTemp = temperatura;
            }

            if (temperatura > maiorTemp) {
                maiorTemp = temperatura;
            }

            somaDasTemperaturas += temperatura;
        }

        double media = somaDasTemperaturas / 7.0;
        System.out.println("A maior temperatura e: " + maiorTemp);
        System.out.println("A menor temperatura e: " + menorTemp);
        var12 = temperaturas;
        var13 = temperaturas.length;

        for(var14 = 0; var14 < var13; ++var14) {
            temperatura = var12[var14];
            if (temperatura < media) {
                ++diasDaSemana;
            }
        }

        System.out.println("A temperatura media semanal e: " + media);
        System.out.println("O numero de dia da semana em que a temperatura foi inferior a media semanal e: " + diasDaSemana);
    }


}
