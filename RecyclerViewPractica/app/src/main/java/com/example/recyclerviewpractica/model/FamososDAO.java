package com.example.recyclerviewpractica.model;

import android.util.Log;

import com.example.recyclerviewpractica.utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FamososDAO extends PeliculaRetrofitDAO{

    private static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String API_KEY = "41c70e6b99d8ae34c17c9c34fd81e344";

    public FamososDAO() {
        super(BASE_URL);
    }

    public void traerFamosos(final ResultListener<List<Credits>> listenerDelControler, Integer movie_Id){

        Call<Credits> call = peliculasService.traerCredits(movie_Id, API_KEY);

        call.enqueue( new Callback<Credits>() {
            @Override
            public void onResponse(Call<Credits> call, Response<Credits> response) {
                Credits containerCast = response.body();
                listenerDelControler.finish((List<Credits>) containerCast);
            }

            @Override
            public void onFailure(Call<Credits> call, Throwable t) {
                Log.d("ewfwq","dwsfaw");

            }
        });

    }

    public void traerFamoso(final ResultListener<List<Famoso>> listenerDelControler){

        Call<ContainerFamoso> call = peliculasService.traerPersona(API_KEY);

        call.enqueue(new Callback<ContainerFamoso>() {
            @Override
            public void onResponse(Call<ContainerFamoso> call, Response<ContainerFamoso> response) {
                ContainerFamoso containerPelicula = response.body();
                listenerDelControler.finish(containerPelicula.getResults());
            }

            @Override
            public void onFailure(Call<ContainerFamoso> call, Throwable t) {
                Log.d("ewfwq","dwsfaw");

            }
        });

    }
   /* public void traerFamoso(ResultListener<List<Famoso>> listListenerPelicula) {

        famosoList.add(new Famoso("Brad Pit","18/4/75", R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));
        famosoList.add(new Famoso("Brad Pit","18/4/75",R.drawable.logomuviapp));


        listListenerPelicula.finish(famosoList);


    }*/
}
