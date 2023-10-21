package example;

import model.Produto;

public abstract class Desconto {
    private Produto produto;

    public Desconto(Produto produto) {
            this.produto = produto;
    }

    public abstract Double calcular();

    public final Desconto ou (Desconto proximo) {
        if(aplicarDesconto())
            return this;
        return proximo;
    }

    public abstract boolean aplicarDesconto();
}
