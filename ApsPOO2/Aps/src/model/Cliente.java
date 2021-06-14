package model;
import java.time.LocalDateTime;

public class Cliente {
    private String nome;
    private String cnh;
    private String cpf;
    private int idade;
    
    public Cliente(String nome, String cnh , String cpf, int idade) throws Exception{
        this.nome = nome;
        if(idade < 18){
            throw new Exception("Não é permitido pessoas com menos de 18 anos");
        }else
        this.idade = idade;
        this.cnh=cnh;
        this.cpf = cpf;
    }

    //aluga carros
    public void alugaVeiculo(Veiculo veiculo, LocalDateTime dataLocacao, LocalDateTime dataLimite,
     float km, String formaPagamento , float pagamentoAdiantado) throws Exception{

        float aluguel = veiculo.calculaAluguel(dataLocacao, dataLimite);

        if(pagamentoAdiantado> 0 ){
            aluguel =  aluguel - pagamentoAdiantado;
            if(aluguel < 0) aluguel = 0;
        }

        System.out.println(this.detalhes()+"\n");
        System.out.println(veiculo.detalhes()+"\n");
        System.out.printf("Data de locacao:%s , Prazo de devolucao: %s\n\n", dataLocacao, dataLimite);
        System.out.printf("Quilometragem acordada: %.2f \n\n", km);
        System.out.printf("Forma de pagamento: %s, Pagamento adiantado: %.2f, valor a pagar do aluguel: %.2f\n\n",formaPagamento, 
        pagamentoAdiantado, aluguel);
        
    }


    //aluga caminhao
    public void alugaVeiculo(Veiculo caminhao ,int pesoCarga, String cargaTrasnportada, String lugarOrigem,
     String lugarFinal,LocalDateTime dataEntrega, LocalDateTime dataDevolucao, String formaPagamento , float pagamentoAdiantado ) throws Exception{
        float aluguel = caminhao.calculaAluguel(dataEntrega, dataDevolucao);
        
        if(pagamentoAdiantado> 0 ){
            aluguel =  aluguel - pagamentoAdiantado;
            if(aluguel < 0) aluguel = 0;
        }
        System.out.println(this.detalhes()+"\n");
        System.out.println(caminhao.detalhes()+"\n");
        System.out.printf("Data de entrega: %s , Prazo de devolucao : %s\n\n", dataEntrega, dataDevolucao);
        System.out.printf("Forma de pagamento %s, Pagamento adiantado: %.2f, valor a pagar do aluguel: %.2f\n\n",formaPagamento, 
        pagamentoAdiantado, aluguel);
        System.out.printf("Lugar de origem: %s,\nLugar da entrega: %s,\npeso da carga: %d , carga transportada: %s\n",
        lugarOrigem, lugarFinal, pesoCarga, cargaTrasnportada);

    }
    //basicamente , metodo toString
    public String detalhes(){
        return String.format("nome: %s, idade: %d, cpf: %s, cnh: %s", getNome(), getIdade(), getCpf(), getCnh());
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) throws Exception {
        if(idade < 18){
            throw new Exception("Não é permitido pessoas com menos de 18 anos");
        }
        this.idade = idade;
    }


    


}