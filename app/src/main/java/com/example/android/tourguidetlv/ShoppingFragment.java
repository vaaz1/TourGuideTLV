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
        shoppingItems.add(new Item(R.drawable.azrieli_towers, getString(R.string.shopping_azrieli),
                getString(R.string.shopping_azrieli_description),
                getString(R.string.shopping_azrieli_location),
                getString(R.string.shopping_azrieli_geo),
                getString(R.string.shopping_azrieli_time),
                getString(R.string.shopping_azrieli_phone)));
        shoppingItems.add(new Item(R.drawable.shopping_tlv,getString(R.string.shopping_tlv),
                getString(R.string.shopping_tlv_description),
                getString(R.string.shopping_tlv_location),
                getString(R.string.shopping_tlv_geo),
                getString(R.string.shopping_tlv_time),
                getString(R.string.shopping_tlv_phone)));
        shoppingItems.add(new Item(R.drawable.dizengoff_center, getString(R.string.shopping_dizengoff),
                getString(R.string.shopping_dizengoff_description),
                getString(R.string.shopping_dizengoff_location),
                getString(R.string.shopping_dizengoff_geo),
                getString(R.string.shopping_dizengoff_time),
                getString(R.string.shopping_dizengoff_phone)));
        shoppingItems.add(new Item(R.drawable.sarona_market,getString(R.string.shopping_sarona_market),
                getString(R.string.shopping_sarona_market_description),
                getString(R.string.shopping_sarona_market_location),
                getString(R.string.shopping_sarona_market_geo),
                getString(R.string.shopping_sarona_market_time),
                getString(R.string.shopping_sarona_market_phone)));
        shoppingItems.add(new Item(R.drawable.shuk_hacarmel,getString(R.string.shopping_carmel),
                getString(R.string.shopping_carmel_description),
                getString(R.string.shopping_carmel_location),
                getString(R.string.shopping_carmel_geo),
                getString(R.string.shopping_carmel_time)));
        shoppingItems.add(new Item(getString(R.string.shopping_nahalat_binyamin),
                getString(R.string.shopping_nahalat_binyamin_description),
                getString(R.string.shopping_nahalat_binyamin_location),
                getString(R.string.shopping_nahalat_binyamin_geo),
                getString(R.string.shopping_nahalat_binyamin_time)));
        shoppingItems.add(new Item(getString(R.string.shopping_levinsky),
                getString(R.string.shopping_levinsky_description),
                getString(R.string.shopping_levinsky_location),
                getString(R.string.shopping_levinsky_geo),
                getString(R.string.shopping_levinsky_time)));
        shoppingItems.add(new Item(getString(R.string.shopping_flea_market),
                getString(R.string.shopping_flea_market_description),
                getString(R.string.shopping_flea_market_location),
                getString(R.string.shopping_flea_market_geo),
                getString(R.string.shopping_flea_market_time)));



        ItemAdapter adapter = new ItemAdapter(getActivity(), shoppingItems, R.color.colorShopping);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
