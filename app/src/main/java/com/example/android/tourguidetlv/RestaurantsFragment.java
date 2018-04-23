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
        restaurantItems.add(new Item(R.drawable.abu_hasan_hummus,getString(R.string.restaurant_hummus_asli),
                getString(R.string.restaurant_hummus_asli_description),
                getString(R.string.restaurant_hummus_asli_location),
                getString(R.string.restaurant_hummus_asli_geo),
                getString(R.string.restaurant_hummus_asli_time)));
        restaurantItems.add(new Item(R.drawable.falafel_shuk_hacarmel,getString(R.string.restaurant_falafel_carmel),
                getString(R.string.restaurant_falafel_carmel_description),
                getString(R.string.restaurant_falafel_carmel_location),
                getString(R.string.restaurant_falafel_carmel_geo),
                getString(R.string.restaurant_falafel_carmel_time)));
        restaurantItems.add(new Item(R.drawable.fifty_pub, getString(R.string.restaurant_fifty_bar),
                getString(R.string.restaurant_fifty_bar_description),
                getString(R.string.restaurant_fifty_bar_location),
                getString(R.string.restaurant_fifty_bar_geo),
                getString(R.string.restaurant_fifty_bar_time)));
        restaurantItems.add(new Item(R.drawable.old_man_and_sea_restaurant, getString(R.string.restaurant_fish_jaffa_port),
                getString(R.string.restaurant_fish_jaffa_port_description),
                getString(R.string.restaurant_fish_jaffa_port_location),
                getString(R.string.restaurant_fish_jaffa_port_geo),
                getString(R.string.restaurant_fish_jaffa_port_time),
                getString(R.string.restaurant_fish_jaffa_port_phone)));
        restaurantItems.add(new Item(R.drawable.suzana_restaurant, getString(R.string.restaurant_suzana),
                getString(R.string.restaurant_suzana_description),
                getString(R.string.restaurant_suzana_location),
                getString(R.string.restaurant_suzana_geo),
                getString(R.string.restaurant_suzana_time),
                getString(R.string.restaurant_suzana_phone)));
        restaurantItems.add(new Item(R.drawable.rothschild_kiosk, getString(R.string.restaurant_rothschild_kiosk),
                getString(R.string.restaurant_rothschild_kiosk_description),
                getString(R.string.restaurant_rothschild_kiosk_location),
                getString(R.string.restaurant_rothschild_kiosk_geo),
                getString(R.string.restaurant_rothschild_kiosk_time),
                getString(R.string.restaurant_rothschild_kiosk_phone)));
        restaurantItems.add(new Item(R.drawable.robina_pub, getString(R.string.restaurant_robina),
                getString(R.string.restaurant_robina_description),
                getString(R.string.restaurant_robina_location),
                getString(R.string.restaurant_robina_geo),
                getString(R.string.restaurant_robina_time),
                getString(R.string.restaurant_robina_phone)));


        ItemAdapter adapter = new ItemAdapter(getActivity(), restaurantItems, R.color.colorRestaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
