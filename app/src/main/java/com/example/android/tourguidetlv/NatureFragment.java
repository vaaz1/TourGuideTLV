package com.example.android.tourguidetlv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> natureItems = new ArrayList<Item>();
        natureItems.add(new Item(R.drawable.yarkon_park,"Yarkon Park - Ganei Yehoshua",
                "Big park along the Yarkon river including bike tracks, outdoor gyms and playing grounds",
                "Ussishkin Promenade","Open 24/7"));
        natureItems.add(new Item(R.drawable.cactus_garden,"Cactus Garden",
                "Garden with many different types of succulents and other plants",
                "Ganei Yehoshua Park","Open 24/7"));
        natureItems.add(new Item(R.drawable.charles_clore_beach,"Charles Clore Beach","Non-motorized water sports, dog friendly",
                "Kaufmann St 5","Open 24/7"));
        natureItems.add(new Item(R.drawable.charles_clore_garden,"Charles Clore Garden","Garden near Tel Aviv beach",
                "Kaufmann St 5","Open 24/7"));
        natureItems.add(new Item("Aviv Beach","Non-motorized water sports",
                "Herbert Samuel Pier 5","Open 24/7"));
        natureItems.add(new Item(R.drawable.jerusalem_beach,"Jerusalem Beach","Blue Flag beach",
                "Herbert Samuel Pier 54","Open 24/7", ""));
        natureItems.add(new Item(R.drawable.bugrshov_beach,"Bugrashov Beach","General city beach",
                "Herbert Samuel Pier 90","Open 24/7"));
        natureItems.add(new Item(R.drawable.frishman_beach,"Frishmann Beach","General city beach",
                "Herbert Samuel Pier 99","Open 24/7"));
        natureItems.add(new Item(R.drawable.gordon_beach,"Gordon Beach","Non-motorized water sports, courts at the beach",
                "HHaYarkon St 145","Open 24/7"));
        natureItems.add(new Item(R.drawable.hilton_beach_1,"Hilton Beach","Lighting for nighttime surfing, Gay beach",
                "Shlomo Lahat Promenade","Open 24/7"));
        natureItems.add(new Item(R.drawable.haazmaut_garden,"Gan Haatsmaut","Independence garden with view to the beach",
                "HaYarkon St 205","Open 24/7"));
        natureItems.add(new Item("Nordau Seperate Beach","Seperate bathing for men and women - religious population",
                "Shlomo Lahat Promenade",""));
        natureItems.add(new Item("Metzitzim Beach","Blue flag beach",
                "Shlomo Lahat Promenade","Open 24/7"));
        natureItems.add(new Item(R.drawable.gan_meir, "Gan Meir", "Garden with playing ground and open air gym",
                "King George St 33","open 24/7"));
        natureItems.add(new Item(R.drawable.hapisga_garden, "Hapisga Garden", "Garden in Jaffa with a beautiful view on Tel Aviv",
                "King George St 33","open 24/7"));

        ItemAdapter adapter = new ItemAdapter(getActivity(), natureItems, R.color.colorNature);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
