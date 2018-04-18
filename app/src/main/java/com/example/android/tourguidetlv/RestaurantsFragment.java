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

        final ArrayList<Item> natureItems = new ArrayList<Item>();
        natureItems.add(new Item(R.drawable.abu_hasan_hummus,"Hummus HaAsli",
                "Original hummus restaurant in Jaffa",
                "Yefet",""));
        natureItems.add(new Item(R.drawable.falafel_shuk_hacarmel,"Falafel Kiosk",
                "Gluten free and regluar Falafel",
                "Shuk HaCarmel",""));


        ItemAdapter adapter = new ItemAdapter(getActivity(), natureItems, R.color.colorRestaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
