package com.example.recyclerviewpractica.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractica.R;
import com.example.recyclerviewpractica.controller.ControllerPelicula;
import com.example.recyclerviewpractica.model.Famoso;

public class FragmentListaFamosos extends Fragment implements AdapterFamoso.ListenerDelAdapter  {

    private RecyclerView recyclerView;
    private ListenerDeFragment listenerDelFragmento;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_famosos, container, false);

        recyclerView = view.findViewById(R.id.fragment_famoso_recycler);
        //crear el adapter
        final AdapterFamoso adapterFamoso = new AdapterFamoso(this);

        ControllerPelicula peliculaController = new ControllerPelicula();
        
        //setearle el layout manager (
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false));
        //setearle el adapter
        recyclerView.setAdapter(adapterFamoso);


        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listenerDelFragmento = (ListenerDeFragment) context;
    }


    @Override
    public void informarFamoso(Famoso famoso) {
        listenerDelFragmento.recibirFamoso(famoso);
    }

    public interface ListenerDeFragment {

        public void recibirFamoso(Famoso famoso);


    }
}

