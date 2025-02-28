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
    }

    @Test
    void testRegistrarOrdem() {
        Ordem ordemVenda = new Ordem(24.00f, TipoOrdem.VENDA, mariana);
        Ordem ordemCompra = new Ordem(24.00f, TipoOrdem.COMPRA, joaquim);

        bancoDoBrasil.registrarOrdem(ordemVenda);
        bancoDoBrasil.registrarOrdem(ordemCompra);

        assertEquals(2, bancoDoBrasil.getListadeOrdens().size(), "A lista de ordens deve conter duas ordens antes do match.");
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
    void testProgramarOrdem() {
        bancoDoBrasil.setValor(19.50f);

        bancoDoBrasil.programarOrdem(20.00f, mariana, TipoOrdem.VENDA, 19.50f);

        assertEquals(0, bancoDoBrasil.getListadeOrdens().size(), "Nenhuma ordem deve ser registrada imediatamente.");
    }


    @Test
    void testRegistrarAlertaTempoReal() {
        String alertaInicial = bancoDoBrasil.registrarAlertaTempoReal();
        assertTrue(alertaInicial.contains("Valor da ação mudou: 25.0"), "O alerta inicial deve conter o valor atual da ação.");

        bancoDoBrasil.setValor(20.00f);
        String alertaAtualizado = bancoDoBrasil.registrarAlertaTempoReal();
        assertTrue(alertaAtualizado.contains("Valor da ação mudou: 20.0"), "O alerta atualizado deve refletir a nova cotação.");
    }
}