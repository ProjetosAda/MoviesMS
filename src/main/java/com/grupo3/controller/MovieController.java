package com.grupo3.controller;


import com.grupo3.dto.MovieDto;
import com.grupo3.service.GetAllMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/")
public class MovieController {

    GetAllMovieService getAllMovieService;
    @GetMapping(path = "/getAll")
    public ResponseEntity<List<MovieDto>> getAll(){
        return ResponseEntity.ok().body(getAllMovieService.execute());
    }
}
