package com.example.recyclerviewpractica.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewpractica.model.Pelicula;
import com.example.recyclerviewpractica.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterPeliculas extends RecyclerView.Adapter<AdapterPeliculas.ViewHolderPeliculas> {

    private List<Pelicula> peliculaList;
    private ListenerDelAdapter listenerDelAdapter;

    public AdapterPeliculas(List<Pelicula> peliculaList){
        this.peliculaList = peliculaList;
    }

    public AdapterPeliculas(ListenerDelAdapter listenerDelAdapter){
        peliculaList = new ArrayList<>();
        this.listenerDelAdapter = listenerDelAdapter;
    }

    public void setPeliculaList(List<Pelicula> peliculaList){
        this.peliculaList = peliculaList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolderPeliculas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.celda_pelicula, parent, false);
        return new ViewHolderPeliculas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPeliculas holder, int position) {
        Pelicula peliculaMostrada = peliculaList.get(position);
        holder.cargarPelicula(peliculaMostrada);
    }

    @Override
    public int getItemCount() {
        return peliculaList.size();
    }

    public class ViewHolderPeliculas extends RecyclerView.ViewHolder{

        private TextView textViewTitulo;
        private TextView textViewDirector;
        private TextView textViewFechaDeEstreno;
        private ImageView imageViewImagenDePelicula;

        public ViewHolderPeliculas(@NonNull View itemView){
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.CeldaPelicula_TextView_Titulo);
            textViewDirector = itemView.findViewById(R.id.CeldaPelicula_TextView_Director);
            imageViewImagenDePelicula = itemView.findViewById(R.id.CeldaPelicula_ImageView_FondoDeLaCelda);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Pelicula peliculaSeleccionada = peliculaList.get(getAdapterPosition());
                    listenerDelAdapter.informarPelicula(peliculaSeleccionada);
                }
            });
        }

        public void cargarPelicula(Pelicula pelicula){
            Glide.with(imageViewImagenDePelicula.getContext()).load(pelicula.generaURLImagencelda()).into(imageViewImagenDePelicula);
            textViewTitulo.setText(pelicula.getStringTitulo());
            textViewDirector.setText(pelicula.getStringDirector());
        }
    }

    public interface ListenerDelAdapter{
        public void informarPelicula(Pelicula pelicula);
    }
}
