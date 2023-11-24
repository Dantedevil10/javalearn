package org.sistemafuncionarios;

public class Compromisso {
    //Atributos Da Classe
    private String data, hora, descricao;

    //Métodos Get da classe
    public String getHora(){
        return hora;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getData(){
        return data;
    }
    //Metodos Set
    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //Fim Dos Metodos

    public String RealizarTarefa(){

        return "Você Tem Um Compromisso No Dia: " + getData() + " Às " + getHora() + "\n Descrição:\n " + getDescricao();
    }
}