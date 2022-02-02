package br.com.ricardoporfirio.padrosdeprojetos.service.observer;

import org.springframework.stereotype.Component;

import br.com.ricardoporfirio.padrosdeprojetos.model.Log;

@Component
public class SujeitoObservado {

    private Observador observador = new Observador();
    private String estado;
    private Log log;

    public void notificar() {
        log = observador.atualizar(estado);
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificar();
    }

    public Log getLog() {
        return log;
    }
}
