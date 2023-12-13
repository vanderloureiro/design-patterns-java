package com.br.strategy;

public class EnviaMensagemService {

    public void send(EnviaMensagemStrategy strategy, String mensagem) {

        strategy.envia(mensagem);
    }

}
