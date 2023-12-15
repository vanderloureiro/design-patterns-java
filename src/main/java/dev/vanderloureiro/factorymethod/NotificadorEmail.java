package dev.vanderloureiro.factorymethod;

class NotificadorEmail implements Notificador {

    public void enviarNotificacao() {
        System.out.println("Exemplo por EMAIL");
    }
}
