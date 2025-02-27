import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto livro1 = new Produto("Os Irmãos Karamazov", 50.0f, "1.2kg");
        Produto livro2 = new Produto("Divina Comédia", 40.0f, "800g");
        Produto livro3 = new Produto("Hora da Estrela", 30.0f, "500g");

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(livro1);
        produtos.add(livro2);
        produtos.add(livro3);

        String tipoEntregaInput;
        EntregaInterface entregaInterface = null;

        boolean executando = true;

        Pedido pedido = new Pedido(produtos, 0, 0);


        while (executando) {
            System.out.println("Escolha o tipo de entrega (PAC, SEDEX, RETIRAR):");
            tipoEntregaInput = scanner.nextLine().toUpperCase().trim();

            switch(tipoEntregaInput){
                case "PAC":
                    entregaInterface = new PAC();
                    pedido.calcularEntrega(entregaInterface);
                    executando = false;
                    break;
                case "SEDEX":
                    entregaInterface = new Sedex();
                    pedido.calcularEntrega(entregaInterface);
                    executando = false;
                    break;
                case "RETIRAR":
                    entregaInterface = new Retirar();
                    pedido.calcularEntrega(entregaInterface);
                    executando = false;
                    break;
                default:
                    System.out.println("Escolha inválida! Tente novamente.");
                    break;
            }
       }

        pedido.calcularEntrega(entregaInterface);

        System.out.println("\nDetalhes do Pedido:");
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Valor: R$ " + produto.getValor() + ", Peso: " + produto.getPeso() + "g");
        }

        System.out.println("\nCusto total dos produtos: R$ " + pedido.getCustoPedido());
        System.out.println("Valor da entrega: R$ " + pedido.getValorEntrega());
        System.out.println("\nValor final: R$ " + pedido);

        scanner.close();
    }
}
