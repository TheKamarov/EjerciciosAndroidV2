package com.example.recyclerviewpractica.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.recyclerviewpractica.R;
import com.example.recyclerviewpractica.model.Famoso;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleFamoso extends Fragment implements AdapterFamoso.ListenerDelAdapter{

    public static final String CLAVE_FAMOSO = "claveFamoso";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalle_famoso, container, false);
    }

    @Override
    public void informarFamoso(Famoso famoso) {

    }
}
