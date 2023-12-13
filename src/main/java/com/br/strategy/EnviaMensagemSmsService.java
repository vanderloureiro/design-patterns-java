package com.br.strategy;

public class EnviaMensagemSmsService implements EnviaMensagemStrategy {
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviada por SMS ==> " + mensagem);
    }
}
