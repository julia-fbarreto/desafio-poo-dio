package br.com.dio.desafio.dominio;

import java.util.Comparator;
import java.util.List;

public class Ranking {

        //mostrar quem fez a pontuação mais alta
    public void calcularRanking(List<Dev> devs){
        //ordena os devs por total de pontos de forma decrescente
        devs.sort(Comparator.comparing(Dev::calcularTotalXp).reversed());
        String nomeGanhador = devs.get(0).getNome();
        System.out.println(nomeGanhador + " fez mais pontos no bootcamp!");
    }
}





