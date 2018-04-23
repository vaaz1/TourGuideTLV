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
        natureItems.add(new Item(R.drawable.yarkon_park,getString(R.string.nature_yarkon),
                getString(R.string.nature_yarkon_description),
                getString(R.string.nature_yarkon_location),
                getString(R.string.nature_yarkon_geo),
                getString(R.string.nature_yarkon_time)));
        natureItems.add(new Item(R.drawable.cactus_garden,getString(R.string.nature_cactus_garden),
                getString(R.string.nature_cactus_garden_description),
                getString(R.string.nature_cactus_garden_location),
                getString(R.string.nature_cactus_garden_geo),
                getString(R.string.nature_cactus_garden_time)));
        natureItems.add(new Item(R.drawable.charles_clore_beach,
                getString(R.string.nature_clore_beach),
                getString(R.string.nature_clore_beach_description),
                getString(R.string.nature_clore_beach_location),
                getString(R.string.nature_clore_beach_geo),
                getString(R.string.nature_clore_beach_time)));
        natureItems.add(new Item(R.drawable.charles_clore_garden,getString(R.string.nature_clore_garden),
                getString(R.string.nature_clore_garden_description),
                getString(R.string.nature_clore_garden_location),
                getString(R.string.nature_clore_garden_geo),
                getString(R.string.nature_clore_garden_time)));
        natureItems.add(new Item(getString(R.string.nature_aviv_beach),
                getString(R.string.nature_aviv_beach_description),
                getString(R.string.nature_aviv_beach_location),
                getString(R.string.nature_aviv_beach_geo),
                getString(R.string.nature_aviv_beach_time)));
        natureItems.add(new Item(R.drawable.jerusalem_beach,getString(R.string.nature_jerusalem_beach),
                getString(R.string.nature_jerusalem_beach_description),
                getString(R.string.nature_jerusalem_beach_location),
                getString(R.string.nature_jerusalem_beach_geo),
                getString(R.string.nature_jerusalem_beach_time)));
        natureItems.add(new Item(R.drawable.bugrshov_beach,getString(R.string.nature_bugrashov_beach),
                getString(R.string.nature_bugrashov_beach_description),
                getString(R.string.nature_bugrashov_beach_location),
                getString(R.string.nature_bugrashov_beach_geo),
                getString(R.string.nature_bugrashov_beach_time)));
        natureItems.add(new Item(R.drawable.frishman_beach,getString(R.string.nature_frishmann_beach),
                getString(R.string.nature_frishmann_beach_description),
                getString(R.string.nature_frishmann_beach_location),
                getString(R.string.nature_frishmann_beach_geo),
                getString(R.string.nature_frishmann_beach_time)));
        natureItems.add(new Item(R.drawable.gordon_beach,getString(R.string.nature_gordon_beach),
                getString(R.string.nature_gordon_beach_description),
                getString(R.string.nature_gordon_beach_location),
                getString(R.string.nature_gordon_beach_geo),
                getString(R.string.nature_gordon_beach_time)));
        natureItems.add(new Item(R.drawable.hilton_beach_1,getString(R.string.nature_hilton_beach),
                getString(R.string.nature_hilton_beach_description),
                getString(R.string.nature_hilton_beach_location),
                getString(R.string.nature_hilton_beach_geo),
                getString(R.string.nature_hilton_beach_time)));
        natureItems.add(new Item(R.drawable.haazmaut_garden,getString(R.string.nature_haazmaut_garden),
                getString(R.string.nature_haazmaut_garden_description),
                getString(R.string.nature_haazmaut_garden_location),
                getString(R.string.nature_haazmaut_garden_geo),
                getString(R.string.nature_haazmaut_garden_time)));
        natureItems.add(new Item(getString(R.string.nature_nordau_beach),
                getString(R.string.nature_nordau_beach_description),
                getString(R.string.nature_nordau_beach_location),
                getString(R.string.nature_nordau_beach_geo),
                getString(R.string.nature_nordau_beach_time)));
        natureItems.add(new Item(getString(R.string.nature_metzitzim_beach),
                getString(R.string.nature_metzitzim_beach_description),
                getString(R.string.nature_metzitzim_beach_location),
                getString(R.string.nature_metzitzim_beach_geo),
                getString(R.string.nature_metzitzim_beach_time)));
        natureItems.add(new Item(R.drawable.gan_meir,getString(R.string.nature_meir_garden),
                getString(R.string.nature_meir_garden_description),
                getString(R.string.nature_meir_garden_location),
                getString(R.string.nature_meir_garden_geo),
                getString(R.string.nature_meir_garden_time)));
        natureItems.add(new Item(R.drawable.hapisga_garden,getString(R.string.nature_hapisga_garden),
                getString(R.string.nature_hapisga_garden_description),
                getString(R.string.nature_hapisga_garden_location),
                getString(R.string.nature_hapisga_garden_geo),
                getString(R.string.nature_hapisga_garden_time)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), natureItems, R.color.colorNature);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
