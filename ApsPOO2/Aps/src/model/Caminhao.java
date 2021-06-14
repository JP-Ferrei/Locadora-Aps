package model;

public class Caminhao extends Veiculo{

    private float limtePeso;

    public Caminhao(String placa, String modelo, String marca, float limitePeso) {
        super(placa, modelo, marca);
        this.limtePeso=limitePeso;
        this.setPrecoBase(50);
    }

    @Override
    public String detalhes(){
        return super.detalhes()+ String.format("limite de peso: %f", getLimtePeso());
    }

    public float getLimtePeso() {
        return limtePeso;
    }

    public void setLimtePeso(float limtePeso) {
        this.limtePeso = limtePeso;
    }

}
