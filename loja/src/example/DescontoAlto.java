package example;

import model.Produto;

public class DescontoAlto extends Desconto {

    private Produto produto;

    public DescontoAlto(Produto produto) {
        super(produto);
        this.produto = produto;
    }

    @Override
    public Double calcular() {
        return (produto.getPreco() * produto.getQuantidade()) * 0.1;
    }

    @Override
    public boolean aplicarDesconto() {
        return produto.getQuantidade() >= 10;
    }
    
}
