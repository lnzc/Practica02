package com.example.practica02;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza, cafe, hamb;
    Button btnOrden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    private void addListenerOnButtonClick(){
        pizza=(CheckBox)findViewById(R.id.checkBox1);
        cafe=(CheckBox)findViewById(R.id.checkBox2);
        hamb=(CheckBox)findViewById(R.id.checkBox3);
        btnOrden=(Button) findViewById(R.id.button1);

        btnOrden.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;
                StringBuilder result= new StringBuilder();
                result.append("Productos seleccionados");
                if(pizza.isChecked()){
                    result.append("\nPizza $50");
                    total+=50;
                }
                if(cafe.isChecked()){
                    result.append("\nPizza $25");
                    total+=25;
                }
                if(hamb.isChecked()){
                    result.append("\nPizza $45");
                    total+=45;
                }
                result.append("\nTotal: $"+total+" pesos");
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
