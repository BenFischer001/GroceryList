package com.example.grocerylist.GroceryList;

/**
 * Created by Ben on 10/23/2017.
 */

public interface GroceryListInterface {

    interface View {
        void showGroceryList();
    }

    interface Presenter {
        void updateGroceryList(String item);
        void startAddItemActivity();
    }
}
