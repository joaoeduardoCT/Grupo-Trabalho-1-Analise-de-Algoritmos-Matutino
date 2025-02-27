public class Sedex implements EntregaInterface{

    public double calcular(double pesoTotal) {
        double valorFinal = 0;

        if (pesoTotal <= 500) {
            valorFinal = 12.50;
        } else if (pesoTotal <= 750) {
            valorFinal = 20;
        } else if (pesoTotal <= 1200) {
            valorFinal = 30;
        } else if (pesoTotal <= 2000) {
            valorFinal = 45;
        } else {
            double calculoPesoExtra = ((int) ((pesoTotal - 2000) / 100)) * 1.50;
            valorFinal = 46.50 + calculoPesoExtra;
        }

        return valorFinal;
    }
}
