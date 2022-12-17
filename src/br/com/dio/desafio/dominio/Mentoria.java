package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {

        //alteração realizada por Júlia Ferreira
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatado = data.format(formatter);

        return "Mentoria{" +
                "Título='" + getTitulo() + '\'' +
                "Descrição='" + getDescricao() + '\'' +
                "Data=" + dataFormatado +
                '}';


    }
}
