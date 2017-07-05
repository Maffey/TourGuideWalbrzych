package com.example.android.tourguidewalbrzych;

/**
 * Created by Maffey on 2017-06-14.
 * <p>
 * {@link Place} represents a place that user can see in the app. It contains ID picture
 * of the place, its name, short description and either how far away it is or in which
 * district of the Walbrzych.
 */

public class Place {

    /**
     * The ID of the image.
     */
    private int mImageId;
    /**
     * Name of the location.
     */
    private String mName;
    /**
     * Description of this location.
     */
    private String mDescription;
    /**
     * District location in Walbrzych or distance from Walbrzych.
     */
    private String mWhere;

    /**
     * URL which is associated with the location.
     */
    private String mWebLink;

    /**
     * Constructor used for MostVisitedFragment and NearbyCitiesFragment.
     *
     * @param imageId     is the image ID of the picture that is supposed to show given location.
     * @param name        is the name of that location.
     * @param description is the description of that location.
     * @param where       is the either distance (if the place is out of Walbrzych)
     *                    or district of that location.
     * @param webLink     is a link that will be used when the view is clicked.
     */
    public Place(int imageId, String name, String description, String where, String webLink) {
        mImageId = imageId;
        mName = name;
        mDescription = description;
        mWhere = where;
        mWebLink = webLink;
    }

    /**
     * Constructor used for NatureFragment and ChurchesFragment.
     *
     * @param imageId     is the image ID of the picture that is supposed to show given location.
     * @param name        is the name of that location.
     * @param description is the description of that location.
     * @param where       is the either distance (if the place is out of Walbrzych)
     *                    or district of that location.
     */
    public Place(int imageId, String name, String description, String where) {
        mImageId = imageId;
        mName = name;
        mDescription = description;
        mWhere = where;
    }

    /**
     * Get the ID of the image.
     */
    public int getImageId() {
        return mImageId;
    }

    /**
     * Get the name of the place.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the description of the place.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the distance or the district of the place.
     */
    public String getWhere() {
        return mWhere;
    }

    /**
     * Get the URL adress associated with the place.
     */
    public String getWebLink() {
        return mWebLink;
    }
}
