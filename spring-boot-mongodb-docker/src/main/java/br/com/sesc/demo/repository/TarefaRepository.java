package br.com.sesc.demo.repository;

import br.com.sesc.demo.entity.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaRepository extends MongoRepository<Tarefa, String> {
}


