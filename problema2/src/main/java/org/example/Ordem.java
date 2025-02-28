package org.example;

public class Ordem {
    private Investidor investidor;
    private TipoOrdem tipoOrdem;
    private float valorOrdem;

    public Ordem(float valorOrdem, TipoOrdem tipoOrdem, Investidor investidor) {
        this.valorOrdem = valorOrdem;
        this.tipoOrdem = tipoOrdem;
        this.investidor = investidor;
    }

    public TipoOrdem getTipoOrdem() {
        return tipoOrdem;
    }

    public float getValorOrdem() {
        return valorOrdem;
    }
}
