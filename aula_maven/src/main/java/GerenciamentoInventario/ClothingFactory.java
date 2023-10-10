package GerenciamentoInventario;

public class ClothingFactory implements ProductInventory {
    @Override
    public Product createProduct() {
        return new ClothingProduct();
    }
}