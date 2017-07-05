package com.example.android.tourguidewalbrzych;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Maffey on 2017-06-15.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> Places){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Places);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Find the proper views and change it accordingly, one by one, in this order: image id,
        // name, description, where.
        Place currentPlace = getItem(position);
        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageId());
        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());
        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentPlace.getDescription());
        TextView whereTextView = listItemView.findViewById(R.id.where);
        whereTextView.setText(currentPlace.getWhere());

        return listItemView;
    }
}
