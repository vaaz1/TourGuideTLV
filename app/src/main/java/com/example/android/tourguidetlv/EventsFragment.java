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
        eventItems.add(new Item(R.drawable.cinema,"City Cinema",
                "General movies theater",
                "Ben Ami St 16","32.078356, 34.773680",""));
        eventItems.add(new Item(R.drawable.purim_kikar_hamedina,"Purim Celebration",
                "National holiday (Purim) celebration party",
                "Hamedina Square","32.086621, 34.789861","12.03.2018"));
        eventItems.add(new Item(R.drawable.independence_day,"Independence night celebration",
                "Music and dance shows for the celebration of Israel's independence",
                "Rabin Square","32.080651, 34.780612","18.04.2018 from 20:50"));
        eventItems.add(new Item(R.drawable.open_air_opera,"Open Air Opera",
                "City event, open air opera",
                "Yarkon Park","32.103506, 34.814404","coming soon"));
        eventItems.add(new Item(R.drawable.yoga,"Friday Yoga",
                "free yoga sessions",
                "Tel Aviv Port","32.099740, 34.776930","every Friday at 8 AM"));
        eventItems.add(new Item(R.drawable.folk_dancing,"Israeli Folk Dancing",
                "free national folk dancing sessions",
                "Gordon Beach promenade","32.083678, 34.768538","every Saturday at 11 AM"));


        ItemAdapter adapter = new ItemAdapter(getActivity(), eventItems, R.color.colorEvents);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
