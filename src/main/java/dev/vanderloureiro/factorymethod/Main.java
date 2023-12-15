package dev.vanderloureiro.factorymethod;

public class Main {

    public static void main(String args[]) {
        Notificador notificador = NotificadorFactory.por("SMS");
        notificador.enviarNotificacao();
        Notificador notificador2 = NotificadorFactory.por("EMAIL");
        notificador2.enviarNotificacao();
        Notificador notificador3 = NotificadorFactory.por("NENHUM");
        notificador3.enviarNotificacao();
    }
}
