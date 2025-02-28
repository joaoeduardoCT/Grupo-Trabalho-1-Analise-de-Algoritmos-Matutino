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

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public TipoOrdem getTipoOrdem() {
        return tipoOrdem;
    }

    public void setTipoOrdem(TipoOrdem tipoOrdem) {
        this.tipoOrdem = tipoOrdem;
    }

    public float getValorOrdem() {
        return valorOrdem;
    }

    public void setValorOrdem(float valorOrdem) {
        this.valorOrdem = valorOrdem;
    }
}
