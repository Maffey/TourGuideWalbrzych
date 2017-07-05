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
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an ArrayList using our own Place class and then add all the inputs needed for
        // each place
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.sobieski, getString(R.string.sobieski),
                getString(R.string.sobieski_description), getString(R.string.nowe_miasto)));
        places.add(new Place(R.drawable.ksiazanski, getString(R.string.ksiazanski),
                getString(R.string.ksiazanski_description), getString(R.string.ksiaz)));
        places.add(new Place(R.drawable.castle_cisy, getString(R.string.castle_cisy),
                getString(R.string.castle_cisy_description), getString(R.string.ksiaz)));
        places.add(new Place(R.drawable.chelmiec, getString(R.string.chelmiec),
                getString(R.string.chelmiec_description), getString(R.string.bialy_kamien)));
        places.add(new Place(R.drawable.daisy, getString(R.string.daisy),
                getString(R.string.daisy_description), getString(R.string.lubiechow)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        // Disables setDrawSelectorOnTop defined in place_list.xml, since there are no web links.
        listView.setDrawSelectorOnTop(false);
        return rootView;
    }

}
