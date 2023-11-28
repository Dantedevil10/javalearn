package org.sistemafuncionarios;

public class EventoSocial extends Reuniao{
    //Atributos Adicionais
    public String local;
    //Metodos da Classe
    @Override
    public String RealizarTarefa(){
        return "O Local De Encontro Será: " + local;
    }
}
