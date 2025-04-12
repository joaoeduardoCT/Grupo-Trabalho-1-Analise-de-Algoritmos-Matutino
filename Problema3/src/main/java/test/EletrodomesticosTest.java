package test;

import org.example.ControleArCondicionado;
import org.example.ControleLampada;
import org.example.ControlePersiana;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EletrodomesticosTest {

    private ControleLampada controleLampada;
    private ControlePersiana controlePersiana;
    private ControleArCondicionado controleArCondicionado;

    @BeforeEach
    void setUp() {
        // Inicialize os objetos antes de cada teste
        controleLampada = new ControleLampada();
        controlePersiana = new ControlePersiana();
        controleArCondicionado = new ControleArCondicionado();
    }

    // Testes para a Lâmpada Phellipes
    @Test
    void testLigarPhellipes() {
        String result = controleLampada.ligarPhellipes();
        assertEquals("Lâmpada Phellipes ligada", result, "A lâmpada Phellipes deve estar ligada.");
    }

    @Test
    void testDesligarPhellipes() {
        String result = controleLampada.desligarPhellipes();
        assertEquals("Lâmpada Phellipes desligada", result, "A lâmpada Phellipes deve estar desligada.");
    }

    @Test
    void testDefinirIntensidadePhellipes() {
        String result = controleLampada.definirIntensidadePhellipes(75);
        assertEquals("Intensidade da lâmpada Phellipes definida para 75", result, "A intensidade da lâmpada deve ser 75.");
    }

    @Test
    void testModoSonoLampada() {
        String result = controleLampada.modoSono();
        assertEquals("Modo Sono ativado: Lâmpada Phellipes desligada.", result, "A lâmpada deve estar desligada no modo sono.");
    }

    @Test
    void testModoTrabalhoLampada() {
        String result = controleLampada.modoTrabalho();
        assertEquals("Modo Trabalho ativado: Lâmpada Phellipes ligada com intensidade 100%.", result, "A lâmpada deve estar ligada com intensidade 100% no modo trabalho.");
    }

    // Testes para a Persiana NatLight
    @Test
    void testAbrirPalhetaNatLight() {
        String result = controlePersiana.abrirPalhetaNatLight();
        assertEquals("Palheta da persiana NatLight aberta", result, "A palheta NatLight deve estar aberta.");
    }

    @Test
    void testFecharPalhetaNatLight() {
        String result = controlePersiana.fecharPalhetaNatLight();
        assertEquals("Palheta da persiana NatLight fechada", result, "A palheta NatLight deve estar fechada.");
    }

    @Test
    void testVerificarEstadoPalhetaNatLight() {
        controlePersiana.fecharPalhetaNatLight();
        String result = controlePersiana.verificarEstadoPalhetaNatLight();
        assertEquals("Palheta da persiana NatLight está fechada", result, "A palheta NatLight deve estar fechada.");
    }

    @Test
    void testModoSonoPersiana() {
        String result = controlePersiana.modoSono();
        assertEquals("Modo Sono ativado: Palheta NatLight fechada.", result, "A persiana deve estar fechada no modo sono.");
    }

    @Test
    void testModoTrabalhoPersiana() {
        String result = controlePersiana.modoTrabalho();
        assertEquals("Modo Trabalho ativado: Palheta NatLight aberta.", result, "A palheta NatLight deve estar aberta no modo trabalho.");
    }

    // Testes para o Ar Condicionado
    @Test
    void testLigarArCondicionado() {
        String result = controleArCondicionado.ligar();
        assertEquals("Ambos os ares-condicionados foram ligados.", result, "O ar-condicionado deve estar ligado.");
    }

    @Test
    void testDesligarArCondicionado() {
        String result = controleArCondicionado.desligar();
        assertEquals("Ambos os ares-condicionados foram desligados.", result, "O ar-condicionado deve estar desligado.");
    }

    @Test
    void testAumentarTemperaturaGellaKaza() {
        String result = controleArCondicionado.aumentarTemperaturaGellaKaza();
        assertEquals("Temperatura do GellaKaza aumentada para: 22", result, "A temperatura do GellaKaza deve ser aumentada.");
    }

    @Test
    void testDiminuirTemperaturaGellaKaza() {
        String result = controleArCondicionado.diminuirTemperaturaGellaKaza();
        assertEquals("Temperatura do GellaKaza diminuída para: 18", result, "A temperatura do GellaKaza deve ser diminuída.");
    }

    @Test
    void testModoSonoArCondicionado() {
        String result = controleArCondicionado.modoSono();
        assertEquals("Modo Sono ativado: Ar-condicionado desligado.", result, "O ar-condicionado deve estar desligado no modo sono.");
    }

    @Test
    void testModoTrabalhoArCondicionado() {
        String result = controleArCondicionado.modoTrabalho();
        assertEquals("Modo Trabalho ativado: Ar-condicionado ligado, temperatura ajustada para 25°C.", result, "O ar-condicionado deve estar ligado e com temperatura ajustada para 25°C no modo trabalho.");
    }
}
