package problema33;

public class Main {
    public static void main(String[] args) throws Exception {

        Lampada lampada = new LampadaPhellipesAdapter();
        Persiana persiana = new PersianaSolariusAdapter();
        ArCondicionado arCondicionado = new ArCondicionadoGellaKazaAdapter();

        System.out.println("Ligando a Lâmpada...");
        lampada.ligar();

        System.out.println("Definindo intensidade da Lâmpada para 75...");
        lampada.setIntensidade(75);

        System.out.println("Desligando a Lâmpada...");
        lampada.desligar();
        System.out.println();

        System.out.println("Abrindo a persiana...");
        persiana.abrir();

        System.out.println("Fechando a persiana...");
        persiana.fechar();

        System.out.println("Verificando o estado da persiana: " + persiana.estaAberta());
        System.out.println();

        System.out.println("Ligando o Ar Condicionado...");
        arCondicionado.ligar();

        System.out.println("Definindo temperatura para 27...");
        arCondicionado.definirTemperatura(27);

        System.out.println("Definindo temperatura para 18...");
        arCondicionado.definirTemperatura(18);

        System.out.println("Desligando o Ar Condicionado...");
        arCondicionado.desligar();
        System.out.println();

        System.out.println("Ativando o modo sono...");
        lampada.modoSono();
        persiana.modoSono();
        arCondicionado.modoSono();
        System.out.println();

        System.out.println("Ativando o modo trabalho...");
        lampada.modoTrabalho();
        persiana.modoTrabalho();
        arCondicionado.modoTrabalho();
    }
}
