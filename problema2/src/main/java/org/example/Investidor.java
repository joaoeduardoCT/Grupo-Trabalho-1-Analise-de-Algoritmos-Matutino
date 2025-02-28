package org.example;

public class Investidor {
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

    public void registrarEmAcao(String nomeAcao, float valorAcao, Ordem ordem){
        Acao acao = new Acao(nomeAcao, valorAcao);
        acao.registrarOrdem(ordem);
    }

    public void registrarAlertaTempoReal(Acao acao){
        
    }
}
