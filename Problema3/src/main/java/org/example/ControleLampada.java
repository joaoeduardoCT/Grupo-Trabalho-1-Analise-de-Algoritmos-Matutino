package org.example;

import br.furb.analise.algoritmos.LampadaPhellipes;
import br.furb.analise.algoritmos.LampadaShoyuMi;

public class ControleLampada {
    private LampadaPhellipes phellipes;
    private LampadaShoyuMi shoyuMi;

    public ControleLampada() {
        this.phellipes = new LampadaPhellipes();
        this.shoyuMi = new LampadaShoyuMi();
    }

    public String ligarPhellipes() {
        phellipes.setIntensidade(1);
        return "Lâmpada Phellipes ligada";
    }

    public String desligarPhellipes() {
        phellipes.setIntensidade(0);
        return "Lâmpada Phellipes desligada";
    }

    public String definirIntensidadePhellipes(int intensidade) {
        try {
            phellipes.setIntensidade(intensidade);
            return "Intensidade da lâmpada Phellipes definida para " + intensidade;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public String ligarShoyuMi() {
        shoyuMi.ligar();
        return "Lâmpada ShoyuMi ligada";
    }

    public String desligarShoyuMi() {
        shoyuMi.desligar();
        return "Lâmpada ShoyuMi desligada";
    }

    public String verificarEstadoShoyuMi() {
        if (shoyuMi.estaLigada()) {
            return "Lâmpada ShoyuMi está ligada";
        } else {
            return "Lâmpada ShoyuMi está desligada";
        }
    }

    public String modoSono() {
        if (!shoyuMi.estaLigada()) {
            desligarPhellipes();
            return "Modo Sono ativado: Lâmpada Phellipes desligada.";
        } else {
            desligarShoyuMi();
            return "Modo Sono ativado: Lâmpada ShoyuMi desligada.";
        }
    }

    public String modoTrabalho() {
        if (phellipes.getIntensidade() == 0) {
            ligarPhellipes();
            definirIntensidadePhellipes(100);
        }
        return "Modo Trabalho ativado: Lâmpada Phellipes ligada com intensidade 100%.";
    }

}
