package com.example.projetogrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
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

                    txtView2.setText(null);
                    txtView21.setText(null);
                    txtView22.setText(null);
                    txtView23.setText(null);
                    txtView3.setText(null);
                }
            });
        CentroButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        txtView2.setText(R.string.organCentroBully);
                        txtView21.setText(R.string.apavCoim);
                        txtView22.setText(R.string.apavSant);
                        txtView23.setText(R.string.apavLis);

                        txtView1.setText(null);
                        txtView11.setText(null);
                        txtView3.setText(null);
                    }
                });
        SulButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        txtView3.setText(R.string.organSul);

                        txtView2.setText(null);
                        txtView21.setText(null);
                        txtView22.setText(null);
                        txtView23.setText(null);
                        txtView1.setText(null);
                        txtView11.setText(null);
                    }
                });

    }
    public void infoOnClick(View v){
        Intent oIntent = new Intent(this, infoLocal.class);
        startActivity(oIntent);
    }

    public void AABCJonClick(View v) {
        Uri uri = Uri.parse("https://m.facebook.com/AABcCJ/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void GAFonClick(View v) {
        Uri uri = Uri.parse("https://www.gaf.pt/pt/recursos/violencia/bullying");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void NBonClick(View v) {
        Uri uri = Uri.parse("https://www.nobully.pt/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void APAVonClick(View v) {
        Uri uri = Uri.parse("https://apav.pt/apav_v3/index.php/pt/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void ASVonClick(View v) {
        Uri uri = Uri.parse("https://www.sementesdevida.pt/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}