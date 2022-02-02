package br.com.ricardoporfirio.padrosdeprojetos.service;

import br.com.ricardoporfirio.padrosdeprojetos.model.Log;


public interface LogService {

    Iterable<Log> buscarTodos();

    void inserir(Log log);
}
