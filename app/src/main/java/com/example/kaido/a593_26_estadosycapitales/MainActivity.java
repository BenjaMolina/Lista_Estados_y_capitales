package com.example.kaido.a593_26_estadosycapitales;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txvEstado, txvCapital;
    private Button btnSiguiente, btnAnterior, btnSalir;
    int indice = 0;
    String [] edo;
    String [] capi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvEstado = (TextView)findViewById(R.id.txvEstado);
        txvCapital = (TextView)findViewById(R.id.txvCapital);
        btnAnterior = (Button) findViewById(R.id.btnAnterior);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);

        //Cargamos el array de estado y capitales
        Resources res = this.getResources();
        edo = getResources().getStringArray(R.array.estados);
        capi = getResources().getStringArray(R.array.capitales);
        txvEstado.setText(edo[indice]);
        txvCapital.setText(capi[indice]);

        btnSiguiente.setOnClickListener(new listenrSiguiente());
        btnAnterior.setOnClickListener(new listenerAnterior());
        btnSalir.setOnClickListener(new listenerSalir());


       /* btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(indice < edo.length-1){
                    indice++;
                    txvEstado.setText(edo[indice]);
                    txvCapital.setText(capi[indice]);
                }
                else
                    Toast.makeText(getApplicationContext(),"Lista Finalizada",Toast.LENGTH_SHORT).show();
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(indice > 0){
                    indice--;
                    txvEstado.setText(edo[indice]);
                    txvCapital.setText(capi[indice]);

                }
                else
                    Toast.makeText(getApplicationContext(),"Inicio de la Lista" ,Toast.LENGTH_SHORT).show();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });*/

    }

    class listenrSiguiente implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if(indice < edo.length-1){
                indice++;
                txvEstado.setText(edo[indice]);
                txvCapital.setText(capi[indice]);
            }
            else
                Toast.makeText(getApplicationContext(),"Lista Finalizada",Toast.LENGTH_SHORT).show();
        }
    }

    class listenerAnterior implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(indice > 0){
                indice--;
                txvEstado.setText(edo[indice]);
                txvCapital.setText(capi[indice]);

            }
            else
                Toast.makeText(getApplicationContext(),"Inicio de la Lista" ,Toast.LENGTH_SHORT).show();
        }
    }

    class listenerSalir implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            finish();
        }
    }

}
