package dev.vanderloureiro.singleton;

import java.util.Objects;

public class ExemploSingleton {

    private static ExemploSingleton instancia;

    private ExemploSingleton() {}

    public static ExemploSingleton getInstancia() {
        if (Objects.isNull(instancia)) {
            System.out.println("Criando instância");
            instancia = new ExemploSingleton();
        }
        System.out.println("Retornando instância");
        return instancia;
    }
}
