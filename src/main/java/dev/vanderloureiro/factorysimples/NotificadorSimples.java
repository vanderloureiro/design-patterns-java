package dev.vanderloureiro.factorysimples;

class NotificadorSimples {

    private String email;

    public static NotificadorSimples iniciarComEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException();
        }
        NotificadorSimples notificadorSimples = new NotificadorSimples();
        notificadorSimples.email = email;
        return notificadorSimples;
    }

    public String getEmail() {
        return this.email;
    }
}