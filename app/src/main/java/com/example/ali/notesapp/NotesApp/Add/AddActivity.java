package com.example.ali.notesapp.NotesApp.Add;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ali.notesapp.NotesApp.Add.Presenter.AddPresenter;
import com.example.ali.notesapp.NotesApp.Add.View.IAddActivity;
import com.example.ali.notesapp.R;

public class AddActivity extends Activity implements IAddActivity {

    private AddPresenter addpresenter;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        //addpresenter = new AddPresenter(AddActivity.this, AddActivity.this);
    }

    public void isError(){
        saveButton = findViewById(R.id.button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddActivity.this, "Error!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Input(){
        addpresenter.handleError();
    }
}
