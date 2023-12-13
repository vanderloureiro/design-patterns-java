package dev.vanderloureiro.enumfactory;

public class PagamentoCartao implements Pagamento {

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento por cartão");
    }
}
