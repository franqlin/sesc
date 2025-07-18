package br.com.sesc.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "tasks")
public class Tarefa {

    @Id
    private String id;
    private String titulo;
    private String descricao;
    private boolean completo;

    public Tarefa() {
    }

    public Tarefa(String title, String description, boolean completed) {
        this.titulo = title;
        this.descricao = description;
        this.completo = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id='" + id + '\'' +
                ", title='" + titulo + '\'' +
                ", description='" + descricao + '\'' +
                ", completed=" + completo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return completo == tarefa.completo && Objects.equals(id, tarefa.id)
                && Objects.equals(titulo, tarefa.titulo) && Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, descricao, completo);
    }
}

