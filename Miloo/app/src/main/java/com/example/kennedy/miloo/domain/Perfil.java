package com.example.kennedy.miloo.domain;

/**
 * Created by Felipe on 06/08/2017.
 */

public class Perfil {

    private int perfil_img;
    private String perfil_titulo;
    private String perfil_subtitulo;
    private String perfil_avaliação;
    private String perfil_resposta;

    public int getPerfil_img() {
        return perfil_img;
    }

    public void setPerfil_img(int img_notificacao) {
        this.perfil_img = perfil_img;
    }

    public String getPerfil_titulo() {
        return perfil_titulo;
    }

    public void setPerfil_titulo(String perfil_titulo) {
        this.perfil_titulo = perfil_titulo;
    }

    public String getPerfil_subtitulo() {
        return perfil_subtitulo;
    }

    public void setPerfil_subtitulo(String perfil_subtitulo) {
        this.perfil_subtitulo = perfil_subtitulo;
    }

    public String getPerfil_avaliação() {
        return perfil_avaliação;
    }

    public void setPerfil_avaliação(String perfil_avaliação) {
        this.perfil_avaliação = perfil_avaliação;
    }


    public String getPerfil_resposta() {
        return perfil_resposta;
    }

    public void setPerfil_resposta(String perfil_resposta) {
        this.perfil_resposta = perfil_resposta;
    }


    public Perfil(int perfil_img, String perfil_titulo, String perfil_subtitulo, String perfil_avaliação) {
        this.perfil_img = perfil_img;
        this.perfil_titulo = perfil_titulo;
        this.perfil_subtitulo = perfil_subtitulo;
        this.perfil_avaliação = perfil_avaliação;
    }

    public Perfil(int perfil_img, String perfil_titulo, String perfil_subtitulo, String perfil_avaliação, String perfil_resposta) {
        this.perfil_img = perfil_img;
        this.perfil_titulo = perfil_titulo;
        this.perfil_subtitulo = perfil_subtitulo;
        this.perfil_avaliação = perfil_avaliação;
        this.perfil_resposta = perfil_resposta;
    }
}