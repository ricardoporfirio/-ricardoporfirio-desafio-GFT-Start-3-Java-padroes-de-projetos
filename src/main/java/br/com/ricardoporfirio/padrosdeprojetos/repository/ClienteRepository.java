package br.com.ricardoporfirio.padrosdeprojetos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ricardoporfirio.padrosdeprojetos.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}