package org.sistemafuncionarios;

public class Reuniao extends Compromisso {
    //Atributos Adicionais
    public String participantes;

    //Metodos Da Classe
    @Override
    public String RealizarTarefa(){

        return "Quem Irá Comparecer :\n" + participantes.replaceAll(",", "\n");

        //participantes.replaceAll(",", "\n") faz com q as virgulas sejam uma quebra de linha
        //quando aparecer  no Println
    }
}
