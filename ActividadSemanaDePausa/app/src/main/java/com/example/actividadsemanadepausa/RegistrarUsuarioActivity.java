package com.example.actividadsemanadepausa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import com.example.actividadsemanadepausa.bd.Bd_static;
import com.example.actividadsemanadepausa.modelo.Usuario;

public class RegistrarUsuarioActivity extends AppCompatActivity {

    private Button btn_registrar_usuario_enRegistrar, btn_volver_desde_registrar;
    private Spinner cbo_deporte;
    private TextView lbl_numero_usuarios;
    private EditText txt_nombre, txt_apellido, txt_rut, txt_edad;
    private Switch sw_esHombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);


        btn_registrar_usuario_enRegistrar = findViewById(R.id.btn_registrar_usuario_enRegistrar);
        btn_volver_desde_registrar = findViewById(R.id.btn_volver_desde_registrar);

        cbo_deporte = findViewById(R.id.cbo_deporte);

        lbl_numero_usuarios = findViewById(R.id.lbl_numero_usuarios);

        txt_nombre = findViewById(R.id.txt_nombre);
        txt_apellido = findViewById(R.id.txt_apellido);
        txt_rut = findViewById(R.id.txt_rut);
        txt_edad = findViewById(R.id.txt_edad);

        sw_esHombre = findViewById(R.id.sw_esHombre);

        lbl_numero_usuarios = findViewById(R.id.lbl_numero_usuarios);
        lbl_numero_usuarios.setText(String.valueOf(Bd_static.listadoDeUsuarios.size()));



        initializeComponentsInRegistrarUsuarioActivity();

    }

    private void initializeComponentsInRegistrarUsuarioActivity(){

        btn_volver_desde_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });


        btn_registrar_usuario_enRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre, apellido, rut, deporteFavorito;
                int edad;
                boolean esHombre;

                nombre = txt_nombre.getText().toString();
                apellido = txt_apellido.getText().toString();
                rut = txt_rut.getText().toString();
                deporteFavorito = cbo_deporte.getSelectedItem().toString();
                edad = Integer.valueOf(txt_edad.getText().toString());

                if (sw_esHombre.isChecked()){
                    esHombre = true;
                }else{
                    esHombre = false;
                }

                Usuario u = new Usuario(nombre, apellido, rut, deporteFavorito, esHombre, edad);

                Bd_static.listadoDeUsuarios.add(u);

                lbl_numero_usuarios.setText(String.valueOf(Bd_static.listadoDeUsuarios.size()));



            }
        });


    }

}
