package problema33;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;

public class ArCondicionadoGellaKazaAdapter implements ArCondicionado {
    private ArCondicionadoGellaKaza ar;

    public ArCondicionadoGellaKazaAdapter() {
        this.ar = new ArCondicionadoGellaKaza();
    }

    public void ligar() {
        ar.ativar();
    }

    public void desligar() {
        ar.desativar();
    }

    public void definirTemperatura(int temperatura) {
        while (ar.getTemperatura() < temperatura) {
            ar.aumentarTemperatura();
        }
        while (ar.getTemperatura() > temperatura) {
            ar.diminuirTemperatura();
        }
    }

    public void modoSono() {
        desligar();
    }

    public void modoTrabalho() {
        ligar();
        definirTemperatura(25);
    }
}