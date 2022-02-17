package br.com.jacksontenorio8;
import br.com.jacksontenorio8.dominio.Bootcamp;
import br.com.jacksontenorio8.dominio.Curso;
import br.com.jacksontenorio8.dominio.Dev;
import br.com.jacksontenorio8.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso de js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer ");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJackson = new Dev();
        devJackson.setNome("Jackson");
        devJackson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Jackson:" + devJackson.getConteudosInscritos());
        devJackson.progredir();
        devJackson.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Jackson:" + devJackson.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Jackson:" + devJackson.getConteudosConcluidos());
        System.out.println("XP: " + devJackson.calcularTotalXP());

        System.out.println("------------");

        Dev devTenorio = new Dev();
        devTenorio.setNome("Tenorio");
        devTenorio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Tenorio:" + devTenorio.getConteudosInscritos());
        System.out.println("Conteúdo Inscritos Tenorio:" + devTenorio.getConteudosInscritos());
        devTenorio.progredir();
        devTenorio.progredir();
        devTenorio.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Tenorio:" + devTenorio.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Tenorio:" + devTenorio.getConteudosConcluidos());
        System.out.println("XP: " + devTenorio.calcularTotalXP());

    }
}
