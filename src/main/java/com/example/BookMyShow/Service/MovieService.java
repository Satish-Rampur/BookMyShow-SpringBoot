package com.example.BookMyShow.Service;

import com.example.BookMyShow.Models.Movie;
import com.example.BookMyShow.Repository.MovieRepository;
import com.example.BookMyShow.RequestDtos.AddMovieRequest;
import com.example.BookMyShow.Transformers.MovieTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(AddMovieRequest addMovieRequest) throws Exception{

        Movie movie = MovieTransformer.convertAddMovieReqToMovie(addMovieRequest);

        movieRepository.save(movie);

        return "Movie has been added to the DB successfully";

    }


}

