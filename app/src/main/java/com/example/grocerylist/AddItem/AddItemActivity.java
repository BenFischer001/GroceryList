package com.example.grocerylist.AddItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.grocerylist.R;

public class AddItemActivity extends AppCompatActivity implements AddItemInterface.View{

    private EditText newItemEditText;
    private AddItemPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        newItemEditText = (EditText) findViewByid(R.id.newItemEditText);
        presenter = new AddItemPresenter();
    }

    public void addItem(View view) {
        String Item = newItemEditText.getText().toString();
        presenter.addItem(item);
        this.finish();
    }
}
