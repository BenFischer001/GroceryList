package com.example.grocerylist.GroceryList;

import android.content.Context;
import android.content.Intent;

import com.example.grocerylist.AddItem.AddItemActivity;
import com.example.grocerylist.GroceryModel;

import java.util.ArrayList;

/**
 * Created by Ben on 10/23/2017.
 */

public class GroceryListPresenter implements GroceryListInterface.Presenter {


    private GroceryModel db;
    private Context appContext;
    private GroceryListInterface.View view;

    public GroceryListPresenter(GroceryListInterface.View groceryView, Context context){
        groceryModel = GroceryModel.getInstance();
        groceryView = view;
        appContext = context;
    }

    @Override
    public void updateGroceryList(String item) {
        ArrayList<String> groceries = GroceryModel.getAll;
        groceryView.showGroceryList(groceries);

    }

    @Override
    public void startAddItemActivity() {
        Intent intent = new Intent(appContext, AddItemActivity.class);
        appContext.startActivity(intent);
    }
}
