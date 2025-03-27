package problema33;

import br.furb.analise.algoritmos.PersianaNatLight;

public class PersianaNatLightAdapter implements Persiana {
    private PersianaNatLight persiana;

    public PersianaNatLightAdapter() {
        this.persiana = new PersianaNatLight();
    }

    public void abrir() {
        persiana.abrirPalheta();
    }

    public void fechar() {
        try {
            if (persiana.estaPalhetaAberta()) {
                persiana.fecharPalheta();
            } else {
                System.out.println("A persiana já está fechada ou não pode ser fechada no estado atual.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao tentar fechar a persiana: " + e.getMessage());
        }
    }

    public boolean estaAberta() {
        return persiana.estaPalhetaAberta();
    }

    public void modoSono() {
        try {
            if (persiana.estaPalhetaAberta()) {
                fechar();
            }
        } catch (Exception e) {
            System.out.println("Erro ao tentar fechar a persiana no modo sono: " + e.getMessage());
        }
    }

    public void modoTrabalho() {
        abrir();
    }
}
