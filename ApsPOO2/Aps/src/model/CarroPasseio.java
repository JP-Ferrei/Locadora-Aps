package model;
import java.time.LocalDateTime;

public class CarroPasseio extends Veiculo{

    private float cilindradas;



    public CarroPasseio(String placa, String modelo, String marca,float cilindradas) {
        super(placa, modelo, marca);
        this.cilindradas = cilindradas;
        this.setPrecoBase(40);
    }
    
    @Override
    public String detalhes(){
        return super.detalhes() + String.format("potencia do Motor: %s", getCilindradas());
    }

    @Override
    public float calculaAluguel(LocalDateTime dataLocacao, LocalDateTime dataLimite) throws Exception {
        return super.calculaAluguel(dataLocacao, dataLimite) * acrecimoCilindradas();
    }

    public float acrecimoCilindradas(){
        return getCilindradas()/ 100 +1;
    }
    public float getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(float cilindradas) {
        this.cilindradas = cilindradas;
    }

}