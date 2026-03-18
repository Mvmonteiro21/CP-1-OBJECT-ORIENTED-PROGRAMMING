package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");
        
        v1.abastecer(50);
        v1.gastar(100);
        
        System.out.println("Dono: " + v1.getProprietario() + 
                          " | Placa: " + v1.getPlaca() + 
                          " | Gasolina: " + v1.getNivelCombustivel());
    }
}
