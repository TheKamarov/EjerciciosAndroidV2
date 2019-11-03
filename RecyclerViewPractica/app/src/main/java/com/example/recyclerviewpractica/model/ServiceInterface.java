package com.example.recyclerviewpractica.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServiceInterface {

    @GET("movie/now_playing")
    Call<ConteinerPelicula> traerPelicula(@Query("api_key") String apiKey);

    @GET("movie/{movie_id}/credits")
    Call<Credits> traerCredits(@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<ConteinerPelicula> traerUpcoming(@Query("api_key") String apiKey);

    @GET("person/popular")
    Call<ContainerFamoso> traerPersona(@Query("api_key") String apiKey);
}
