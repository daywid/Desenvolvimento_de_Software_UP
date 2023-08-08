package GerenciamentoProdutos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVendas {
    
   public List<Venda> vendasRealizadas;

   public GerenciadorVendas() {
        vendasRealizadas = new ArrayList<>();
    }
   public void registrarVenda(Venda venda) {
    vendasRealizadas.add(venda);
} 
}
