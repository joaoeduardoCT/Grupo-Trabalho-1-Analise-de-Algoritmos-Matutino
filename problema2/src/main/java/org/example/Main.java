package org.example;

public class Main {
    public static void main(String[] args) {
        Acao bancoDoBrasil = new Acao("Banco do Brasil", 25.00f);

        Investidor mariana = new Investidor("Mariana");
        Investidor joaquim = new Investidor("Joaquim");

        bancoDoBrasil.adicionarInvestidor(mariana);
        bancoDoBrasil.adicionarInvestidor(joaquim);

        Ordem ordemVenda = new Ordem(24.00f, TipoOrdem.VENDA, mariana);
        Ordem ordemCompra = new Ordem(24.00f, TipoOrdem.COMPRA, joaquim);

        bancoDoBrasil.registrarOrdem(ordemVenda);
        bancoDoBrasil.registrarOrdem(ordemCompra);

        System.out.println("Ordens antes do match: " + bancoDoBrasil.getListadeOrdens().size());

        bancoDoBrasil.match();

        System.out.println("Ordens após o match: " + bancoDoBrasil.getListadeOrdens().size());

        bancoDoBrasil.setValor(20.00f);
    }
}
