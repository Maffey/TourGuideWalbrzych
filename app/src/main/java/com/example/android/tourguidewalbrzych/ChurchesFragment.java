package com.example.android.tourguidewalbrzych;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChurchesFragment extends Fragment {


    public ChurchesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an ArrayList using our own Place class and then add all the inputs needed for
        // each place
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.anny, getString(R.string.anny),
                getString(R.string.anny_description), getString(R.string.szczawienko)));
        places.add(new Place(R.drawable.aniolow, getString(R.string.aniolow),
                getString(R.string.aniolow_description), getString(R.string.srodmiescie)));
        places.add(new Place(R.drawable.podwyzszenia, getString(R.string.podwyzszenia),
                getString(R.string.podwyzszenia_description), getString(R.string.podzamcze)));
        places.add(new Place(R.drawable.wojciecha, getString(R.string.wojciecha),
                getString(R.string.wojciecha_description), getString(R.string.piaskowa_gora)));
        places.add(new Place(R.drawable.zmartwychwstania, getString(R.string.zmartwychwstania),
                getString(R.string.zmartwychwstania_description), getString(R.string.stary_zdroj)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        // Disables setDrawSelectorOnTop defined in place_list.xml, since there are no web links.
        listView.setDrawSelectorOnTop(false);
        return rootView;
    }

}
