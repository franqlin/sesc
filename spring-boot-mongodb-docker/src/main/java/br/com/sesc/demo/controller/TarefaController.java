package br.com.sesc.demo.controller;

import br.com.sesc.demo.entity.Tarefa;
import br.com.sesc.demo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/api/tarefa")
public class TarefaController {

    @Autowired
    private TarefaRepository taskRepository;

    @PostMapping("/create")
    public ResponseEntity<Tarefa> createTask(@RequestBody Tarefa task) {
        return ResponseEntity.status(201).body(taskRepository.save(task));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Tarefa>> getAllTasks() {
        return ResponseEntity.ok(taskRepository.findAll());
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Tarefa> getTaskById(@PathVariable String id) {
        return taskRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable String id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}