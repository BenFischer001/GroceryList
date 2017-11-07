package com.example.grocerylist;


import java.util.ArrayList;

/**
 * Created by Ben on 10/23/2017.
 */

public class GroceryModel {

    private ArrayList<String> db = new ArrayList<String>();
    private static GroceryModel instance;

    private GroceryModel(){

    }

    public static synchronized GroceryModel getInstance() {
        if (instance == null) {
            instance = new GroceryModel();
        }
        return instance;

    }


    public void add(String item) {
        db.add(item);
    }

    public ArrayList<String> getAll() {
        return db;
    }

}