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
        attractionItems.add(new Item(R.drawable.city_hall,getString(R.string.attraction_city_hall),
                getString(R.string.attraction_city_hall_description),
                getString(R.string.attraction_city_hall_location),
                getString(R.string.attraction_city_hall_geo),
                getString(R.string.attraction_city_hall_time),
                getString(R.string.attraction_city_hall_phone)));
        attractionItems.add(new Item(R.drawable.beit_ariela_library,getString(R.string.attraction_ariela_library),
                getString(R.string.attraction_ariela_library_description),
                getString(R.string.attraction_ariela_library_location),
                getString(R.string.attraction_ariela_library_geo),
                getString(R.string.attraction_ariela_library_time),
                getString(R.string.attraction_ariela_library_phone)));
        attractionItems.add(new Item(R.drawable.old_station,getString(R.string.attraction_old_railway),
                getString(R.string.attraction_old_railway_description),
                getString(R.string.attraction_old_railway_location),
                getString(R.string.attraction_old_railway_geo),
                getString(R.string.attraction_old_railway_time),
                getString(R.string.attraction_old_railway_phone)));
        attractionItems.add(new Item(R.drawable.clock_tower,getString(R.string.attraction_clock_tower),
                getString(R.string.attraction_clock_tower_description),
                getString(R.string.attraction_clock_tower_location),
                getString(R.string.attraction_clock_tower_geo),
                getString(R.string.attraction_clock_tower_time),
                getString(R.string.attraction_clock_tower_phone)));
        attractionItems.add(new Item(R.drawable.jaffa_port,getString(R.string.attraction_jaffa_port),
                getString(R.string.attraction_jaffa_port_description),
                getString(R.string.attraction_jaffa_port_location),
                getString(R.string.attraction_jaffa_port_geo),
                getString(R.string.attraction_jaffa_port_time),
                getString(R.string.attraction_jaffa_port_phone)));
        attractionItems.add(new Item(R.drawable.ilana_goor_museum,getString(R.string.attraction_ilana_goor),
                getString(R.string.attraction_ilana_goor_description),
                getString(R.string.attraction_ilana_goor_location),
                getString(R.string.attraction_ilana_goor_geo),
                getString(R.string.attraction_ilana_goor_time),
                getString(R.string.attraction_ilana_goor_phone)));
        attractionItems.add(new Item(R.drawable.hanging_tree_jaffa,getString(R.string.attraction_hanging_tree),
                getString(R.string.attraction_hanging_tree_description),
                getString(R.string.attraction_hanging_tree_location),
                getString(R.string.attraction_hanging_tree_geo),
                getString(R.string.attraction_hanging_tree_time),
                getString(R.string.attraction_hanging_tree_phone)));
        attractionItems.add(new Item(R.drawable.jaffa_theater,getString(R.string.attraction_jaffa_theatre),
                getString(R.string.attraction_jaffa_theatre_description),
                getString(R.string.attraction_jaffa_theatre_location),
                getString(R.string.attraction_jaffa_theatre_geo),
                getString(R.string.attraction_jaffa_theatre_time),
                getString(R.string.attraction_jaffa_theatre_phone)));
        attractionItems.add(new Item(R.drawable.jaffa_art_gallery,getString(R.string.attraction_jaffa_art),
                getString(R.string.attraction_jaffa_art_description),
                getString(R.string.attraction_jaffa_art_location),
                getString(R.string.attraction_jaffa_art_geo),
                getString(R.string.attraction_jaffa_art_time),
                getString(R.string.attraction_jaffa_art_phone)));
        attractionItems.add(new Item(R.drawable.balloon,getString(R.string.attraction_balloon),
                getString(R.string.attraction_balloon_description),
                getString(R.string.attraction_balloon_location),
                getString(R.string.attraction_balloon_geo),
                getString(R.string.attraction_balloon_time),
                getString(R.string.attraction_balloon_phone)));
        attractionItems.add(new Item(R.drawable.art_museum,getString(R.string.attraction_art_museum),
                getString(R.string.attraction_art_museum_description),
                getString(R.string.attraction_art_museum_location),
                getString(R.string.attraction_art_museum_geo),
                getString(R.string.attraction_art_museum_time),
                getString(R.string.attraction_art_museum_phone)));
        attractionItems.add(new Item(R.drawable.performing_art_center,getString(R.string.attraction_art_center),
                getString(R.string.attraction_art_center_description),
                getString(R.string.attraction_art_center_location),
                getString(R.string.attraction_art_center_geo),
                getString(R.string.attraction_art_center_time),
                getString(R.string.attraction_art_center_phone)));
        attractionItems.add(new Item(R.drawable.independance_house,getString(R.string.attraction_independence_hall),
                getString(R.string.attraction_independence_hall_description),
                getString(R.string.attraction_independence_hall_location),
                getString(R.string.attraction_independence_hall_geo),
                getString(R.string.attraction_independence_hall_time),
                getString(R.string.attraction_independence_hall_phone)));
        attractionItems.add(new Item(R.drawable.habima_national_theater,getString(R.string.attraction_habima),
                getString(R.string.attraction_habima_description),
                getString(R.string.attraction_habima_location),
                getString(R.string.attraction_habima_geo),
                getString(R.string.attraction_habima_time),
                getString(R.string.attraction_habima_phone)));
        attractionItems.add(new Item(R.drawable.bronfman_auditorium,getString(R.string.attraction_bronfman_auditorium),
                getString(R.string.attraction_bronfman_auditorium_description),
                getString(R.string.attraction_bronfman_auditorium_location),
                getString(R.string.attraction_bronfman_auditorium_geo),
                getString(R.string.attraction_bronfman_auditorium_time),
                getString(R.string.attraction_bronfman_auditorium_phone)));
        attractionItems.add(new Item(R.drawable.beit_rubin_museum,getString(R.string.attraction_rubin_museum),
                getString(R.string.attraction_rubin_museum_description),
                getString(R.string.attraction_rubin_museum_location),
                getString(R.string.attraction_rubin_museum_geo),
                getString(R.string.attraction_rubin_museum_time),
                getString(R.string.attraction_rubin_museum_phone)));
        attractionItems.add(new Item(R.drawable.beit_bialik_museum,getString(R.string.attraction_bialik_house),
                getString(R.string.attraction_bialik_house_description),
                getString(R.string.attraction_bialik_house_location),
                getString(R.string.attraction_bialik_house_geo),
                getString(R.string.attraction_bialik_house_time),
                getString(R.string.attraction_bialik_house_phone)));
        attractionItems.add(new Item(R.drawable.old_town_hall,getString(R.string.attraction_beit_hair),
                getString(R.string.attraction_beit_hair_description),
                getString(R.string.attraction_beit_hair_location),
                getString(R.string.attraction_beit_hair_geo),
                getString(R.string.attraction_beit_hair_time),
                getString(R.string.attraction_beit_hair_phone)));
        attractionItems.add(new Item(R.drawable.opera,getString(R.string.attraction_opera_tower),
                getString(R.string.attraction_opera_tower_description),
                getString(R.string.attraction_opera_tower_location),
                getString(R.string.attraction_opera_tower_geo),
                getString(R.string.attraction_opera_tower_time),
                getString(R.string.attraction_opera_tower_phone)));
        attractionItems.add(new Item(R.drawable.hashalom_tower,getString(R.string.attraction_shalom_tower),
                getString(R.string.attraction_shalom_tower_desription),
                getString(R.string.attraction_shalom_tower_location),
                getString(R.string.attraction_shalom_tower_geo),
                getString(R.string.attraction_shalom_tower_time),
                getString(R.string.attraction_shalom_tower_phone)));
        attractionItems.add(new Item(R.drawable.sarona_village,getString(R.string.attraction_sarona),
                getString(R.string.attraction_sarona_description),
                getString(R.string.attraction_sarona_location),
                getString(R.string.attraction_sarona_geo),
                getString(R.string.attraction_sarona_time),
                getString(R.string.attraction_sarona_phone)));
        attractionItems.add(new Item(R.drawable.jabotinski_house,getString(R.string.attraction_jabotinski_house),
                getString(R.string.attraction_jabotinski_house_description),
                getString(R.string.attraction_jabotinski_house_location),
                getString(R.string.attraction_jabotinski_house_geo),
                getString(R.string.attraction_jabotinski_house_time),
                getString(R.string.attraction_jabotinski_house_phone)));
        attractionItems.add(new Item(R.drawable.gutman_museum,getString(R.string.attraction_gutman_museum),
                getString(R.string.attraction_gutman_museum_description),
                getString(R.string.attraction_gutman_museum_location),
                getString(R.string.attraction_gutman_museum_geo),
                getString(R.string.attraction_gutman_museum_time),
                getString(R.string.attraction_gutman_museum_phone)));
        attractionItems.add(new Item(R.drawable.suzanne_dellal_center,getString(R.string.attraction_dellal_center),
                getString(R.string.attraction_dellal_center_description),
                getString(R.string.attraction_dellal_center_location),
                getString(R.string.attraction_dellal_center_geo),
                getString(R.string.attraction_dellal_center_time),
                getString(R.string.attraction_dellal_center_phone)));
        attractionItems.add(new Item(R.drawable.etsel_museum,getString(R.string.attraction_etzel_museum),
                getString(R.string.attraction_etzel_museum_description),
                getString(R.string.attraction_etzel_museum_location),
                getString(R.string.attraction_etzel_museum_geo),
                getString(R.string.attraction_etzel_museum_time),
                getString(R.string.attraction_etzel_museum_phone)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), attractionItems, R.color.colorAttractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
