package org.example;

import java.util.ArrayList;

public class Acao {
    private String nome;
    private float valor;
    private ArrayList<Ordem> listaOrdens;

    public Acao(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ArrayList<Ordem> getListadeOrdens() {
        return listaOrdens;
    }

    public void setListadeOrdens(ArrayList<Ordem> listaOrdens) {
        this.listaOrdens = listaOrdens;
    }

    public void registrarOrdem(Ordem ordem){
        listaOrdens.add(ordem);
    }

    private void match(){
        for(Ordem ordem1 : listaOrdens){
            for(Ordem ordem2: listaOrdens){
                if (ordem1.getTipoOrdem() != ordem2.getTipoOrdem() && ordem1.getValorOrdem() == ordem2.getValorOrdem()){
                    setValor((valor - ordem1.getValorOrdem()));
                    listaOrdens.remove(ordem1);
                    listaOrdens.remove(ordem2);
                    break;
                }
            }
        }
    }


}
