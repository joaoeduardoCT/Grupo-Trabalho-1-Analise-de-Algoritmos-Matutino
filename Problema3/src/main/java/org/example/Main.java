package org.example;

public class Main {
    public static void main(String[] args) {
        ControleLampada controleLampada = new ControleLampada();
        ControlePersiana controlePersiana = new ControlePersiana();
        ControleArCondicionado controleArCondicionado = new ControleArCondicionado();

        System.out.println("Controle da Lâmpada Phellipes:");
        System.out.println(controleLampada.ligarPhellipes());
        System.out.println(controleLampada.definirIntensidadePhellipes(75));
        System.out.println(controleLampada.desligarPhellipes());
        System.out.println();

        System.out.println("Controle da Persianas NatLight:");
        System.out.println(controlePersiana.abrirPalhetaNatLight());
        System.out.println(controlePersiana.fecharPalhetaNatLight());
        System.out.println(controlePersiana.verificarEstadoPalhetaNatLight());
        System.out.println();

        System.out.println("Controle do Ar Condicionado GellaKaza:");
        System.out.println(controleArCondicionado.ligar());
        System.out.println(controleArCondicionado.aumentarTemperaturaGellaKaza());
        System.out.println(controleArCondicionado.diminuirTemperaturaGellaKaza());
        System.out.println(controleArCondicionado.desligar());
        System.out.println();

        System.out.println("Modo Sono ativado:");
        System.out.println(controleLampada.modoSono());
        System.out.println(controlePersiana.modoSono());
        System.out.println(controleArCondicionado.modoSono());
        System.out.println();

        System.out.println("Modo Trabalho ativado:");
        System.out.println(controleLampada.modoTrabalho());
        System.out.println(controlePersiana.modoTrabalho());
        System.out.println(controleArCondicionado.modoTrabalho());
    }
}
