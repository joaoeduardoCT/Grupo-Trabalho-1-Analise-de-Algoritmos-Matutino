package problema33;

import br.furb.analise.algoritmos.LampadaPhellipes;

public class LampadaPhellipesAdapter implements Lampada {
    private LampadaPhellipes lampada;

    public LampadaPhellipesAdapter() {
        this.lampada = new LampadaPhellipes();
    }

    public void ligar() {
        lampada.setIntensidade(1);
    }

    public void desligar() {
        lampada.setIntensidade(0);
    }

    public void setIntensidade(int intensidade) {
        lampada.setIntensidade(intensidade);
    }

    public void modoSono() {
        desligar();
    }

    public void modoTrabalho() {
        ligar();
        setIntensidade(100);
    }
}
