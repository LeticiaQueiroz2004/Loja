import model.Produto;
import service.DescontoService;

public class App {
    public static void main(String[] args) throws Exception {
        runTest();
    }

    private static void runTest() {
        Produto produto1 = new Produto(1, "Televisão", "Smart 55", 4_000.0, 2);
        Produto produto2 = new Produto(1, "Televisão", "Smart 55", 4_000.0, 5);
        Produto produto3 = new Produto(1, "Televisão", "Smart 55", 4_000.0, 1);

        DescontoService service = new DescontoService();
        
        test(service.calcularDesconto(produto1));
        test(service.calcularDesconto(produto2));
        test(service.calcularDesconto(produto3));
    }

    private static void test(double desconto) {
        System.out.println("Valor do desconto:" + desconto);
    }
}
