package com.example.recyclerviewpractica.model;

import com.example.recyclerviewpractica.model.ServiceInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PeliculaRetrofitDAO {

    private Retrofit retrofit;
    protected ServiceInterface peliculasService;

    public PeliculaRetrofitDAO(String baseURL){
        retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        peliculasService = retrofit.create(ServiceInterface.class);
    }
}
