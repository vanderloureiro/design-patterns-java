package dev.vanderloureiro.enumfactory;

public class PagamentoPix implements Pagamento {

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento por pix");
    }
}