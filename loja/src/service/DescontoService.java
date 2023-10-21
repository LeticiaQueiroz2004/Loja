package service;

import example.DescontoAlto;
import example.DescontoBaixo;
import example.DescontoRegular;
import model.Produto;

public class DescontoService {

    public double calcularDesconto(Produto produto){

        Double valor;

        valor = new DescontoBaixo(produto)
                    .ou(new DescontoRegular(produto))
                    .ou(new DescontoAlto(produto))
                    .calcular();
        return valor;
    }
}
