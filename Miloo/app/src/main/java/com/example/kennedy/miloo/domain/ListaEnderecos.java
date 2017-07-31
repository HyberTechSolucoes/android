package com.example.kennedy.miloo.domain;

/**
 * Created by Felipe on 30/07/2017.
 */

public class ListaEnderecos {

    private int img_lista_endereco;
    private String lista_endereco_titulo;
    private String lista_endereco_subtitulo;
    private String lista_endereco_cidade;

    public int getLista_endereco_img() {
        return img_lista_endereco;
    }

    public void setLista_endereco_img(int img_lista_endereco) {
        this.img_lista_endereco = img_lista_endereco;
    }

    public String getLista_endereco_titulo() {
        return lista_endereco_titulo;
    }

    public void setLista_endereco_titulo(String lista_endereco_titulo) {
        this.lista_endereco_titulo = lista_endereco_titulo;
    }

    public String getLista_endereco_subtitulo() {
        return lista_endereco_subtitulo;
    }

    public void setLista_endereco_subtitulo(String lista_endereco_subtitulo) {
        this.lista_endereco_subtitulo = lista_endereco_subtitulo;
    }

    public String getLista_endereco_cidade() {
        return lista_endereco_cidade;
    }

    public void setLista_endereco_cidade(String lista_endereco_cidade) {
        this.lista_endereco_cidade = lista_endereco_cidade;
    }

    public ListaEnderecos(int img_lista_endereco, String lista_endereco_titulo, String lista_endereco_subtitulo, String lista_endereco_cidade) {
        this.setLista_endereco_img(img_lista_endereco);
        this.setLista_endereco_titulo(lista_endereco_titulo);
        this.setLista_endereco_subtitulo(lista_endereco_subtitulo);
        this.setLista_endereco_cidade(lista_endereco_cidade);
    }
    public ListaEnderecos( String lista_endereco_titulo, String lista_endereco_subtitulo, String lista_endereco_cidade) {
        this.setLista_endereco_titulo(lista_endereco_titulo);
        this.setLista_endereco_subtitulo(lista_endereco_subtitulo);
        this.setLista_endereco_cidade(lista_endereco_cidade);
    }
}
