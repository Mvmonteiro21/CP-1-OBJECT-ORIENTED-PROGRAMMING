package br.com.fiapride.model;

public class Veiculo {
    private String proprietario;
    private String placa;
    private int nivelCombustivel;
    
    public Veiculo(String proprietario, String placa) {
        this.proprietario = proprietario;
        this.placa = placa;
        this.nivelCombustivel = 0;
    }
    
    public String getProprietario() {
        return proprietario;
    }
    
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getNivelCombustivel() {
        return nivelCombustivel;
    }
    
    public void abastecer(int litros) {
        if (litros > 0) {
            this.nivelCombustivel += litros;
        }
    }
    
    public void gastar(double litros) {
        if (litros > 0 && this.nivelCombustivel >= litros) {
            this.nivelCombustivel -= litros;
        }
    }
}
