package com.example.recyclerviewpractica.view;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewpractica.controller.ControllerPelicula;
import com.example.recyclerviewpractica.model.Pelicula;
import com.example.recyclerviewpractica.R;
import com.example.recyclerviewpractica.utils.ResultListener;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaDePeliculasFragment extends Fragment implements AdapterPeliculas.ListenerDelAdapter {

    private RecyclerView recyclerViewPeliculasEstrenos;
    private ListenerDeFragment listenerDeFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista_de_peliculas, container, false);

        encontrarComponentesPorId(view);

        final AdapterPeliculas adapterPeliculas = new AdapterPeliculas(this);

        ControllerPelicula controllerPelicula = new ControllerPelicula();

        controllerPelicula.traePelicula(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {
                adapterPeliculas.setPeliculaList(result);
            }
        });

        recyclerViewPeliculasEstrenos.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        recyclerViewPeliculasEstrenos.setAdapter(adapterPeliculas);

        return view;
    }

    private void encontrarComponentesPorId(View view){
        recyclerViewPeliculasEstrenos = view.findViewById(R.id.ListaDePeliculasFragment_RecyclerView_Estrenos);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listenerDeFragment = (ListenerDeFragment) context;
    }

    @Override
    public void informarPelicula(Pelicula pelicula) {
        listenerDeFragment.recibirPelicula(pelicula);
    }

    public interface ListenerDeFragment{
        public void recibirPelicula(Pelicula pelicula);
    }
}
