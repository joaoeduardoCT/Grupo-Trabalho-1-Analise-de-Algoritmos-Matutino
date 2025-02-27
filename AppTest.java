import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class AppTest {

    @Test
    void testCriacaoProduto() {
        Produto produto = new Produto("Teste Produto", 25.0f, "2kg");
        assertEquals("Teste Produto", produto.getNome());
        assertEquals(25.0f, produto.getValor());
        assertEquals(2000.0, produto.getPeso());
    }

    @Test
    void testCriacaoPedido() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Item 1", 10.0f, "500g"));
        produtos.add(new Produto("Item 2", 15.0f, "1kg"));

        Pedido pedido = new Pedido(produtos, 0, 0);
        assertEquals(2, pedido.getListaProdutos().size());
    }

    @Test
    void testEscolherTipoEntregaSedex() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Item 1", 10.0f, "500g"));

        Pedido pedido = new Pedido(produtos, 0, 0);

        EntregaInterface entrega = new Sedex();
        pedido.calcularEntrega(entrega);

        assertEquals(12.50f, pedido.getValorEntrega(), 0.01f);
    }

    @Test
    void testEscolherTipoEntregaPac() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Item 1", 10.0f, "500g"));

        Pedido pedido = new Pedido(produtos, 0, 0);

        EntregaInterface entrega = new PAC();
        pedido.calcularEntrega(entrega);

        assertEquals(10.0f, pedido.getValorEntrega(), 0.01f);
    }

    @Test
    void testEscolherTipoEntregaRetirada() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Item 1", 10.0f, "500g"));

        Pedido pedido = new Pedido(produtos, 0, 0);

        EntregaInterface entrega = new Retirar();
        pedido.calcularEntrega(entrega);

        assertEquals(00.0f, pedido.getValorEntrega(), 0.01f);
    }

    @Test
    void testValorTotalPedido() {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Produto 1", 50.0f, "500g");
        Produto produto2 = new Produto("Produto 2", 30.0f, "700g");
        produtos.add(produto1);
        produtos.add(produto2);

        Pedido pedido = new Pedido(produtos, 0, 0);

        float custoEsperado = produto1.getValor() + produto2.getValor();
        assertEquals(custoEsperado, pedido.getCustoPedido(), 0.01f);
    }
}