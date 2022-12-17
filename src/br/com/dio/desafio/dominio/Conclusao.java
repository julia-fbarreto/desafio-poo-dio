package br.com.dio.desafio.dominio;

public class Conclusao {

        //declarar a exibição mensagem de conclusão do bootcamp ou se faltam cursos
    public void cursosEMentoriaFinalizadosParaConclusao(Dev conteudos){
        if(conteudos.getConteudosInscritos().size() == 0) {
            System.out.println("Todos os cursos concluídos. Bootcamp finalizado!\uD83C\uDFC6");
        } else {
            System.out.println("Ainda faltam cursos para concluir");
        }
    }
}
