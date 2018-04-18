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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> natureItems = new ArrayList<Item>();
        natureItems.add(new Item(R.drawable.city_hall,"City Hall",
                "The City Hall in the center of Tel Aviv",
                "Shlomo Ibn Gabirol St 69","", "035218666"));
        natureItems.add(new Item(R.drawable.beit_ariela_library,"Beit Ariela Library",
                "Public city library",
                "Sderot Sha'ul HaMelech 25","Sun-Thu 10:00-18:45, Fri 90:00-11:45, Sat closed"));
        natureItems.add(new Item(R.drawable.old_station,"Old Jaffa Railway Station",
                "Old Railway Station, Quater with restaurants and shops",
                "Kaufmann St",""));
        natureItems.add(new Item(R.drawable.clock_tower,"Clock Tower",
                "Old clock tower at the enterance of Jaffa",
                "East of the Clock Tower","24/7 open"));
        natureItems.add(new Item(R.drawable.jaffa_port,"Jaffa Port",
                "Port of Jaffa with restaurants",
                "Nemal Yafo St 1","24/7 open"));
        natureItems.add(new Item(R.drawable.ilana_goor_museum,"Ilana Goor Museum",
                "Arcitecture and art in Old Jaffa",
                "Mazal Dagim St 4","open all days from 10:00-16:00"));
        natureItems.add(new Item(R.drawable.hanging_tree_jaffa,"Suspended Orange Tree",
                "Floating orange tree in Old Jaffa",
                "HaTsorfim St 2",""));
        natureItems.add(new Item(R.drawable.jaffa_theater,"Theatre of Jaffa",
                "Arab Hebrew theatre of Jaffa",
                "Mifrats Shlomo Promenade 10","", "035185563"));
        natureItems.add(new Item(R.drawable.jaffa_art_gallery,"Old Jaffa Street Gallery",
                "Archaeology and history, boutique and art shops",
                "Mazal Arieh St",""));
        natureItems.add(new Item(R.drawable.balloon,"Hot Air Balloon",
                "Nice way to see the city from the air",
                "Yarkon Park, Rokach Blvd 98","Sun-Thu, Sat 9:00-19:00, Fri 9:00-16:00"));
        natureItems.add(new Item(R.drawable.art_museum,"Tel Aviv Museum of Art",
                "Varying exhibitions",
                "Sderot Sha'ul HaMelech 27","Tue, Thu 10:00-21:00, Mo, Wed, Sat 10:00-18:00, Fri 10:00-14:00, Sun closed", "036077020"));
        natureItems.add(new Item(R.drawable.performing_art_center,"Performing Arts Center",
                "Opera house and Cameri Theater",
                "Sderot Sha'ul HaMelech 19","", "036927777"));
        natureItems.add(new Item(R.drawable.independance_house,"Independence Hall",
                "Building where the state of Israel was declared",
                "Rothschild Blvd 16","Sun-Thu 9:00-17:00, Fri 9:00-14:00, Sat closed", "035173942"));
        natureItems.add(new Item(R.drawable.habima_national_theater,"HaBima National Theatre",
                "Israeli national theatre",
                "Sderot Tarsat 2","", "036295555"));
        natureItems.add(new Item(R.drawable.bronfman_auditorium,"Charles Bronfman Auditorium",
                "Tel Aviv cultural and concert hall, headquarters of the Israel Philharmonic Orchestra",
                "Huberman St 1","", "035430777"));
        natureItems.add(new Item(R.drawable.beit_rubin_museum,"Rubin Museum",
                "Former home of the painter Rubin",
                "Bialik St 14","Mo, Wed-Fri 10:00-15:00, Tue 10:00-20:00, Sat 11:00-14:00, Sun closed", "035255961"));
        natureItems.add(new Item(R.drawable.beit_bialik_museum,"Bialik House",
                "Former home of the Hebrew national poet Hayyim Nahman Bialik",
                "Bialik St 22","Mo-Thu 9:00-17:00, Fri-Sat 10:00-14:00, Sun closed", "035254530"));
        natureItems.add(new Item(R.drawable.old_town_hall,"Beit Ha'ir",
                "Old town hall of Tel Aviv",
                "Bialik St 27","Mo-Thu 9:00-17:00, Fri-Sat 10:00-14:00, Sun closed", "037240311"));
        natureItems.add(new Item(R.drawable.opera,"The Opera Tower",
                "23-story building, appartments and shops",
                "Allenby St 1","", ""));
        natureItems.add(new Item(R.drawable.hashalom_tower,"Shalom Tower",
                "Oldest and first high building of Tel Aviv, art and history inside",
                "Ahad Ha'Am St 9","", ""));
        natureItems.add(new Item(R.drawable.sarona_village,"Sarona",
                "Old German settlement now quater with restaurants and boutiques",
                "Sarona","", ""));
        natureItems.add(new Item(R.drawable.jabotinski_house,"Beit Jabotinski Institute",
                "Museum for Jabotinsky, visionary and inspirational leader during the establishment of the State",
                "Shim'on Rokah St 21","Sun-Thu 9:00-16:00, Fri-Sat closed", "035287320"));
        natureItems.add(new Item(R.drawable.gutman_museum,"Gutman Museum",
                "Nahum Gutman Museum of Art",
                "King George St 38","Mon-Thu 10:00-16:00, Fri 10:00-14:00, Sat 10:00-15:00, Sun closed", "035161970"));
        natureItems.add(new Item(R.drawable.suzanne_dellal_center,"Suzanne Dellal Center",
                "Center for Dance and Theater",
                "Yehieli St 5","", "035105656"));
        natureItems.add(new Item(R.drawable.etsel_museum,"Etzel Museum",
                "Museum about the Etzel underground group fighting for Isreal's independence",
                "Charles Clore Garden","Sun-Thu 8:30-16:30, Fri-Sat closed", "035177180"));


        ItemAdapter adapter = new ItemAdapter(getActivity(), natureItems, R.color.colorAttractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
