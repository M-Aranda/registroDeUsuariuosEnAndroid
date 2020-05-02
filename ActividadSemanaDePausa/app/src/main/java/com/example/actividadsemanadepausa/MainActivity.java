package com.example.actividadsemanadepausa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btn_registrar, btn_mostrar, btn_listar_todos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_registrar = findViewById(R.id.btn_registrar);
        btn_mostrar = findViewById(R.id.btn_mostrar);
        btn_listar_todos = findViewById(R.id.btn_listar_todos);
        initializeMainActivityButtons();


    }

    private void initializeMainActivityButtons() {

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RegistrarUsuarioActivity.class);
                startActivity(i);
                finish();

            }
        });


        btn_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MostrarUsuarioActivity.class);
                startActivity(i);
                finish();

            }
        });



        btn_listar_todos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ListarUsuariosActivity.class);
                startActivity(i);
                finish();

            }
        });









    }

}
