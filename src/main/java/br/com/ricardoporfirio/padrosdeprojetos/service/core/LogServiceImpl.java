package br.com.ricardoporfirio.padrosdeprojetos.service.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricardoporfirio.padrosdeprojetos.model.Log;
import br.com.ricardoporfirio.padrosdeprojetos.repository.LogRepository;
import br.com.ricardoporfirio.padrosdeprojetos.service.LogService;


@Service
public class LogServiceImpl  implements LogService{

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private LogRepository logRepository;
    


    //Implementações de métodos da interface.
    @Override
    public Iterable<Log> buscarTodos() {
        return logRepository.findAll();
    }

    @Override
    public void inserir(Log log) {
        logRepository.save(log);
    }

}
