package com.example.scrolldesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name,year,color,price,engine;
    private Button btn_create;
    private ScrollView scrollView;
    ScrollView sc;

    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        year=findViewById(R.id.year);
        color=findViewById(R.id.color);
        price=findViewById(R.id.purchase);
        engine=findViewById(R.id.engine);
        btn_create=findViewById(R.id.btn_create);
        scrollView=findViewById(R.id.Scroll);
        final LinearLayout l1 = findViewById(R.id.linearlayout);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty()
                        && color.getText().toString().isEmpty()
                        && year.getText().toString().isEmpty()
                        && price.getText().toString().isEmpty()
                        && year.getText().toString().isEmpty()
                        && engine.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Cannot create car", Toast.LENGTH_LONG).show();
                } else {
                    i++;
                    String output = "This is Vechile No. : " + i +
                            "\n" +
                            "Type: " + name.getText().toString() + "\n"
                            + "Color: " + color.getText().toString() + "\n"
                            + "Year:" + year.getText().toString() + "\n"
                            + "Engine: " + engine.getText().toString() + "\n";
                    TextView tv1 = new TextView(MainActivity.this);
                    tv1.setText(output);
                    l1.addView(tv1);

                }
            }
        });
    }

}
