package model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public abstract class Veiculo{

    private String placa;
    private String modelo;
    private String marca;
    private float precoBase;

    
    public Veiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public String detalhes(){
        
        return String.format("modelo: %s , marca: %s , placa: %s ", getModelo(), getMarca(), getPlaca()); 
    }
    
      // retorna a diferenca em dias, se for menor que um dia joga uma excecao 
    public int calculaPeriodo(LocalDateTime data1, LocalDateTime data2) throws Exception{
        if(data2.toLocalDate().compareTo(data1.toLocalDate()) == 0 ){
            throw new Exception("O minimo pra se alugar um veiculo normal é de um dia");
        }
        LocalDate localData1 = data1.toLocalDate();
        LocalDate localData2 = data2.toLocalDate();

        return Period.between(localData1, localData2).getDays();
    }

    //calcula o valor do aluguel 
    public float calculaAluguel(LocalDateTime dataLocacao,LocalDateTime dataLimite) throws Exception {
        int periodo = calculaPeriodo(dataLocacao, dataLimite);
        return periodo * getPrecoBase();
    }

    public float getPrecoBase() {
        return this.precoBase;
    }
    
    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }


    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}