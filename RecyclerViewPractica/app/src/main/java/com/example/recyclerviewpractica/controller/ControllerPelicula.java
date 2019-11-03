package com.example.recyclerviewpractica.controller;

import com.example.recyclerviewpractica.model.Credits;
import com.example.recyclerviewpractica.model.Famoso;
import com.example.recyclerviewpractica.model.FamososDAO;
import com.example.recyclerviewpractica.model.Pelicula;
import com.example.recyclerviewpractica.model.PeliculaDAO;
import com.example.recyclerviewpractica.utils.ResultListener;

import java.util.List;

public class ControllerPelicula {

    Integer integerPeliculaId;

    public void traePelicula(final ResultListener<List<Pelicula>> listenerDeLaVista){
        final PeliculaDAO peliculaDAO = new PeliculaDAO();

        peliculaDAO.traerPeliculas(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(final List<Pelicula> result) {
                for (Pelicula pelicula : result){
                    integerPeliculaId = pelicula.getIntegerId();
                    peliculaDAO.traerCredits(new ResultListener<Credits>() {
                        @Override
                        public void finish(Credits resultCredit) {
                            if(resultCredit != null){
                                Integer id = resultCredit.getId();
                                String directorName = resultCredit.getCrew().get(0).getName();//Nombre del director (supuestamente)
                                for (Pelicula pelicula1 : result) {
                                    if(pelicula1.getIntegerId().equals(id)) {
                                        pelicula1.setStringDirector(directorName);
                                    }
                                    listenerDeLaVista.finish(result);
                                }
                            }
                        }
                    }, integerPeliculaId);
                }
            }
        });
    }

    public void traeUpcoming(final ResultListener<List<Pelicula>> listenerDeLaVista) {
        final PeliculaDAO peliculaDao = new PeliculaDAO();

        peliculaDao.traerUpcoming(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(final List<Pelicula> resultPelicula) {
                for (Pelicula pelicula : resultPelicula) {
                    integerPeliculaId = pelicula.getIntegerId();
                    peliculaDao.traerCredits(new ResultListener<Credits>() {
                        @Override
                        public void finish(Credits resultCredit) {
                            if(resultCredit != null){
                                Integer id = resultCredit.getId();
                                String directorName = resultCredit.getCrew().get(0).getName();//Nombre del director (supuestamente)
                                for (Pelicula pelicula1 : resultPelicula) {
                                    if(pelicula1.getIntegerId().equals(id)) {
                                        pelicula1.setStringDirector(directorName);
                                    }
                                    listenerDeLaVista.finish(resultPelicula);
                                }
                            }
                        }
                    }, integerPeliculaId);
                }

                //listenerDeLaVista.finish(result);
            }

        });
    }

    public void traeListaFamosos(final ResultListener<List<Famoso>> listenerDeLaVistaFamoso) {
        final FamososDAO famososDAO = new FamososDAO();
        final PeliculaDAO peliculaDAO = new PeliculaDAO();

        famososDAO.traerFamoso(new ResultListener<List<Famoso>>() {
            @Override
            public void finish(final List<Famoso> resultadoFamoso) {
                for (Famoso famoso : resultadoFamoso) {
                    peliculaDAO.traerCredits(new ResultListener<Credits>() {
                        @Override
                        public void finish(Credits result) {
                            Integer id = result.getId();
                            String nombre = result.getCast().get(0).getName();
                            String imagen = result.getCast().get(0).getProfile_path();
                            for (Famoso famoso1 : resultadoFamoso) {
                                famoso1.setNombre(nombre);
                                famoso1.setImagenDeFamoso(imagen);
                            }
                            listenerDeLaVistaFamoso.finish(resultadoFamoso);
                        }
                    }, integerPeliculaId);
                }

            }
        });
    }
}
