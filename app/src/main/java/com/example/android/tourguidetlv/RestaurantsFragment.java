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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> restaurantItems = new ArrayList<Item>();
        restaurantItems.add(new Item(R.drawable.abu_hasan_hummus,"Hummus HaAsli",
                "Original hummus restaurant in Jaffa",
                "Yefet St 73", "32.046163, 34.752614","Sun-Sat  7:00-21:00"));
        restaurantItems.add(new Item(R.drawable.falafel_shuk_hacarmel,"Falafel Kiosk",
                "Gluten free and regluar Falafel",
                "HaCarmel St 16","32.066845, 34.766806",""));
        restaurantItems.add(new Item(R.drawable.fifty_pub, "FIFTY", "cozy, easy going Bar",
                "Dizengoff St 43", "32.074597, 34.775889","Sat-Thu 18:00-3:00, Fri 13:00-3:00"));
        restaurantItems.add(new Item(R.drawable.old_man_and_sea_restaurant, "The Old Man And The Sea",
                "Fish restaurant in Jaffa Port, sitting places outside",
                "Retzif HaAliya HaShniya St 101", "32.052997, 34.750024","Sat-Fri 11:00-0:00", "035448820"));
        restaurantItems.add(new Item(R.drawable.suzana_restaurant, "Suzana",
                "Homemade food, breakfasts, meats, fish, Mediterranean food",
                "Shabazi St 9", "32.061384, 34.763543","Sat-Fri 10:00-0:00", "035177580"));
        restaurantItems.add(new Item(R.drawable.rothschild_kiosk, "Rothschild Coffee Kiosk",
                "Coffee and breakfast in picknick like atmosphere",
                "Rothschild Blvd 82", "32.065880, 34.777279","Sat-Thu 7:00-0:00, Fri 7:00-18:00", "035600036"));
        restaurantItems.add(new Item(R.drawable.robina_pub, "Robina",
                "Pub, drinks and food till late night",
                "Marmorek St 6", "32.071694, 34.779640",
                "Mon-Thu 16:00-3:00, Fri 13:00-3:00, Sat 15:00-3:00, Sun 17:30-3:00", "0525050540"));


        ItemAdapter adapter = new ItemAdapter(getActivity(), restaurantItems, R.color.colorRestaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
