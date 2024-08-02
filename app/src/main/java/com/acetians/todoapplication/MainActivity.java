package com.acetians.todoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    Button navigateButton;
    public  String[] todos = {"Work A","Work B","Work C","Work D"};
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = new ListView(this);

        // Create an ArrayAdapter using the array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // Layout for each item
                todos // Data to display
        );

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
        LinearLayout layout = findViewById(R.id.list_layout);
        // Add ListView to the parent layout
        layout.addView(listView);
       navigateButton=findViewById(R.id.btn_add_todo);
       navigateButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i = new Intent(MainActivity.this, AddTodo.class);
        startActivity(i);
    }

    public void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}