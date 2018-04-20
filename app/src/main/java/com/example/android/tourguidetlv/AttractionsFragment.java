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

        final ArrayList<Item> attractionItems = new ArrayList<Item>();
        attractionItems.add(new Item(R.drawable.city_hall,"City Hall",
                "The City Hall in the center of Tel Aviv",
                "Shlomo Ibn Gabirol St 69","32.081617, 34.780905","", "035218666"));
        attractionItems.add(new Item(R.drawable.beit_ariela_library,"Beit Ariela Library",
                "Public city library",
                "Sderot Sha'ul HaMelech 25","32.076656, 34.786469","Sun-Thu 10:00-18:45, Fri 90:00-11:45, Sat closed"));
        attractionItems.add(new Item(R.drawable.old_station,"Old Jaffa Railway Station",
                "Old Railway Station, Quater with restaurants and shops",
                "Kaufmann St","32.058985, 34.761911",""));
        attractionItems.add(new Item(R.drawable.clock_tower,"Clock Tower",
                "Old clock tower at the enterance of Jaffa",
                "East of the Clock Tower","32.054934, 34.756270","24/7 open"));
        attractionItems.add(new Item(R.drawable.jaffa_port,"Jaffa Port",
                "Port of Jaffa with restaurants",
                "Nemal Yafo St 1","32.052699, 34.749809","24/7 open"));
        attractionItems.add(new Item(R.drawable.ilana_goor_museum,"Ilana Goor Museum",
                "Arcitecture and art in Old Jaffa",
                "Mazal Dagim St 4","32.053371, 34.751482","open all days from 10:00-16:00"));
        attractionItems.add(new Item(R.drawable.hanging_tree_jaffa,"Suspended Orange Tree",
                "Floating orange tree in Old Jaffa",
                "HaTsorfim St 2","32.053104, 34.752929",""));
        attractionItems.add(new Item(R.drawable.jaffa_theater,"Theatre of Jaffa",
                "Arab Hebrew theatre of Jaffa",
                "Mifrats Shlomo Promenade 10","32.054748, 34.754016","", "035185563"));
        attractionItems.add(new Item(R.drawable.jaffa_art_gallery,"Old Jaffa Street Gallery",
                "Archaeology and history, boutique and art shops",
                "Mazal Arieh St","32.053342, 34.751901",""));
        attractionItems.add(new Item(R.drawable.balloon,"Hot Air Balloon",
                "Nice way to see the city from the air",
                "Yarkon Park, Rokach Blvd 98","32.099442, 34.809914","Sun-Thu, Sat 9:00-19:00, Fri 9:00-16:00"));
        attractionItems.add(new Item(R.drawable.art_museum,"Tel Aviv Museum of Art",
                "Varying exhibitions",
                "Sderot Sha'ul HaMelech 27","32.077605, 34.786745",
                "Tue, Thu 10:00-21:00, Mo, Wed, Sat 10:00-18:00, Fri 10:00-14:00, Sun closed", "036077020"));
        attractionItems.add(new Item(R.drawable.performing_art_center,"Performing Arts Center",
                "Opera house and Cameri Theater",
                "Sderot Sha'ul HaMelech 19","32.076265, 34.785324","", "036927777"));
        attractionItems.add(new Item(R.drawable.independance_house,"Independence Hall",
                "Building where the state of Israel was declared",
                "Rothschild Blvd 16","32.062850, 34.770969","Sun-Thu 9:00-17:00, Fri 9:00-14:00, Sat closed", "035173942"));
        attractionItems.add(new Item(R.drawable.habima_national_theater,"HaBima National Theatre",
                "Israeli national theatre",
                "Sderot Tarsat 2","32.072539, 34.778943","", "036295555"));
        attractionItems.add(new Item(R.drawable.bronfman_auditorium,"Charles Bronfman Auditorium",
                "Tel Aviv cultural and concert hall, headquarters of the Israel Philharmonic Orchestra",
                "Huberman St 1","32.073327, 34.780077","", "035430777"));
        attractionItems.add(new Item(R.drawable.beit_rubin_museum,"Rubin Museum",
                "Former home of the painter Rubin",
                "Bialik St 14", "32.072121, 34.770650",
                "Mo, Wed-Fri 10:00-15:00, Tue 10:00-20:00, Sat 11:00-14:00, Sun closed", "035255961"));
        attractionItems.add(new Item(R.drawable.beit_bialik_museum,"Bialik House",
                "Former home of the Hebrew national poet Hayyim Nahman Bialik",
                "Bialik St 22","32.072891, 34.770953",
                "Mo-Thu 9:00-17:00, Fri-Sat 10:00-14:00, Sun closed", "035254530"));
        attractionItems.add(new Item(R.drawable.old_town_hall,"Beit Ha'ir",
                "Old town hall of Tel Aviv",
                "Bialik St 27","32.073435, 34.771076",
                "Mo-Thu 9:00-17:00, Fri-Sat 10:00-14:00, Sun closed", "037240311"));
        attractionItems.add(new Item(R.drawable.opera,"The Opera Tower",
                "23-story building, appartments and shops",
                "Allenby St 1","32.074023, 34.765632","", ""));
        attractionItems.add(new Item(R.drawable.hashalom_tower,"Shalom Tower",
                "Oldest and first high building of Tel Aviv, art and history inside",
                "Ahad Ha'Am St 9","32.064119, 34.769504","", ""));
        attractionItems.add(new Item(R.drawable.sarona_village,"Sarona",
                "Old German settlement now quater with restaurants and boutiques",
                "Sarona","32.072054, 34.786680","", ""));
        attractionItems.add(new Item(R.drawable.jabotinski_house,"Beit Jabotinski Institute",
                "Museum for Jabotinsky, visionary and inspirational leader during the establishment of the State",
                "Shim'on Rokah St 21","32.072930, 34.774870","Sun-Thu 9:00-16:00, Fri-Sat closed", "035287320"));
        attractionItems.add(new Item(R.drawable.gutman_museum,"Gutman Museum",
                "Nahum Gutman Museum of Art",
                "King George St 38","32.060920, 34.766521",
                "Mon-Thu 10:00-16:00, Fri 10:00-14:00, Sat 10:00-15:00, Sun closed", "035161970"));
        attractionItems.add(new Item(R.drawable.suzanne_dellal_center,"Suzanne Dellal Center",
                "Center for Dance and Theater",
                "Yehieli St 5","32.060718, 34.764143","", "035105656"));
        attractionItems.add(new Item(R.drawable.etsel_museum,"Etzel Museum",
                "Museum about the Etzel underground group fighting for Isreal's independence",
                "Charles Clore Garden","32.059255, 34.758581",
                "Sun-Thu 8:30-16:30, Fri-Sat closed", "035177180"));


        ItemAdapter adapter = new ItemAdapter(getActivity(), attractionItems, R.color.colorAttractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
