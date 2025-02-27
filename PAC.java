public class PAC implements EntregaInterface {

    public double calcular(double pesoTotal) {
        double valorFinal = 0;

        if (pesoTotal <= 1000) {
            valorFinal = 10;
        } else if (pesoTotal <= 2000) {
            valorFinal = 15;
        } else if (pesoTotal <= 3000) {
            valorFinal = 20;
        } else if (pesoTotal <= 5000) {
            valorFinal = 30;
        } else {
            valorFinal = 40;
        }

        return valorFinal;
    }
}
