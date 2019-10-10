package com.justinpatino.notescribe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

public class CreateNewProjectActivity extends AppCompatActivity {
    public static int timeSignatureNumerator = 4;
    public static int timeSignatureDenominator = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_project);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int dmWidth = dm.widthPixels;
        int dmHeight = dm.heightPixels;

        getWindow().setLayout((int) (0.8 * dmWidth),(int) (0.8 * dmHeight));

        String[] timeSigArray = new String[16];
        for(int i = 0; i < 16; i++) {
            timeSigArray[i] = Integer.toString(i + 1);
        }

        NumberPicker timeSigNpNumerator = (NumberPicker) findViewById(R.id.timeSignatureNumerator);
        timeSigNpNumerator.setMaxValue(timeSigArray.length - 1);
        timeSigNpNumerator.setDisplayedValues(timeSigArray);
        timeSigNpNumerator.setValue(timeSignatureNumerator - 1);

        NumberPicker timeSigNpDenominator = (NumberPicker) findViewById(R.id.timeSignatureDenominator);
        timeSigNpDenominator.setMaxValue(timeSigArray.length - 1);
        timeSigNpDenominator.setDisplayedValues(timeSigArray);
        timeSigNpDenominator.setValue(timeSignatureDenominator - 1);

        timeSigNpNumerator.setOnValueChangedListener(onNumeratorValueChangeListener);
        timeSigNpDenominator.setOnValueChangedListener(onDenominatorValueChangeListener);

    }

    NumberPicker.OnValueChangeListener onNumeratorValueChangeListener = new NumberPicker.OnValueChangeListener() {
        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int i1) {
            timeSignatureNumerator = numberPicker.getValue();
        }
    };

    NumberPicker.OnValueChangeListener onDenominatorValueChangeListener = new NumberPicker.OnValueChangeListener() {
        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int i1) {
            timeSignatureDenominator = numberPicker.getValue();
        }
    };

    public void initializeProject(View view) {
      /*  Intent intent = new Intent(this, EditProjectActivity.class);*/
        EditText projectName = (EditText) findViewById(R.id.projectNameEditText);
        String message = projectName.getText().toString();
        /*intent.putExtra();*/
    }


}
