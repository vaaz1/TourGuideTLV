package com.example.android.tourguidetlv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> shoppingItems = new ArrayList<Item>();
        shoppingItems.add(new Item(R.drawable.azrieli_towers,"Azrieli Shopping Mall",
                "Fashion shopping mall",
                "Derech Menachem Begin 132","32.074500, 34.792100","Sun-Thu 9:30-22:00, Fri 9:30-15:00, Sat 20:00-23:00", "036081199"));
        shoppingItems.add(new Item(R.drawable.shopping_tlv,"TLV Mall",
                "Tel Aviv's newest fashion mall",
                "Carlebach St 4","32.067913, 34.783529","Sun-Thu 10:00-22:00, Fri 9:00-16:00, Sat 19:30-23:00", "0723272470"));
        shoppingItems.add(new Item(R.drawable.dizengoff_center,"Dizengoff Center",
                "Indoor Mall for fashion, technology, food, wellness and entertainment",
                "Dizengoff St 50","32.075206, 34.774736","Sun-Thu 9:00-22:00, Fri 9:00-15:00, Sat closed", "036212400"));
        shoppingItems.add(new Item(R.drawable.sarona_market,"Sarona Market",
                "Indoor culinary complex",
                "Aluf Kalman Magen St 3","32.071289, 34.786835","Sat-Thu 9:00-23:00, Fri 8:00-18:00", "036242424"));
        shoppingItems.add(new Item(R.drawable.shuk_hacarmel,"Carmel Market",
                "Open-air market offering clothing, toys, food, groceries",
                "HaCarmel St","32.068384, 34.768382","Sun-Thu 8:00-18:00, Fri 8:00-16:00, Sat closed"));
        shoppingItems.add(new Item("Nahalat Binyamin Market",
                "Unique locally made items and crafts",
                "Nahalat Binyamin St","32.068203, 34.770222","Tue+Fri 10:00-17:00"));
        shoppingItems.add(new Item("Levinsky Market",
                "Spices, herbs and dried fruits",
                "Levinsky","32.059623, 34.772708",""));
        shoppingItems.add(new Item("Jaffa Flea Market",
                "Bazaar-style market offering antiques, jewlery, clothing and second hand items",
                "Olei Zion St","32.052813, 34.756893","Sun-Thu 9:00-17:00, Fri 9:00-14:00, Sat closed"));



        ItemAdapter adapter = new ItemAdapter(getActivity(), shoppingItems, R.color.colorShopping);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
