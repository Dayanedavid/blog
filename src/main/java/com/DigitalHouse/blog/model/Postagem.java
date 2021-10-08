package com.DigitalHouse.blog.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="postagem")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//chave primaria(pk)
    private Long id;

    @NotNull //Não recebe valores vazio
    @Size(min=5, max=100) //quant caracteres
    private String titulo;

    @NotNull
    @Size(min=5,max=500)
    private String texto;

    @Temporal(TemporalType.TIMESTAMP) //Trabalhando com o tempo
    private Date date = new java.sql.Date(System.currentTimeMillis());

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
