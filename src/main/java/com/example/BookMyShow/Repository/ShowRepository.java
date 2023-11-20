package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Models.Movie;
import com.example.BookMyShow.Models.Show;
import com.example.BookMyShow.Models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public interface ShowRepository extends JpaRepository<Show,Integer> {


    Show findShowByShowDateAndShowTimeAndMovieAndTheater(LocalDate showDate, LocalTime showTime, Movie movie, Theater theater);

}
