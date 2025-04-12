package org.example;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;
import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class ControleArCondicionado {
    private ArCondicionadoGellaKaza gellaKaza;
    private ArCondicionadoVentoBaumn ventoBaumn;

    public ControleArCondicionado() {
        this.gellaKaza = new ArCondicionadoGellaKaza();
        this.ventoBaumn = new ArCondicionadoVentoBaumn();
    }

    public String ligar() {
        gellaKaza.ativar();
        ventoBaumn.ligar();
        return "Ambos os ares-condicionados foram ligados.";
    }

    public String desligar() {
        gellaKaza.desativar();
        ventoBaumn.desligar();
        return "Ambos os ares-condicionados foram desligados.";
    }

    public String aumentarTemperaturaGellaKaza() {
        try {
            gellaKaza.aumentarTemperatura();
            return "Temperatura do GellaKaza aumentada para: " + gellaKaza.getTemperatura();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public String diminuirTemperaturaGellaKaza() {
        try {
            gellaKaza.diminuirTemperatura();
            return "Temperatura do GellaKaza diminuída para: " + gellaKaza.getTemperatura();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public String definirTemperaturaVentoBaumn(int temp) {
        try {
            ventoBaumn.definirTemperatura(temp);
            return "Temperatura do VentoBaumn definida para " + temp;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String modoSono() {
        desligar();
        return "Modo Sono ativado: Ar-condicionado desligado.";
    }

    public String modoTrabalho() {
        ligar();
        definirTemperaturaVentoBaumn(25);
        return "Modo Trabalho ativado: Ar-condicionado ligado, temperatura ajustada para 25°C.";
    }
}
