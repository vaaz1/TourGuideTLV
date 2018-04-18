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

        final ArrayList<Item> natureItems = new ArrayList<Item>();
        natureItems.add(new Item(R.drawable.cinema,"City Cinema",
                "General movies theater",
                "Weizmann",""));
        natureItems.add(new Item(R.drawable.purim_kikar_hamedina,"Purim Celebration",
                "National holiday (Purim) celebration party",
                "Hamedina Square","12.03.2018"));
        natureItems.add(new Item(R.drawable.logo_city,"Habima National Theatre",
                "Theatre",
                "Ben Zion",""));
        natureItems.add(new Item(R.drawable.logo_city,"Opera Residential Tower",
                "Tel Aviv Opera",
                "Check.",""));
        natureItems.add(new Item(R.drawable.open_air_opera,"Open Air Opera",
                "City event, playing opera outside",
                "Yarkon Park","coming soon"));

        ItemAdapter adapter = new ItemAdapter(getActivity(), natureItems, R.color.colorEvents);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String pos = String.valueOf(position);
                Item item = natureItems.get(position);
                pos = item.getmLocation();
                Toast toast = Toast.makeText(getContext(),"clicked on item at "+pos, Toast.LENGTH_SHORT);
                toast.show();
                Uri geoLocation = Uri.parse("geo:47.8060805,7.6267819?z=19");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }

}
