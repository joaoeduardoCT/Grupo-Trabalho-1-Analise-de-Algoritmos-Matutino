package problema33;

import br.furb.analise.algoritmos.PersianaSolarius;

public class PersianaSolariusAdapter implements Persiana {
    private PersianaSolarius persiana;

    public PersianaSolariusAdapter() {
        this.persiana = new PersianaSolarius();
    }

    public void abrir() {
        persiana.subirPersiana();
    }

    public void fechar() {
        persiana.descerPersiana();
    }

    public boolean estaAberta() {
        return persiana.estaAberta();
    }

    public void modoSono() {
        fechar();
    }

    public void modoTrabalho() {
        abrir();
    }
}
