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
                "Ussishkin Promenade","32.097200, 34.787039","Open 24/7"));
        natureItems.add(new Item(R.drawable.cactus_garden,"Cactus Garden",
                "Garden with many different types of succulents and other plants",
                "Ganei Yehoshua Park","32.101602, 34.813929","Open 24/7"));
        natureItems.add(new Item(R.drawable.charles_clore_beach,"Charles Clore Beach","Non-motorized water sports, dog friendly",
                "Kaufmann St 5","32.060995, 34.759510","Open 24/7"));
        natureItems.add(new Item(R.drawable.charles_clore_garden,"Charles Clore Garden","Garden near Tel Aviv beach",
                "Kaufmann St 5","32.063302, 34.760474","Open 24/7"));
        natureItems.add(new Item("Aviv Beach","Non-motorized water sports",
                "Herbert Samuel Pier 5","32.069797, 34.763221","Open 24/7"));
        natureItems.add(new Item(R.drawable.jerusalem_beach,"Jerusalem Beach","Blue Flag beach",
                "Herbert Samuel Pier 54","32.073720, 34.764328","Open 24/7", ""));
        natureItems.add(new Item(R.drawable.bugrshov_beach,"Bugrashov Beach","General city beach",
                "Herbert Samuel Pier 90","32.078286, 34.766289","Open 24/7"));
        natureItems.add(new Item(R.drawable.frishman_beach,"Frishmann Beach","General city beach",
                "Herbert Samuel Pier 99","32.080425, 34.766998","Open 24/7"));
        natureItems.add(new Item(R.drawable.gordon_beach,"Gordon Beach","Non-motorized water sports, courts at the beach",
                "HHaYarkon St 145","32.084139, 34.768224","Open 24/7"));
        natureItems.add(new Item(R.drawable.hilton_beach_1,"Hilton Beach","Lighting for nighttime surfing, Gay beach",
                "Shlomo Lahat Promenade","32.089358, 34.769692","Open 24/7"));
        natureItems.add(new Item(R.drawable.haazmaut_garden,"Gan Haatsmaut","Independence garden with view to the beach",
                "HaYarkon St 205","32.091545, 34.771695","Open 24/7"));
        natureItems.add(new Item("Nordau Seperate Beach","Seperate bathing for men and women - religious population",
                "Shlomo Lahat Promenade","32.091910, 34.770850",""));
        natureItems.add(new Item("Metzitzim Beach","Blue flag beach",
                "Shlomo Lahat Promenade","32.093721, 34.770535","Open 24/7"));
        natureItems.add(new Item(R.drawable.gan_meir, "Gan Meir", "Garden with playing ground and open air gym",
                "King George St 33","32.073257, 34.773162","open 24/7"));
        natureItems.add(new Item(R.drawable.hapisga_garden, "Hapisga Garden", "Garden in Jaffa with a beautiful view on Tel Aviv",
                "King George St 33","32.054730, 34.753264","open 24/7"));

        ItemAdapter adapter = new ItemAdapter(getActivity(), natureItems, R.color.colorNature);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
