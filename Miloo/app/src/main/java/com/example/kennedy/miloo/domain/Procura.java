package com.example.kennedy.miloo.domain;

/**
 * Created by Felipe on 20/07/2017.
 */

public class Procura {
    private String tituloSolicitacao;
    private String subtituloSolicitacao;
    private String dataSolicitacao;
    private String notaSolicitacao;
    private int starSolicitacao;
    private int fotoSolicitacao;


    public Procura(){}
    public Procura(String t, String s, String d, String n, int st, int ft){
        tituloSolicitacao = t ;
        subtituloSolicitacao = s;
        dataSolicitacao = d;
        notaSolicitacao = n;
        starSolicitacao = st;
        fotoSolicitacao = ft;
    }


    public String gettituloSolicitacao() {
        return tituloSolicitacao;
    }

    public void settituloSolicitacao(String tituloSolicitacao) {
        this.tituloSolicitacao = tituloSolicitacao;
    }

    public String getsubtituloSolicitacao() {
        return subtituloSolicitacao;
    }

    public void setsubtituloSolicitacao(String subtituloSolicitacao) {
        this.subtituloSolicitacao = subtituloSolicitacao;
    }

    public String getdataSolicitacao() {
        return dataSolicitacao;
    }

    public void setdataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getnotaSolicitacao() {
        return notaSolicitacao;
    }

    public void setnotaSolicitacao(String notaSolicitacao) {
        this.notaSolicitacao = notaSolicitacao;
    }

    public int getstarSolicitacao() {
        return starSolicitacao;
    }

    public void setstarSolicitacao(int starSolicitacao) {
        this.starSolicitacao = starSolicitacao;
    }

    public int getfotoSolicitacao() {
        return fotoSolicitacao;
    }

    public void setfotoSolicitacao(int fotoSolicitacao) {
        this.fotoSolicitacao = fotoSolicitacao;
    }
}
