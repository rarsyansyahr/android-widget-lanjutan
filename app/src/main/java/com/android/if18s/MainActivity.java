package com.android.if18s;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView txtAuto;
    Spinner spinProdi;
    Button btnWeb;
    Button btnLanguage;

    public static final String[] REGIONS = {
            "Indonesia", "India", "Irlandia", "Vietnam", "Thailand", "Myanmar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAuto = (AutoCompleteTextView) findViewById(R.id.txtAuto);
        spinProdi = (Spinner) findViewById(R.id.spinProdi);
        btnWeb = (Button) findViewById(R.id.btnWeb);
        btnLanguage = (Button) findViewById(R.id.btnLanguage);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), WebActivity.class);
                startActivity(intent);
            }
        });

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LanguageActivity.class);
                startActivity(intent);
            }
        });


        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, R.layout.support_simple_spinner_dropdown_item, REGIONS);
        txtAuto.setThreshold(1);
        txtAuto.setAdapter(adapter);


        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.prodi, R.layout.support_simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        this.spinProdi.setAdapter(adapter2);


    }
}
