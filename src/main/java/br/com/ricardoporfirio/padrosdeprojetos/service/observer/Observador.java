package br.com.ricardoporfirio.padrosdeprojetos.service.observer;

import org.springframework.stereotype.Component;

import br.com.ricardoporfirio.padrosdeprojetos.model.Log;

@Component
public class Observador {

    public Log atualizar(String estado) {
        Log log = new Log();
        log.setData("01/02/2022");
        log.setDescricao(estado);
        return log;
    }
    
}
