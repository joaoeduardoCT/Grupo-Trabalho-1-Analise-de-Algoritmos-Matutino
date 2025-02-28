package org.example;

public class Main {
    public static void main(String[] args) {

        Investidor mariana = new Investidor("Mariana");
        Investidor joaquim = new Investidor("Joaquim");

        Acao bancoDoBrasil = new Acao("Banco do Brasil", 25.00f);

        Ordem ordemVenda = new Ordem(24.00f, TipoOrdem.VENDA, mariana);
        Ordem ordemCompra = new Ordem(24.00f, TipoOrdem.COMPRA, joaquim);

        bancoDoBrasil.registrarOrdem(ordemVenda);
        bancoDoBrasil.registrarOrdem(ordemCompra);

        System.out.println("Ordens antes do match: " + bancoDoBrasil.getListadeOrdens().size());

        bancoDoBrasil.match();

        System.out.println("Ordens após o match: " + bancoDoBrasil.getListadeOrdens().size());
        System.out.println(bancoDoBrasil.registrarAlertaTempoReal());

        bancoDoBrasil.programarOrdem(20.00f, mariana, TipoOrdem.VENDA, 19.50f);

        bancoDoBrasil.setValor(20.00f);
        System.out.println(bancoDoBrasil.registrarAlertaTempoReal());
        bancoDoBrasil.programarOrdem(20.00f,mariana, TipoOrdem.VENDA, 19.50f );

        System.out.println("Total de ordens após o preço atingir R$20,00: " + bancoDoBrasil.getListadeOrdens().size());
    }
}
