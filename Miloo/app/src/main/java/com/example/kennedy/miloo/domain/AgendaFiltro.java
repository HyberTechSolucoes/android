package com.example.kennedy.miloo.domain;

/**
 * Created by Felipe on 30/07/2017.
 */

public class AgendaFiltro {

    private String agenda_filtro_titulo;


    public String getAgenda_Filtro_titulo() {
        return agenda_filtro_titulo;
    }

    public void setAgenda_Filtro_titulo(String agenda_titulo) {
        this.agenda_filtro_titulo = agenda_titulo;
    }


    public AgendaFiltro( String agenda_filtro_titulo) {
        this.setAgenda_Filtro_titulo(agenda_filtro_titulo);
    }
}
