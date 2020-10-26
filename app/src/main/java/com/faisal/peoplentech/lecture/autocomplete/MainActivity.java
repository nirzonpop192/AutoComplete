package com.faisal.peoplentech.lecture.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // resource theke array te nilam
        String [] countries=getResources().getStringArray(R.array.country_name);

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,countries);
        // declaring variable
        AutoCompleteTextView actv=findViewById(R.id.actv);
        actv.setAdapter(arrayAdapter);

    }
}
