package com.justinpatino.notescribe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.Spinner;

public class CreateNewProjectActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_project);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int dmWidth = dm.widthPixels;
        int dmHeight = dm.heightPixels;

        getWindow().setLayout((int) (0.8 * dmWidth),(int) (0.8 * dmHeight));

        String[] numeratorArr = R.array.timeSigArray;


        NumberPicker timeSigNumeratorNp = (NumberPicker) findViewById(R.id.timeSigNumerator);
        timeSigNumeratorNp.setMaxValue(R.array.timeSigArray.length - 1);
        timeSigNumeratorNp.setDisplayedValues(R.array.timeSigArray);

        /*Spinner timeSigNumeratorSpinner = (Spinner) findViewById(R.id.timeSigNumerator);
        Spinner timeSigDenominatorSpinner = (Spinner) findViewById(R.id.timeSigDenominator);
       ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.timeSigArray, R.layout.time_signature_spinner_layout);
        adapter.setDropDownViewResource(R.layout.time_signature_spinner_dropdown_layout);
        timeSigNumeratorSpinner.setAdapter(adapter);
        timeSigNumeratorSpinner.setOnItemSelectedListener(this);
        timeSigDenominatorSpinner.setAdapter(adapter);
        timeSigDenominatorSpinner.setOnItemSelectedListener(this);*/


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
