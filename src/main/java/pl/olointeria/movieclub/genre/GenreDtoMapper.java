package pl.olointeria.movieclub.genre;

import pl.olointeria.movieclub.genre.dto.GenreDto;

class GenreDtoMapper {
    static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
