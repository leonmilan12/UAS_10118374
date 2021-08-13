//11 Agustus 2021, 10118374, Leonardo D Y Korompis, IF-9
package com.example.tempatwisata10118374;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailTempatActivity extends AppCompatActivity implements OnMapReadyCallback {
    private Tempat tempat;
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tempat);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvAddress = findViewById(R.id.tv_item_address);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map_detail);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        tempat = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (tempat != null) {
            Glide.with(this)
                    .load(tempat.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(tempat.getName());
            Log.e("LAT", String.valueOf(tempat.getLatitude()));
            Log.e("LNG", String.valueOf(tempat.getLongitude()));
            tvAddress.setText(tempat.getAddress());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Lokasi");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;

}
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng;
        if (tempat != null){
            latLng = new LatLng(tempat.getLatitude(), tempat.getLongitude());
        }else {
            latLng = new LatLng(-6.832777247653288, 107.60563975419706);
        }

        MarkerOptions options = new MarkerOptions();
        options.position(latLng).title(tempat.getAddress());
        googleMap.addMarker(options);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

    }
}