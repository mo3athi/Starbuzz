package com.mo3athi.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
                this, android.R.layout.simple_list_item_1,
                Drink.drinks
        );
        ListView listDrinks = getListView();
        listDrinks.setAdapter(listAdapter);


    }

    @Override
    public void onListItemClick(ListView listView , View itemView ,
                                int position , long id){
        Intent intent = new Intent(DrinkCategoryActivity.this , DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO ,(int)id);
        startActivity(intent);


    }
}


