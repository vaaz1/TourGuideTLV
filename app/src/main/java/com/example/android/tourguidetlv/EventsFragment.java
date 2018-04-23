package com.example.android.tourguidetlv;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> eventItems = new ArrayList<Item>();
        eventItems.add(new Item(R.drawable.cinema,getString(R.string.event_cinema),
                getString(R.string.event_cinema_description),
                getString(R.string.event_cinema_location),
                getString(R.string.event_cinema_geo),
                getString(R.string.event_cinema_time)));
        eventItems.add(new Item(R.drawable.purim_kikar_hamedina,getString(R.string.event_purim),
                getString(R.string.event_purim_description),
                getString(R.string.event_purim_location),
                getString(R.string.event_purim_geo),
                getString(R.string.event_purim_time)));
        eventItems.add(new Item(R.drawable.independence_day,getString(R.string.event_independence),
                getString(R.string.event_independence_description),
                getString(R.string.event_independence_location),
                getString(R.string.event_independence_geo),
                getString(R.string.event_independence_time)));
        eventItems.add(new Item(R.drawable.open_air_opera,getString(R.string.event_opera_open_air),
                getString(R.string.event_opera_open_air_description),
                getString(R.string.event_opera_open_air_location),
                getString(R.string.event_opera_open_air_geo),
                getString(R.string.event_opera_open_air_time)));
        eventItems.add(new Item(R.drawable.yoga,getString(R.string.event_yoga),
                getString(R.string.event_yoga_description),
                getString(R.string.event_yoga_location),
                getString(R.string.event_yoga_geo),
                getString(R.string.event_yoga_time)));
        eventItems.add(new Item(R.drawable.folk_dancing,getString(R.string.event_folk_dancing),
                getString(R.string.event_folk_dancing_description),
                getString(R.string.event_folk_dancing_location),
                getString(R.string.event_folk_dancing_geo),
                getString(R.string.event_folk_dancing_time)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), eventItems, R.color.colorEvents);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
