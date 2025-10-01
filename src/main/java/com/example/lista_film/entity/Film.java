package com.example.lista_film.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "FILM")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITOLO", nullable = false)
    private String titolo;

    @Column(name = "REGISTA", nullable = false)
    private String regista;

    @Column(name = "ANNO", nullable = false)
    private Integer anno;

    @Column(name = "VOTO", nullable = false)
    private Integer voto;

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }
}
