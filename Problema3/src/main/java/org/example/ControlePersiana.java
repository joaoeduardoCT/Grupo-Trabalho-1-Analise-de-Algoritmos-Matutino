package org.example;

import br.furb.analise.algoritmos.PersianaNatLight;
import br.furb.analise.algoritmos.PersianaSolarius;

public class ControlePersiana {
    private PersianaNatLight natLight;
    private PersianaSolarius solarius;

    public ControlePersiana() {
        this.natLight = new PersianaNatLight();
        this.solarius = new PersianaSolarius();
    }

    public String abrirPersianaSolarius() {
        solarius.subirPersiana();
        return "Persiana Solarius aberta";
    }

    public String fecharPersianaSolarius() {
        solarius.descerPersiana();
        return "Persiana Solarius fechada";
    }

    public String abrirPalhetaNatLight() {
        natLight.abrirPalheta();
        return "Palheta da persiana NatLight aberta";
    }

    public String fecharPalhetaNatLight() {
        try {
            natLight.fecharPalheta();
            return "Palheta da persiana NatLight fechada";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String verificarEstadoPersianaSolarius() {
        if (solarius.estaAberta()) {
            return "Persiana Solarius está aberta";
        } else {
            return "Persiana Solarius está fechada";
        }
    }

    public String verificarEstadoPalhetaNatLight() {
        if (natLight.estaPalhetaAberta()) {
            return "Palheta da persiana NatLight está aberta";
        } else {
            return "Palheta da persiana NatLight está fechada";
        }
    }

    public String modoSono() {
        if (solarius.estaAberta()) {
            fecharPersianaSolarius();
            return "Modo Sono ativado: Persiana Solarius fechada.";
        } else {
            fecharPalhetaNatLight();
            return "Modo Sono ativado: Palheta NatLight fechada.";
        }
    }

    public String modoTrabalho() {
        if (!solarius.estaAberta()) {
            abrirPersianaSolarius();
            return "Modo Trabalho ativado: Persiana Solarius aberta.";
        } else {
            abrirPalhetaNatLight();
            return "Modo Trabalho ativado: Palheta NatLight aberta.";
        }
    }

}
