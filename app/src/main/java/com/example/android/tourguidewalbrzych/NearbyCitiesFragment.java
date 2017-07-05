package com.example.android.tourguidewalbrzych;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearbyCitiesFragment extends Fragment {


    public NearbyCitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an ArrayList using our own Place class and then add all the inputs needed for
        // each place
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.wroclaw, getString(R.string.wroclaw),
                getString(R.string.wroclaw_description), getString(R.string.wroclaw_distance),
                getString(R.string.wroclaw_web)));
        places.add(new Place(R.drawable.swidnica, getString(R.string.swidnica),
                getString(R.string.swidnica_description), getString(R.string.swidnica_distance),
                getString(R.string.swidnica_web)));
        places.add(new Place(R.drawable.strzegom, getString(R.string.strzegom),
                getString(R.string.strzegom_description), getString(R.string.strzegom_distance),
                getString(R.string.strzegom_web)));
        places.add(new Place(R.drawable.swiebodzice, getString(R.string.swiebodzice),
                getString(R.string.swiebodzice_description), getString(R.string.swiebodzice_distance),
                getString(R.string.swiebodzice_web)));


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
        // Set Click Listener to allow user to enter appropriate web page.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place place = places.get(position);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(place.getWebLink()));
                startActivity(intent);
            }
        });
        return rootView;
    }

}
