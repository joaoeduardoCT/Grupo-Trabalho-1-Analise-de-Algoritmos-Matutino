import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import problema33.ControleArCondicionado;
import problema33.ControleLampada;
import problema33.ControlePersiana;

class EletrodomesticosTest {

    private ControleLampada controleLampada;
    private ControlePersiana controlePersiana;
    private ControleArCondicionado controleArCondicionado;

    @BeforeEach
    void setUp() {
        // Inicializando todos os objetos antes de cada teste
        controleLampada = new ControleLampada();
        controlePersiana = new ControlePersiana();
        controleArCondicionado = new ControleArCondicionado();
    }

    // Testes para ControleLampada
    @Test
    void testLigarPhellipes() {
        String resultado = controleLampada.ligarPhellipes();
        assertEquals("Lâmpada Phellipes ligada.", resultado);
    }

    @Test
    void testDesligarPhellipes() {
        controleLampada.ligarPhellipes(); // Ligar antes de testar o desligamento
        String resultado = controleLampada.desligarPhellipes();
        assertEquals("Lâmpada Phellipes desligada.", resultado);
    }

    @Test
    void testDefinirIntensidadePhellipes() {
        String resultado = controleLampada.definirIntensidadePhellipes(75);
        assertEquals("Intensidade da lâmpada Phellipes ajustada para 75%.", resultado);
    }

    @Test
    void testModoSonoLampada() {
        String resultado = controleLampada.modoSono();
        assertEquals("Modo Sono ativado: Lâmpada desligada.", resultado);
    }

    @Test
    void testModoTrabalhoLampada() {
        String resultado = controleLampada.modoTrabalho();
        assertEquals("Modo Trabalho ativado: Lâmpada ligada com intensidade 100%.", resultado);
    }

    // Testes para ControlePersiana
    @Test
    void testAbrirPalhetaNatLight() {
        String resultado = controlePersiana.abrirPalhetaNatLight();
        assertEquals("Palheta da persiana NatLight aberta.", resultado);
    }

    @Test
    void testFecharPalhetaNatLight() {
        String resultado = controlePersiana.fecharPalhetaNatLight();
        assertEquals("Palheta da persiana NatLight fechada.", resultado);
    }

    @Test
    void testVerificarEstadoPalhetaNatLight() {
        String resultado = controlePersiana.verificarEstadoPalhetaNatLight();
        assertEquals("Palheta da persiana NatLight está fechada.", resultado);
    }

    @Test
    void testModoSonoPersiana() {
        String resultado = controlePersiana.modoSono();
        assertEquals("Modo Sono ativado: Persiana fechada.", resultado);
    }

    @Test
    void testModoTrabalhoPersiana() {
        String resultado = controlePersiana.modoTrabalho();
        assertEquals("Modo Trabalho ativado: Persiana aberta.", resultado);
    }

    // Testes para ControleArCondicionado
    @Test
    void testLigarArCondicionado() {
        String resultado = controleArCondicionado.ligar();
        assertEquals("Ar-condicionado GellaKaza ligado.", resultado);
    }

    @Test
    void testDesligarArCondicionado() {
        controleArCondicionado.ligar(); // Ligar antes de testar o desligamento
        String resultado = controleArCondicionado.desligar();
        assertEquals("Ar-condicionado GellaKaza desligado.", resultado);
    }

    @Test
    void testAumentarTemperaturaGellaKaza() {
        String resultado = controleArCondicionado.aumentarTemperaturaGellaKaza();
        assertEquals("Temperatura do ar-condicionado GellaKaza aumentada.", resultado);
    }

    @Test
    void testDiminuirTemperaturaGellaKaza() {
        String resultado = controleArCondicionado.diminuirTemperaturaGellaKaza();
        assertEquals("Temperatura do ar-condicionado GellaKaza diminuída.", resultado);
    }

    @Test
    void testModoSonoArCondicionado() {
        String resultado = controleArCondicionado.modoSono();
        assertEquals("Modo Sono ativado: Ar-condicionado desligado.", resultado);
    }

    @Test
    void testModoTrabalhoArCondicionado() {
        String resultado = controleArCondicionado.modoTrabalho();
        assertEquals("Modo Trabalho ativado: Ar-condicionado ligado, temperatura ajustada para 25°C.", resultado);
    }
}