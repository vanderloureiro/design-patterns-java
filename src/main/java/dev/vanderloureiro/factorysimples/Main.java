package dev.vanderloureiro.factorysimples;

public class Main {

    public static void main(String args[]) {
        NotificadorSimples notificador = NotificadorSimples.iniciarComEmail("teste@teste.com");
        System.out.println(notificador.getEmail());
    }
}
