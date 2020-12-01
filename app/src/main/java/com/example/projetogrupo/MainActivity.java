package com.example.projetogrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button NorteButton, CentroButton, SulButton;
    TextView txtView1, txtView11, txtView2, txtView21, txtView22, txtView23, txtView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NorteButton = (Button)findViewById(R.id.textViewNorte);
        CentroButton = (Button)findViewById(R.id.textViewCentro);
        SulButton = (Button)findViewById(R.id.textViewSul);

        txtView1 = (TextView)findViewById(R.id.txtView1);
        txtView11 = (TextView)findViewById(R.id.txtView11);
        txtView2 = (TextView)findViewById(R.id.txtview2);
        txtView21 = (TextView)findViewById(R.id.txtview21);
        txtView22 =  (TextView)findViewById(R.id.textViewSant);
        txtView23 =  (TextView)findViewById(R.id.textViewLis);
        txtView3 = (TextView)findViewById(R.id.txtview3);

        NorteButton.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View view) {
                    txtView1.setText(R.string.organNorteAABCJ);
                    txtView11.setText(R.string.organNorteGAF);
                }
            });
        CentroButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        txtView2.setText(R.string.organCentroBully);
                        txtView21.setText(R.string.apavCoim);
                        txtView22.setText(R.string.apavSant);
                        txtView23.setText(R.string.apavLis);
                    }
                });
        SulButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        txtView3.setText(R.string.organSul);
                    }
                });

    }
    public void infoOnClick(View v){
        Intent oIntent = new Intent(this, infoLocal.class);
        startActivity(oIntent);
    }
}