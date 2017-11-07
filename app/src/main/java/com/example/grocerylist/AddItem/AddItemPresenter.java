package com.example.grocerylist.AddItem;

import com.example.grocerylist.GroceryModel;

/**
 * Created by Ben on 10/30/2017.
 */

public class AddItemPresenter implements AddItemInterface.Presenter{

    private GroceryModel groceryModel;

    public AddItempresenter() {
        groceryModel = GroceryModel.getInstance();
    }

    @Override
    public void addItem(String item) {
        groceryModel.add(item);
    }
}
