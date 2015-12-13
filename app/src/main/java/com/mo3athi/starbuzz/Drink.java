package com.mo3athi.starbuzz;

/**
 * Created by mo3ath on 12/8/2015.
 */
public class Drink {
    private String name ;
    private String describtion ;
    private int imageResourceId ;

    private Drink(String name , String description ,int imageResourceId ){
        this.name = name ;
        this.describtion = description ;
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Latte" , "A couple of espresso shots with steamed milk"
                    , R.drawable.latte),
            new Drink("Cappuccino" , "Espresso , hot milk and steamed milk foam"
                    ,R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh "
                    , R.drawable.filter)
    };

    public String getName(){
           return  name ;
    }

    public String getDescription(){
           return  describtion ;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
