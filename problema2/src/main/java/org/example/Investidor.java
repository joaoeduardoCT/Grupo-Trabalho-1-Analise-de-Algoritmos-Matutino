package org.example;

import java.util.Observable;
import java.util.Observer;

public class Investidor implements Observer {
    private String nome;

    public Investidor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Acao) {
            Acao acao = (Acao) o;
            System.out.println("Investidor " + nome + " foi notificado! Novo valor da ação " 
                + acao.getNome() + ": R$" + acao.getValor());
        }
    }
}
