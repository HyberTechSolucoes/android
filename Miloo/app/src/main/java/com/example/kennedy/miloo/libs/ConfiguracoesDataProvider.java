package com.example.kennedy.miloo.libs;

/**
 * Created by Felipe on 06/06/2017.
 */

public class ConfiguracoesDataProvider {

    private String configuracao_titulo;


    public String getConfiguracoes_titulo() {
        return configuracao_titulo;
    }

    public void setConfiguracoes_titulo(String Configuracoes_titulo) {
        this.configuracao_titulo = Configuracoes_titulo;
    }


    public ConfiguracoesDataProvider(String Configuracoes_titulo) {
        this.setConfiguracoes_titulo(Configuracoes_titulo);
    }
}