package com.example.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    TextView action, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        action = findViewById(R.id.action);
        result = findViewById(R.id.result);
    }
    public void clickActionPlus(final View view) {
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        float a = Float.parseFloat(input1.getText().toString());
        float b = Float.parseFloat(input2.getText().toString());

        String res = "= " + String.format("%.2f", a + b);
        action.setText("+");
        result.setText(res);
    }
    public void clickActionMinus(final View view) {
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        float a = Float.parseFloat(input1.getText().toString());
        float b = Float.parseFloat(input2.getText().toString());

        String res = "= " + String.format("%.2f", a - b);
        action.setText("-");
        result.setText(res);
    }
    public void clickActionDiv(final View view) {
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        float a = Float.parseFloat(input1.getText().toString());
        float b = Float.parseFloat(input2.getText().toString());

        if (b == 0) {
            Toast.makeText(MainActivity.this, "Делить на 0 нельзя", Toast.LENGTH_LONG).show();
            action.setText("/");
            result.setText("= ");
            return;
        }

        String res = "= " + String.format("%.2f", a / b);
        action.setText("/");
        result.setText(res);
    }

    public void clickActionMul(final View view) {
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        float a = Float.parseFloat(input1.getText().toString());
        float b = Float.parseFloat(input2.getText().toString());

        String res = "= " + String.format("%.2f", a * b);
        action.setText("*");
        result.setText(res);
    }

    public void clickActionClear(final View view) {
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        input1.setText("");
        input2.setText("");
        action.setText(" ");
        result.setText("= ");
    }
}