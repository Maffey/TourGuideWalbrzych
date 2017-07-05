package com.example.android.tourguidewalbrzych;

/**
 * Created by Maffey on 2017-06-15.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    // Store how many pages of fragments there are to be used in the getCount method.
    final int PAGE_COUNT = 4;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Get fragment to set it in the Adapter.
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MostVisitedFragment();
        } else if (position == 1) {
            return new NatureFragment();
        } else if (position == 2) {
            return new ChurchesFragment();
        } else {
            return new NearbyCitiesFragment();
        }
    }

    // Set the page title in the fragment.
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.most_visited);
        } else if (position == 1) {
            return mContext.getString(R.string.nature);
        } else if (position == 2) {
            return mContext.getString(R.string.churches);
        } else {
            return mContext.getString(R.string.nearby_cities);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
