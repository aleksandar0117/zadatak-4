package com.example.zad4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextOne;
    private EditText editTextTwo;
    private EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextOne = findViewById(R.id.editTextOne);
        editTextTwo = findViewById(R.id.editTextTwo);
        editTextResult = findViewById(R.id.editTextResult);
    }

    public void addNumbers(View view) {
        double numOne = Double.parseDouble(editTextOne.getText().toString());
        double numTwo = Double.parseDouble(editTextTwo.getText().toString());

        editTextResult.setText(String.valueOf(numOne + numTwo));
    }
}