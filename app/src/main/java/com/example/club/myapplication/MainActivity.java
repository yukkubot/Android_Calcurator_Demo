package com.example.club.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private double num = 0d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        Button button = (Button)findViewById(view.getId());
        TextView text = (TextView)findViewById(R.id.textView_Signs);

        System.out.println(button.getText() + "[" + button.getId() + "][" + view.getId() + "]");
        System.out.println(text.getText());

        if (button.getText().toString().equals("+")) {
            Toast.makeText(MainActivity.this, "+がクリックされました！", Toast.LENGTH_SHORT).show();
        }
        else if (button.getText().toString().equals("=")) {
            Toast.makeText(MainActivity.this, "=がクリックされました！", Toast.LENGTH_SHORT).show();
        }
        else {
            BigDecimal big1 = BigDecimal.valueOf(num*10);
            BigDecimal big2 = new BigDecimal(button.getText().toString());

            num = big1.add(big2).doubleValue();

            text.setText(Double.toString(num));
        }

    }
}
