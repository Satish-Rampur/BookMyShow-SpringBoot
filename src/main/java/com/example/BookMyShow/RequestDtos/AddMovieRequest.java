package com.example.BookMyShow.RequestDtos;

import com.example.BookMyShow.Enums.Genre;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AddMovieRequest {

    private String movieName;
    private Double rating;
    private Genre genre;
    private LocalDate releaseDate;
}

