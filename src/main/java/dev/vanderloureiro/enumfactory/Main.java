package dev.vanderloureiro.enumfactory;

public class Main {
    public static void main( String[] args ) {
        Pagamento pagamento = PagamentoFactory.getInstance(TipoPagamento.PIX);
        pagamento.efetuarPagamento();
    }
}
