package GerenciamentoInventario;

public class Notebook extends Product {
    public String name;
    public double price;
    public String sku;


    public void displayInfo() {
        System.out.println("Notebook: " + name + ", Price: " + price + ", SKU: " + sku);
    } 
}

    // public Notebook(String name, double price, String sku) {
    //    super(name, price, sku);
    // }

    
    

