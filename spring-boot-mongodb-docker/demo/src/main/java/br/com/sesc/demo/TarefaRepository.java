
package br.com.sesc.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaRepository extends MongoRepository<Tarefa, String> {
}


