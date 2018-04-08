package com.example.qno.bmicalc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void calc(View view) {
        Button button1 = (Button) findViewById(R.id.button2);
        EditText ed1 = (EditText) findViewById(R.id.edi1);
        EditText ed2 = (EditText) findViewById(R.id.edi2);
        TextView t1 = (TextView) findViewById(R.id.text1);
        TextView t2 = (TextView) findViewById(R.id.text2);
        double h = 0, w = 0, b = 0;
        String msg = "";
        w = Double.parseDouble(ed1.getText().toString());
        h = Double.parseDouble(ed2.getText().toString());
        b = h * h;
        b = w / b;
        t1.setText(String.valueOf(b));
        if (b < 18.5) {
            msg = "Underweight";
        } else if (b > 18.5 && b < 25) {
            msg = "Normal";
        } else {
            msg = "OverWeight";
        }

        t2.setText(msg);

    }
}
