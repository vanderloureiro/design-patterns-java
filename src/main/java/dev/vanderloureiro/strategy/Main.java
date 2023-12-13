package dev.vanderloureiro.strategy;

public class Main {

    public static void main(String[] args) {
        EnviaMensagemService service = new EnviaMensagemService();

        service.send(new EnviaMensagemEmailService(), "Example by email");
        service.send(new EnviaMensagemSmsService(), "Example by phone");
    }
}
