package com.example.recyclerviewpluscardview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewpluscardview.R;
import com.example.recyclerviewpluscardview.model.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crearLista();

        RecyclerView recyclerView = findViewById(R.id.MainActivity_RecyclerView_Books);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,lstBook);

        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        recyclerView.setAdapter(adapter);
    }

    private void crearLista(){

        lstBook = new ArrayList<>();

        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
        lstBook.add(new Book("Diario Emprendedor","Categorie book","Description book",R.drawable.diarioemprendedor));
        lstBook.add(new Book("HAJIRA","Categorie book","Description book",R.drawable.hajira));
        lstBook.add(new Book("El Mundo Que Viene","Categorie book","Description book",R.drawable.elmundoqueviene));
        lstBook.add(new Book("La Iliada","Categorie book","Description book",R.drawable.lailiada));
        lstBook.add(new Book("Construyendo Con Recursos Escasos En Latinoamerica","Categorie book","Description book",R.drawable.construyendo));
        lstBook.add(new Book("Un Trabajo Social Para Los Nuevos Tiempos","Categorie book","Description book",R.drawable.trabajosocial));
        lstBook.add(new Book("Marketing Online 2.0","Categorie book","Description book",R.drawable.marketing));
    }
}
