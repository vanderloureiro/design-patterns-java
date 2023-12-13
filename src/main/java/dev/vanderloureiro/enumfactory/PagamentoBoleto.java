package dev.vanderloureiro.enumfactory;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento por boleto");
    }
}