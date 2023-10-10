package GerenciamentoInventario;

public class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Notebook();
    }
}