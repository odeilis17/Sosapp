package ado.edu.itla.sosapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;

import ado.edu.itla.sosapp.entidad.Usuario;

public class MainActivity extends Activity {
  private static final String TAG = "SOSAPP.MAINACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        Log.d (TAG, "Entrando a Main Activity");
        Log.d (TAG, "Esto es un error");

//        Button btnBotton = (Button) findViewById(R.id.button);
//        btnBotton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Usuario usuario = new Usuario();
//                try{
//                    usuario.setEdad(-12);
//                } catch (Exception e){
//                Toast.makeText(MainActivity.this, "edad no permitida", Toast.LENGTH_LONG);
//                    e.printStackTrace();
//                }
//
//                }
//                }
        Usuario usuario = new Usuario();
        usuario.setEmail ("JuandelosPalotes@gamil.com");
        usuario.setNombre ("Juan de los Palotes");
        usuario.setUsername ("juanpalote");

        Usuario usuario1 = new Usuario();
        usuario.setEmail ("odeilis1717@gamil.com");
        usuario.setNombre ("Odeilis Gutierrez");
        usuario.setUsername ("Odeilis17");

        Usuario usuario2 = new Usuario();
        usuario.setEmail ("jonas1717@gamil.com");
        usuario.setNombre ("Jonas Gutierrez");
        usuario.setUsername ("Jonas17");

        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(usuario);
        usuarioList.add(usuario1);

        Log.i(TAG,"Tamano de lista:" + usuarioList.size());
for (Usuario u: usuarioList) {
Log.i(TAG, "Nombre:" + u.getNombre());
    }
}}
