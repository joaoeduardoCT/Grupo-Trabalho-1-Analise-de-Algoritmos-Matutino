import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProdutos;
    private double custoPedido;
    private double valorEntrega;
    EntregaInterface entregaInterface;

    public Pedido(ArrayList<Produto> listaProdutos, double custoPedido, double valorEntrega) {
        this.listaProdutos = listaProdutos;
        this.custoPedido = calcularCustoPedidos();
        this.valorEntrega = valorEntrega;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public double getCustoPedido() {
        return custoPedido;
    }

    public double getValorEntrega() {
        return valorEntrega;
    }

    private double calcularCustoPedidos() {
        double valorTotal = 0;
        for (Produto produto : listaProdutos) {
            valorTotal += produto.getValor();
        }
        return valorTotal;
    }

    private double calcularPeso() {
        double pesoTotal = 0;
        for (Produto produto : listaProdutos) {
            pesoTotal += produto.getPeso();
        }
        return pesoTotal;
    }

    public double calcularEntrega(EntregaInterface entregaInterface) {
            valorEntrega = entregaInterface.calcular(calcularPeso());
            return valorEntrega;
    }

    public double calculoTotal() {
        return custoPedido + valorEntrega;
    }

    @Override
    public String toString() {
        return "Valor final: R$ " + calculoTotal();
    }
}
