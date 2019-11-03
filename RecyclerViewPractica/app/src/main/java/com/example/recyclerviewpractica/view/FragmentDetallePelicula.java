package com.example.recyclerviewpractica.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewpractica.R;
import com.example.recyclerviewpractica.controller.ControllerPelicula;
import com.example.recyclerviewpractica.model.Famoso;
import com.example.recyclerviewpractica.model.Pelicula;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetallePelicula extends Fragment implements AdapterFamoso.ListenerDelAdapter{

    public static final String CLAVE_PELICULA = "clavePelicula";

    private RecyclerView recyclerView;
    private FragmentListaFamosos.ListenerDeFragment listenerDelFragmento;
    private TextView textViewTitulo, textViewSinopsis;
    private ImageView imagenPelicula;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_famoso, container, false);

        textViewTitulo = view.findViewById(R.id.fragment_detalle_TituloPelicula);
        textViewSinopsis = view.findViewById(R.id.fragment_detalle_DescripcionPelicula);
        imagenPelicula = view.findViewById(R.id.detalle_peliculas_imageview);

        Pelicula peliculaSeleccionada = (Pelicula) getArguments().getSerializable(CLAVE_PELICULA);

        Glide.with(this).load(peliculaSeleccionada.generaURLImagen()).into(imagenPelicula);
        textViewTitulo.setText(peliculaSeleccionada.getStringTitulo());
        textViewSinopsis.setText(peliculaSeleccionada.getStringSinopsis());

        recyclerView = view.findViewById(R.id.fragment_famoso_recycler);
        //crear el adapter
        final AdapterFamoso adapterFamoso = new AdapterFamoso(this);

        ControllerPelicula peliculaController = new ControllerPelicula();



        //setearle el layout manager (
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),recyclerView.HORIZONTAL,false));
        //setearle el adapter
        recyclerView.setAdapter(adapterFamoso);



        return view;
    }

    @Override
    public void informarFamoso(Famoso famoso) {

        listenerDelFragmento.recibirFamoso(famoso);

    }

    public interface ListenerDeFragment {

        public void recibirFamoso(Famoso famoso);


    }

}
