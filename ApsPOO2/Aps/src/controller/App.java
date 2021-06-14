package controller;
import java.time.LocalDateTime;

import model.Caminhao;
import model.CarroEsportivo;
import model.CarroPasseio;
import model.Cliente;
import model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

        //Aps de POO, Feita por João Pedro ferreira da cunha 
        

        
        // Clientes n podem ter menos de 18 anos 
        Cliente joao = new Cliente("joao", "213123", "2312321", 23);
        Cliente fabricio = new Cliente("fabricio", "198573843","39341842", 40);
        Cliente vania = new Cliente("vania", "832820984","83293184", 52);

        //instanciando cada veiculo 
        Veiculo carro = new CarroPasseio("231231", "hb20", "hyundai", 1);
        Veiculo carro2 = new CarroEsportivo("123231", "i800", "ferrari", 300);
        Veiculo caminhao = new Caminhao("sad123", "k999", "volks", 700);


        
        //usei LocalDateTime pra fazer calculos com datas e tempo , O medoto alugaVeiculo necessita de 2 LocalDateTime
        LocalDateTime data3 = LocalDateTime.now();
        LocalDateTime data4 = LocalDateTime.of(2021, 06, 2, 13, 23, 0);
        
        joao.alugaVeiculo(caminhao, 300, "eletronicos", "rua 1", "rua2", data3, data4, "debito", 0);
        
        System.out.println("****************************************");

        fabricio.alugaVeiculo(carro, data3, data4, 500, "debito", 100);

        System.out.println("****************************************");

        LocalDateTime data1 = LocalDateTime.of(2021, 06, 2, 15, 20, 0);
        LocalDateTime data2 = LocalDateTime.of(2021, 06, 2, 16, 50, 0);

        vania.alugaVeiculo(carro2, data1, data2, 60 , "A vista", 300);
    }
}
