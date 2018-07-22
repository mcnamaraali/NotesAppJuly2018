package com.example.ali.notesapp.NotesApp.Add.Presenter;

import android.content.Context;

import com.example.ali.notesapp.NotesApp.Add.View.IAddActivity;

public class AddPresenter  {

    IAddActivity addview;
    Context context;

    public AddPresenter(IAddActivity view, Context context){
        this.addview = view;
        this.context = context;
    }

    public void handleError(){
        addview.isError();
    }

}
