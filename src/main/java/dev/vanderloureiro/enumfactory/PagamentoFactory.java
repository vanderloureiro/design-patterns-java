package dev.vanderloureiro.enumfactory;

import java.util.EnumMap;

public class PagamentoFactory {

    private static final EnumMap<TipoPagamento, Pagamento> tipos = new EnumMap<>(TipoPagamento.class);

    static {
        tipos.put(TipoPagamento.PIX, new PagamentoPix());
        tipos.put(TipoPagamento.CARTAO, new PagamentoCartao());
        tipos.put(TipoPagamento.BOLETO, new PagamentoBoleto());
    }

    public static Pagamento getInstance(TipoPagamento tipo) {
        return tipos.get(tipo);
    }

}
