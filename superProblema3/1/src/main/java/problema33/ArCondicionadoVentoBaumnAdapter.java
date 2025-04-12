package problema33;

import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class ArCondicionadoVentoBaumnAdapter implements ArCondicionado {
    private ArCondicionadoVentoBaumn ar;

    public ArCondicionadoVentoBaumnAdapter() {
        this.ar = new ArCondicionadoVentoBaumn();
    }

    public void ligar() {
        ar.ligar();
    }

    public void desligar() {
        ar.desligar();
    }

    public void definirTemperatura(int temperatura) {
        ar.definirTemperatura(temperatura);
    }

    public void modoSono() {
        desligar();
    }

    public void modoTrabalho() {
        ligar();
        definirTemperatura(25);
    }
}
