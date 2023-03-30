package com.grupo3.service;


import com.grupo3.dto.MovieDto;
import com.grupo3.entities.MovieEntity;
import com.grupo3.repository.MovieRepository;
import lombok.AllArgsConstructor;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@AllArgsConstructor
public class GetMovieById {

    @Autowired
    final MovieRepository movieRepository;

    public MovieDto execute(String imdbId) throws Exception {
        Optional<MovieEntity> movieEntity = movieRepository.findByImdbIdIgnoreCase(imdbId);
        if(movieEntity.isPresent()){
            return MovieDto.mapToResponse(movieEntity.get());
        }else{
            throw new Exception("IMDB Movie doesn't exists!");
        }

    }
}
