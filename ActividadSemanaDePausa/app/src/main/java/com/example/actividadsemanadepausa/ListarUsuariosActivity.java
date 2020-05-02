package com.example.actividadsemanadepausa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.actividadsemanadepausa.bd.Bd_static;
import com.example.actividadsemanadepausa.modelo.Usuario;

public class ListarUsuariosActivity extends AppCompatActivity {

    private Button btn_volver_desde_listar_usuarios;
    private ListView lv_lista_de_usuarios;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_usuarios);

        btn_volver_desde_listar_usuarios = findViewById(R.id.btn_volver_desde_listar_usuarios);
        lv_lista_de_usuarios = findViewById(R.id.lv_lista_de_usuarios);

        initializeComponents();


    }

    private void initializeComponents() {

        btn_volver_desde_listar_usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        ArrayAdapter adaptadorDeUsuarios = new ArrayAdapter<Usuario>(ListarUsuariosActivity.this, android.R.layout.simple_list_item_1, Bd_static.listadoDeUsuarios);
        lv_lista_de_usuarios.setAdapter(adaptadorDeUsuarios);

    }
}
