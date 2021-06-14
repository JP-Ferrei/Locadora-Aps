package model;
import java.time.LocalDateTime;

public class CarroEsportivo extends Veiculo{

    private int cavaloPotencia;

    public CarroEsportivo(String placa, String modelo, String marca, int cavaloPotencia) {
        super(placa, modelo, marca);
        this.cavaloPotencia=cavaloPotencia;
        this.setPrecoBase(30);
    }

    @Override
    public String detalhes() {
        return super.detalhes()+ String.format("Potencia do motor: %s cavalos", getcavaloPotencia() );
    }
    
    //retorna a diferenca entre as datas em minutos se tiverem no mesmo dia 
    @Override
    public int calculaPeriodo(LocalDateTime data1, LocalDateTime data2) throws Exception {
        if(data2.toLocalDate().compareTo(data1.toLocalDate()) == 0 ){
            return ((data2.getHour() * 60) + data2.getMinute()) - ((data1.getHour() * 60) + data1.getMinute());
        }
        throw new Exception("O tempo maximo de aluguel de Carros esportivos eh de 120 min");

    }

    @Override
    public float calculaAluguel(LocalDateTime dataLocacao,LocalDateTime dataLimite) throws Exception {
        
        return super.calculaAluguel(dataLocacao, dataLimite) ;
    }


    public int getcavaloPotencia() {
        return cavaloPotencia;
    }

    
    public void setcavaloPotencia(int cavaloPotencia) {
        this.cavaloPotencia = cavaloPotencia;
    }

}