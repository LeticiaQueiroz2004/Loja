package example;

import model.Produto;

public class DescontoBaixo extends Desconto {
    private Produto produto;

    public DescontoBaixo(Produto produto) {
        super(produto);
        this.produto = produto;
    }

    @Override
    public Double calcular() {
        return (produto.getPreco() * produto.getQuantidade()) * 0.02;
    }

    @Override
    public boolean aplicarDesconto() {
        return produto.getQuantidade() < 5;
    }
    
}
