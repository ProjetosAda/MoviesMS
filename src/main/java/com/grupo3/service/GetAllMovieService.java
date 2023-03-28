package com.grupo3.service;

import com.grupo3.dto.MovieDto;
import com.grupo3.entities.MovieEntity;
import com.grupo3.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



@AllArgsConstructor
public class GetAllMovieService {

    @Autowired
    final MovieRepository movieRepository;

    public List<MovieDto> execute(){
        List<MovieEntity> movies = movieRepository.findAll();
        List<MovieDto> movieDtos = new ArrayList<>();

        if(Objects.nonNull(movies)){
            movies.forEach(it -> {
                movieDtos.add(MovieDto.mapToResponse(it));
            });
        }
        return movieDtos;
    }

}
