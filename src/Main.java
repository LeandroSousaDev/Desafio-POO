import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso de java");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Develop");
        bootCamp.setDescricao("Descrição do Bootcamp");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());


        System.out.println("-------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}