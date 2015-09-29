package com.example.cjwillis.dreammap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.cjwillis.dreammap.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;

public class MapsActivity extends FragmentActivity {

    private GoogleMap map; // Might be null if Google Play services APK is not available.
    private HashMap<String, LatLng> locations = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        setUpLocations();
        setUpMapIfNeeded();
    }

    private void setUpLocations() {
        locations.put("Home", new LatLng(41.882054, -87.627815));
        locations.put("Tokyo, Japan", new LatLng(35.6895000	, 139.6917100));
        locations.put("Toronto, Canada", new LatLng(43.652449, -79.379431));
        locations.put("Paris, France", new LatLng(48.858398, 2.294703));
        locations.put("New York City", new LatLng(40.759102, -73.985131));
        locations.put("London, United Kingdom", new LatLng(51.500713, -0.124629));
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #map} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (map == null) {
            // Try to obtain the map from the SupportMapFragment.
            map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (map != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #map} is not null.
     */
    private void setUpMap() {
        for (String key : locations.keySet()){
            map.addMarker(new MarkerOptions().position(locations.get(key)).title(key));
        }
//        map.addMarker(new MarkerOptions().position(new LatLng(41.882054, -87.627815)).title("Home"));

    }
}
