package com.grupo3.dto;

import com.grupo3.entities.MovieEntity;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class MovieDto {
        private Long id;
        private String imdbId;
        private String title;
        private String year;
        private String genre;
        private Float imdbRating;
        private Long imdbVotes;
        private Float score;
        private String posterUrl;

        public static MovieDto mapToResponse(MovieEntity movieEntity){
                return MovieDto.builder()
                        .id(movieEntity.getId())
                        .imdbId(movieEntity.getImdbId())
                        .genre(movieEntity.getGenre())
                        .year(movieEntity.getYear())
                        .title(movieEntity.getTitle())
                        .score(movieEntity.getScore())
                        .imdbRating(movieEntity.getImdbRating())
                        .imdbVotes(movieEntity.getImdbVotes())
                        .posterUrl(movieEntity.getPosterUrl())
                        .build();
        }
}
