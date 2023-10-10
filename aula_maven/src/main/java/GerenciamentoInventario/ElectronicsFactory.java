package GerenciamentoInventario;

public class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProduct(String type) {
        if ("Smartphone".equalsIgnoreCase(type)) {
            return new Smartphone("Example Smartphone", 599.99, "SKU456");
        } else if ("Notebook".equalsIgnoreCase(type)) {
            return new Notebook("Example Notebook", 999.99, "SKU123");
        } else {
            throw new IllegalArgumentException("Tipo de produto eletrônico desconhecido: " + type);
        }
    }
}