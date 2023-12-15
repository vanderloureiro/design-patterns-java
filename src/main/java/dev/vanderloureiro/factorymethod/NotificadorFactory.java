package dev.vanderloureiro.factorymethod;

public class NotificadorFactory {

    public static Notificador por(String canal) {

        switch(canal) {
            case "EMAIL":
                return new NotificadorEmail();
            case "SMS":
                return new NotificadorSms();
            default:
                return new NotificadorSinalDeFumaca();
        }

    }
}
