package org.example;

import java.util.ArrayList;
import java.util.Observable;

public class Acao extends Observable {
    private String nome;
    private float valor;
    private ArrayList<Ordem> listaOrdens;

    public Acao(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
        listaOrdens = new ArrayList<>();
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
        setChanged(); 
        notifyObservers(); 
    }

    public ArrayList<Ordem> getListadeOrdens() {
        return listaOrdens;
    }

    public String getNome() {
        return nome;
    }

    public void registrarOrdem(Ordem ordem) {
        listaOrdens.add(ordem);
        setValor(calcularTotalAcao());
    }

    private float calcularTotalAcao() {
        float valorTotal = 0;
        for (Ordem ordem : listaOrdens) {
            valorTotal += ordem.getValorOrdem();
        }
        return valorTotal;
    }

    public void match() {
        ArrayList<Ordem> ordensParaRemover = new ArrayList<>();

        for (int i = 0; i < listaOrdens.size(); i++) {
            Ordem ordem1 = listaOrdens.get(i);
            for (int j = i + 1; j < listaOrdens.size(); j++) {
                Ordem ordem2 = listaOrdens.get(j);
                if (ordem1.getTipoOrdem() != ordem2.getTipoOrdem()
                        && ordem1.getValorOrdem() == ordem2.getValorOrdem()) {
                    ordensParaRemover.add(ordem1);
                    ordensParaRemover.add(ordem2);
                    break;
                }
            }
        }
        listaOrdens.removeAll(ordensParaRemover);
    }

    public void adicionarInvestidor(Investidor investidor) {
        addObserver(investidor);
    }
}
