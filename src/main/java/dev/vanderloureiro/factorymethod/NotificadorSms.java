package dev.vanderloureiro.factorymethod;

class NotificadorSms implements Notificador {

    public void enviarNotificacao() {
        System.out.println("Exemplo por SMS");
    }
}
