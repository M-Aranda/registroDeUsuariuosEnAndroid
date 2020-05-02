package com.example.actividadsemanadepausa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.actividadsemanadepausa.bd.Bd_static;

public class MostrarUsuarioActivity extends AppCompatActivity {

    private TextView lbl_campo_nombre, lbl_campo_apellido, lbl_campo_rut, lbl_campo_edad, lbl_campo_sexo, lbl_campo_deporte, lbl_primer_usuario, lbl_usuario_actual, lbl_total_usuarios, lbl_usuario_mostrar;
    private Button btn_anterior, btn_siguiente, btn_volver_desde_mostrar;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_usuario);

        contador = 0;

        lbl_usuario_mostrar = findViewById(R.id.lbl_usuario_mostrar);

        lbl_campo_nombre = findViewById(R.id.lbl_campo_nombre);
        lbl_campo_apellido = findViewById(R.id.lbl_campo_apellido);
        lbl_campo_rut = findViewById(R.id.lbl_campo_rut);
        lbl_campo_edad = findViewById(R.id.lbl_campo_edad);
        lbl_campo_sexo = findViewById(R.id.lbl_campo_sexo);
        lbl_campo_deporte = findViewById(R.id.lbl_campo_deporte);
        lbl_primer_usuario = findViewById(R.id.lbl_primer_usuario);
        lbl_usuario_actual = findViewById(R.id.lbl_usuario_actual);
        lbl_total_usuarios = findViewById(R.id.lbl_total_usuarios);
        btn_anterior = findViewById(R.id.btn_anterior);
        btn_siguiente = findViewById(R.id.btn_siguiente);
        btn_volver_desde_mostrar = findViewById(R.id.btn_volver_desde_mostrar);


        if (Bd_static.listadoDeUsuarios.size() > 0) {
            lbl_primer_usuario.setText("1");
            lbl_usuario_actual.setText("1");

            lbl_campo_nombre.setText(Bd_static.listadoDeUsuarios.get(0).getNombre());
            lbl_campo_apellido.setText(Bd_static.listadoDeUsuarios.get(0).getApellido());
            lbl_campo_rut.setText(Bd_static.listadoDeUsuarios.get(0).getRut());
            lbl_campo_edad.setText(String.valueOf(Bd_static.listadoDeUsuarios.get(0).getEdad()));
            lbl_campo_deporte.setText(Bd_static.listadoDeUsuarios.get(0).getDeporteFavorito());

            if (Bd_static.listadoDeUsuarios.get(0).isEsHombre() == true) {
                lbl_campo_sexo.setText("Hombre");
            } else if (Bd_static.listadoDeUsuarios.get(0).isEsHombre() == false) {
                lbl_campo_sexo.setText("Mujer");
            }

            lbl_total_usuarios.setText(String.valueOf(Bd_static.listadoDeUsuarios.size()));

        } else if (Bd_static.listadoDeUsuarios.size() == 0) {
            lbl_usuario_mostrar.setText("No hay usuarios registrados");

        }





        initializeComponentents();
    }

    private void initializeComponentents() {

        btn_volver_desde_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    cambiarUsuario(1);

            }
        });

        btn_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    cambiarUsuario(-1);
            }
        });
    }



    private void cambiarUsuario(int alterador) {

        contador = contador + alterador;

        if ((contador >= 0) && (contador - 1 <= Bd_static.listadoDeUsuarios.size())) {

            lbl_campo_nombre.setText(Bd_static.listadoDeUsuarios.get(contador).getNombre());
            lbl_campo_apellido.setText(Bd_static.listadoDeUsuarios.get(contador).getApellido());
            lbl_campo_rut.setText(Bd_static.listadoDeUsuarios.get(contador).getRut());
            lbl_campo_edad.setText(String.valueOf(Bd_static.listadoDeUsuarios.get(contador).getEdad()));
            lbl_campo_deporte.setText(Bd_static.listadoDeUsuarios.get(contador).getDeporteFavorito());

            if (Bd_static.listadoDeUsuarios.get(contador).isEsHombre() == true) {
                lbl_campo_sexo.setText("Hombre");
            } else if (Bd_static.listadoDeUsuarios.get(contador).isEsHombre() == false) {
                lbl_campo_sexo.setText("Mujer");
            }
        }


    }



}
