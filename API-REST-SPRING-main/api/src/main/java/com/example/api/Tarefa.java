package com.example.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private boolean feita;

    // Construtor padrão necessário para JPA
    public Tarefa() {
    }

    // Construtor com argumentos (sem incluir o id)
    public Tarefa(String descricao, boolean feita) {
        this.descricao = descricao;
        this.feita = feita;
    }

    // Getters e Setters públicos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }
}
