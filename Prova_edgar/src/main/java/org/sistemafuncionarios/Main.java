package org.sistemafuncionarios;

import java.util.Scanner;

public class Main {

    //CLASSE MAIN/PRINCIPAL

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Compromisso com = new Compromisso();
        Reuniao reu = new Reuniao();
        EventoSocial evso = new EventoSocial();


        System.out.println(" Olá Seja Bem-Vindo \n" +
                " Você Deseja Realizar Um Agendamento ? \n" +
                " Sim / Não ");

           String opcao = ler.nextLine();
           opcao = opcao.toLowerCase();

           // Isto opcao = opcao.toLowerCase() Faz Com q Não Importe Se A letra ira ser maiuscula ou minuscula
          //  mas o equal deve ser minusculo opcao.equals("sim")

        if (opcao.equals("sim")){
            System.out.println("Qual Vai Ser o Horário ? \nColoque No Formato \nHoras = 00:00 ou '00 Horas'");
            com.setHora(ler.nextLine());
            System.out.println("Qual Vai Ser o Dia ? \nColoque No Formato = dd-mm-yyyy");
            com.setData(ler.nextLine());
            System.out.println("Descrição : \nSe Não Deseja Adicionar Descrição Deixe Em Branco.");
            com.setDescricao(ler.nextLine());
            System.out.println("Quem Deverá Comparecer ? \nMais De um Participante Coloque ','");
            reu.participantes = ler.nextLine();
            System.out.println("Por Ultimo Adicione O Local : \nEx: Rua Princial n180");
            evso.local = ler.nextLine();
            System.out.println("Um Momento\nAgendamento Concluido");
            impressao(com);
            impressao(reu);
            impressao(evso);

        }
        else if (opcao.equals("nao") || opcao.equals("não")){
            System.out.println("Obrigado Pela Preferência");
        }
        else{
            System.out.println("Resposta Inválida Finalizando...");
        }
    }//Aqui Termina O Main //

    static void impressao (Compromisso x){  //Metodo Polimorfio//
        System.out.println(x.RealizarTarefa());
    }
}