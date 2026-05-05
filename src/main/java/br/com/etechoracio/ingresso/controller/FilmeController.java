package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.mapper.FilmeMapper;
import br.com.etechoracio.ingresso.repository.FilmeRepository;
import br.com.etechoracio.ingresso.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public List <FilmeResponseDTO> findAll(){
        return filmeService.findAll();
    }


}
