package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputField;
    private TextView resultField;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = findViewById(R.id.input_field);
        resultField = findViewById(R.id.result_field);
        calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = inputField.getText().toString();
                double input = Double.parseDouble(inputText);
                double suma2 = input;
                double suma3 = 0;
                while (suma3 < input ) {
                    double normativnoPriznati= suma2 * 40 / 100;
                    double osigurovki = (suma2 - normativnoPriznati ) * 27.8 / 100;
                    if (osigurovki > 3400) {
                        osigurovki = 3400;
                    }
                    double danuk = ((suma2 - normativnoPriznati) - osigurovki) * 10 / 100;
                    suma3 = suma2 - osigurovki - danuk;
                    suma2++;
                }
                double result = suma2;
                resultField.setText(Double.toString(result));
            }
        });
    }
}