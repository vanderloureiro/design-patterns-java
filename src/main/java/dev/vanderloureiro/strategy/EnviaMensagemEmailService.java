package dev.vanderloureiro.strategy;

public class EnviaMensagemEmailService implements EnviaMensagemStrategy {
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviada por e-mail ==> " + mensagem);
    }
}
