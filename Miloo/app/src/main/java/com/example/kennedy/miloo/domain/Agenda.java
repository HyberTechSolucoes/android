package com.example.kennedy.miloo.domain;

/**
 * Created by Felipe on 30/07/2017.
 */

public class Agenda{

    private int img_agenda;
    private String agenda_titulo;
    private String agenda_subtitulo;
    private String agenda_data;

    public int getAgenda_img() {
        return img_agenda;
    }

    public void setAgenda_img(int img_lista_endereco) {
        this.img_agenda = img_agenda;
    }

    public String getAgenda_titulo() {
        return agenda_titulo;
    }

    public void setAgenda_titulo(String agenda_titulo) {
        this.agenda_titulo = agenda_titulo;
    }

    public String getAgenda_subtitulo() {
        return agenda_subtitulo;
    }

    public void setAgenda_subtitulo(String agenda_subtitulo) {
        this.agenda_subtitulo = agenda_subtitulo;
    }

    public String getAgenda_cidade() {
        return agenda_data;
    }

    public void setAgenda_cidade(String agenda_data) {
        this.agenda_data = agenda_data;
    }

    public Agenda(int img_agenda, String agenda_titulo, String agenda_subtitulo, String agenda_data) {
        this.setAgenda_img(img_agenda);
        this.setAgenda_titulo(agenda_titulo);
        this.setAgenda_subtitulo(agenda_subtitulo);
        this.setAgenda_cidade(agenda_data);
    }
    public Agenda( String agenda_titulo, String agenda_subtitulo, String agenda_data) {
        this.setAgenda_titulo(agenda_titulo);
        this.setAgenda_subtitulo(agenda_subtitulo);
        this.setAgenda_cidade(agenda_data);
    }
}
