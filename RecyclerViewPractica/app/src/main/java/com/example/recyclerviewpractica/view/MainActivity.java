package com.example.recyclerviewpractica.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewpractica.R;
import com.example.recyclerviewpractica.model.Pelicula;
import com.example.recyclerviewpractica.view.ListaDePeliculasFragment;

public class MainActivity extends AppCompatActivity implements ListaDePeliculasFragment.ListenerDeFragment{

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarComponentesPorId();

        pegarFragment(new ListaDePeliculasFragment());
    }

    private void pegarFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.MainActivity_CardView_ContenedorFragments,fragment )
                .addToBackStack(null)
                .commit();
    }

    private void encontrarComponentesPorId(){
        drawerLayout = findViewById(R.id.MainActivity_DrawerLayout);
    }

    @Override
    public void recibirPelicula(Pelicula pelicula) {

    }
}
