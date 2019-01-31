package com.example.c7_ong.restdemo;

import android.os.AsyncTask;

public class ConnectionClass extends AsyncTask<String, Void, String>
{
private static final String baseURL= "http://api.openrates.io/";

    @Override
    protected String doInBackground(String... strings) {

        return null;
    }

    @Override
    protected void onPostExecute(String result){

        super.onPostExecute(result);
    }
}