package com.example.lista_film.controller;

import com.example.lista_film.entity.Film;
import com.example.lista_film.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/film")
public class FilmController {

    private final FilmService service;

    public FilmController(FilmService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("films", service.findAll());
        return "film/list";
    }

    @GetMapping("/new")
    public String newForm(Model model) {
        model.addAttribute("film", new Film());
        return "film/form";
    }

    @PostMapping
    public String create(@ModelAttribute("film") Film film) {
        service.create(film);
        return "redirect:/film";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("film", service.getById(id));
        return "film/form";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute("film") Film film) {
        service.update(id, film);
        return "redirect:/film";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/film";
    }
}
