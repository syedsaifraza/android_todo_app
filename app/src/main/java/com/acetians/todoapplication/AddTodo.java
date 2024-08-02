package com.acetians.todoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddTodo extends AppCompatActivity implements View.OnClickListener{
    Button viewTodosBtn;
    Button saveTodo;
    EditText inputTitle;
    EditText inputDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_page);

        viewTodosBtn = findViewById(R.id.view_todo_btn);

        viewTodosBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.view_todo_btn){
            Intent i = new Intent(AddTodo.this,MainActivity.class);
            startActivity(i);
        }
    }
    public void showToast(String message){
     Toast.makeText(this,message,Toast.LENGTH_LONG ).show();
    }
}
