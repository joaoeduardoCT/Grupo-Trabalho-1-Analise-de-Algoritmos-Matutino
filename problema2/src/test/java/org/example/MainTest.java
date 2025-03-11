package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Acao bancoDoBrasil;
    private Investidor mariana;
    private Investidor joaquim;

    @BeforeEach
    void setUp() {
        mariana = new Investidor("Mariana");
        joaquim = new Investidor("Joaquim");

        bancoDoBrasil = new Acao("Banco do Brasil", 25.00f);

        bancoDoBrasil.adicionarInvestidor(mariana);
        bancoDoBrasil.adicionarInvestidor(joaquim);
    }

    @Test
    void testRegistrarOrdem() {
        Ordem ordemVenda = new Ordem(24.00f, TipoOrdem.VENDA, mariana);
        Ordem ordemCompra = new Ordem(24.00f, TipoOrdem.COMPRA, joaquim);

        bancoDoBrasil.registrarOrdem(ordemVenda);
        bancoDoBrasil.registrarOrdem(ordemCompra);

        assertEquals(2, bancoDoBrasil.getListadeOrdens().size(),
                "A lista de ordens deve conter duas ordens antes do match.");
    }

    @Test
    void testMatch() {
        Ordem ordemVenda = new Ordem(24.00f, TipoOrdem.VENDA, mariana);
        Ordem ordemCompra = new Ordem(24.00f, TipoOrdem.COMPRA, joaquim);

        bancoDoBrasil.registrarOrdem(ordemVenda);
        bancoDoBrasil.registrarOrdem(ordemCompra);

        bancoDoBrasil.match();

        assertEquals(0, bancoDoBrasil.getListadeOrdens().size(), "A lista de ordens deve estar vazia após o match.");
    }

    @Test
    void testAlteracaoValorAcaoNotificaInvestidores() {
        bancoDoBrasil.setValor(20.00f);
        assertEquals(20.00f, bancoDoBrasil.getValor(), "O valor da ação deve ser atualizado corretamente.");
    }
}