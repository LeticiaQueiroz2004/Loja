package example;

import model.Produto;

public class DescontoRegular extends Desconto {

    private Produto produto;

    public DescontoRegular(Produto produto) {
        super(produto);
        this.produto = produto;
    }

    @Override
    public Double calcular() {
        return (produto.getPreco() * produto.getQuantidade()) * 0.05;
    }

    @Override
    public boolean aplicarDesconto() {
        return produto.getQuantidade() <= 10;
    }
    
}
