package br.com.ricardoporfirio.padrosdeprojetos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ricardoporfirio.padrosdeprojetos.model.Log;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

}