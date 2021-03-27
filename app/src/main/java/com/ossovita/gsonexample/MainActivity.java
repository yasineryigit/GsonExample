package com.ossovita.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
        Address address = new Address("Germany","Berlin");

        Employee employee = new Employee("Margaret",23,"margaret@gmail.com",address);
        String json = gson.toJson(employee);
        Log.d(TAG, "onCreate: " + json);
/*
        String json = "{\"first_name\":\"Mike\",\"age\":30,\"mail\":\"mike@gmail.com\"}";
        Employee employee = gson.fromJson(json,Employee.class);
  */  }
}