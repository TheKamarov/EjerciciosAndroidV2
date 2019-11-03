package com.example.recyclerviewpractica.model;

import android.util.Log;

import com.example.recyclerviewpractica.utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PeliculaDAO extends PeliculaRetrofitDAO {

    private static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String API_KEY = "41c70e6b99d8ae34c17c9c34fd81e344";

    public PeliculaDAO(){
        super(BASE_URL);
    }

    public void traerPeliculas(final ResultListener<List<Pelicula>> listenerDelController){
        Call<ConteinerPelicula> call = peliculasService.traerPelicula(API_KEY);

        call.enqueue(new Callback<ConteinerPelicula>() {
            @Override
            public void onResponse(Call<ConteinerPelicula> call, Response<ConteinerPelicula> response) {
                ConteinerPelicula conteinerPelicula = response.body();
                listenerDelController.finish(conteinerPelicula.getPeliculaList());
            }

            @Override
            public void onFailure(Call<ConteinerPelicula> call, Throwable t) {
                Log.d("ewfwg", "dwsfaw");
            }
        });
    }

    public void traerUpcoming(final ResultListener<List<Pelicula>> listenerDelControler){

        Call<ConteinerPelicula> call = peliculasService.traerUpcoming(API_KEY);

        call.enqueue(new Callback<ConteinerPelicula>() {
            @Override
            public void onResponse(Call<ConteinerPelicula> call, Response<ConteinerPelicula> response) {
                ConteinerPelicula containerPelicula = response.body();
                listenerDelControler.finish(containerPelicula.getPeliculaList());
            }

            @Override
            public void onFailure(Call<ConteinerPelicula> call, Throwable t) {
                Log.d("ewfwq","dwsfaw");

            }
        });

    }


    public  void traerCredits(final ResultListener<Credits> resultListenerController,Integer movieId){
        Call<Credits> creditsCall = peliculasService.traerCredits(movieId,API_KEY);

        creditsCall.enqueue(new Callback<Credits>() {
            @Override
            public void onResponse(Call<Credits> call, Response<Credits> response) {
                Credits resultsCredit = response.body();
                resultListenerController.finish(resultsCredit);
            }

            @Override
            public void onFailure(Call<Credits> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
