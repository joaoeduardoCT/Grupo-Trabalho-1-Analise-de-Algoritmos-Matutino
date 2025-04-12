package problema33;

import br.furb.analise.algoritmos.LampadaShoyuMi;

public class LampadaShoyuMiAdapter implements Lampada {
    private LampadaShoyuMi lampada;

    public LampadaShoyuMiAdapter() {
        this.lampada = new LampadaShoyuMi();
    }

    public void ligar() {
        lampada.ligar();
    }

    public void desligar() {
        lampada.desligar();
    }

    public void setIntensidade(int intensidade) {
        if (intensidade > 0) {
            ligar();
        } else {
            desligar();
        }
    }

    public void modoSono() {
        desligar();
    }

    public void modoTrabalho() {
        ligar();
    }
}
