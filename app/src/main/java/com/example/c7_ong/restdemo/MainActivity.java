package com.example.c7_ong.restdemo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.lang.String;
import java.net.URL;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void startTask(View view)
{
EditText editText = (EditText) findViewById(R.id.editText);
String value = editText.toString();
new ConnectionClass(value).execute();
}

}
