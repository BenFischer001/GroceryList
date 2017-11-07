package com.example.grocerylist.AddItem;

/**
 * Created by Ben on 10/30/2017.
 */

public interface AddItemInterface {

    interface View {
    }

    interface Presenter {
        void addItem(String item);
    }
}
