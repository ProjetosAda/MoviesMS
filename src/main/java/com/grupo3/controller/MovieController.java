package com.grupo3.controller;


import com.grupo3.dto.MovieDto;
import com.grupo3.service.GetAllMovieService;
import com.grupo3.service.GetMovieById;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/")
public class MovieController {

    GetAllMovieService getAllMovieService;
    GetMovieById getMovieById;
    @GetMapping(path = "/getAll")
    public ResponseEntity<List<MovieDto>> getAll(){
        return ResponseEntity.ok().body(getAllMovieService.execute());
    }


    @GetMapping(path = "/{imdbId}")
    public ResponseEntity<MovieDto> getById(@PathVariable String imdbId) throws Exception {
        return ResponseEntity.ok().body(getMovieById.execute(imdbId));
    }
}
