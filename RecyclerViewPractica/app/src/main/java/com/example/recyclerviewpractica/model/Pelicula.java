package com.example.recyclerviewpractica.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Pelicula implements Serializable {

    public static final String BASE_URL = "https://image.tmdb.org/t/p/original";

    @SerializedName("title")
    private String stringTitulo;
    private Integer integerId;
    private String stringDirector;
    @SerializedName("release_date")
    private String stringFechaDeEstreno;
    @SerializedName("poster_path")
    private String stringPoster;
    @SerializedName("backdrop_path")
    private String stringBackdrop;
    @SerializedName("overview")
    private String stringSinopsis;

    public Pelicula(String stringTitulo, Integer integerId, String stringDirector, String stringFechaDeEstreno, String stringPoster, String stringBackdrop, String stringSinopsis) {
        this.stringTitulo = stringTitulo;
        this.integerId = integerId;
        this.stringDirector = stringDirector;
        this.stringFechaDeEstreno = stringFechaDeEstreno;
        this.stringPoster = stringPoster;
        this.stringBackdrop = stringBackdrop;
        this.stringSinopsis = stringSinopsis;
    }

    public String getStringTitulo() {
        return stringTitulo;
    }

    public void setStringTitulo(String stringTitulo) {
        this.stringTitulo = stringTitulo;
    }

    public Integer getIntegerId() {
        return integerId;
    }

    public void setIntegerId(Integer integerId) {
        this.integerId = integerId;
    }

    public String getStringDirector() {
        return stringDirector;
    }

    public void setStringDirector(String stringDirector) {
        this.stringDirector = stringDirector;
    }

    public String getStringFechaDeEstreno() {
        return stringFechaDeEstreno;
    }

    public void setStringFechaDeEstreno(String stringFechaDeEstreno) {
        this.stringFechaDeEstreno = stringFechaDeEstreno;
    }

    public String getStringPoster() {
        return stringPoster;
    }

    public void setStringPoster(String stringPoster) {
        this.stringPoster = stringPoster;
    }

    public String getStringBackdrop() {
        return stringBackdrop;
    }

    public void setStringBackdrop(String stringBackdrop) {
        this.stringBackdrop = stringBackdrop;
    }

    public String getStringSinopsis() {
        return stringSinopsis;
    }

    public void setStringSinopsis(String stringSinopsis) {
        this.stringSinopsis = stringSinopsis;
    }

    public String generaURLImagen(){
        return BASE_URL + stringPoster;
    }

    public String generaURLImagencelda(){
        return BASE_URL + stringBackdrop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return integerId.equals(pelicula.integerId);
    }
}
