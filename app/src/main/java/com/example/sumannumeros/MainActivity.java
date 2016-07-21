package com.example.sumannumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.btnSuma)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumatoria();
            }
        });
    }

    public void sumatoria() {
        String valor1=((EditText)findViewById(R.id.edtNnumero)).getText().toString();
        int nro1=Integer.parseInt(valor1);
        int suma=nro1 * (nro1 + 1)/2;
        //String resu=String.value0f(suma);
        String resul="";
        resul="La suma de los " + nro1 + "primeros numeros enteros es: " + suma;
        ((TextView)findViewById(R.id.txtResultado)).setText(resul);
    }
}
