package com.example.lista_film.service;

import com.example.lista_film.entity.Film;
import com.example.lista_film.repository.FilmRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository repo;

    public FilmService(FilmRepository repo) {
        this.repo = repo;
    }

    public List<Film> findAll() {
        return repo.findAll();
    }

    public Film getById(Long id) {
        return repo.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Film non trovato: id=" + id));
    }

    @Transactional
    public Film create(Film film) {
        return repo.save(film);
    }

    @Transactional
    public Film update(Long id, Film data) {
        Film existing = getById(id);
        existing.setTitolo(data.getTitolo());
        existing.setRegista(data.getRegista());
        existing.setAnno(data.getAnno());
        existing.setVoto(data.getVoto());
        return repo.save(existing);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
