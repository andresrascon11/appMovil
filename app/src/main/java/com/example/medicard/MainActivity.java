package com.example.medicard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private EditText editUsuario, editContraseña;
    private Button btnEntrar;

    private void ingresar(){

        editUsuario = (EditText)findViewById(R.id.editUsuario);
        editContraseña = (EditText)findViewById(R.id.editContraseña);

        btnEntrar = (Button)findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrar();
            }
        });
    }

    private void entrar(){
        String usr = editUsuario.getText().toString();
        String psw = editContraseña.getText().toString();

        if(usr.equals("Alejandra") && psw.equals("Alex20"))
        {
            Intent intent = new Intent(getApplicationContext(), MenuPrincipal.class);
            startActivity(intent);
            clean();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            clean();
        }
    }

    
    public void  clean(){

        editUsuario.setText("");
        editContraseña.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar();
    }
}