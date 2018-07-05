package com.andromet.minicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValueA;
    private EditText editTextValueB;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValueA = findViewById(R.id.editText_valueA);
        editTextValueB = findViewById(R.id.editText_valueB);
        textViewResult = findViewById(R.id.textView_result);
    }

    public void calculate(View view) {

        String strValueA = editTextValueA.getText().toString();
        String strValueB = editTextValueB.getText().toString();

        if (TextUtils.isEmpty(strValueA) && TextUtils.isEmpty(strValueB)) {
            Toast.makeText(this, "Enter both value", Toast.LENGTH_SHORT).show();
        }
        else {
            int valueA = Integer.parseInt(strValueA);
            int valueB = Integer.parseInt(strValueB);
            int result = 0;
            switch (view.getId()) {
                case R.id.button_add:
                    result = valueA + valueB;
                    break;
                case R.id.button_sub:
                    result = valueA - valueB;
                    break;
                case R.id.button_mul:
                    result = valueA * valueB;
                    break;
                case R.id.button_div:
                    result = valueA / valueB;
                    break;
            }

            textViewResult.setText(String.valueOf(result));
        }
    }
}
