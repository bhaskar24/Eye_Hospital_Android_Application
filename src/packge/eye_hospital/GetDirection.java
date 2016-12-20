package packge.eye_hospital;

import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Color;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class GetDirection extends Activity {
 
      GoogleMap my_map;
      Polygon polygon;
      @Override
      protected void onCreate(Bundle savedInstanceState) 
      {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            FragmentManager fr_mgr = getFragmentManager();
            MapFragment map_frag = (MapFragment)fr_mgr.findFragmentById(R.id.map);
           
            my_map = map_frag.getMap();
            my_map.setMyLocationEnabled(true);
           
            LatLng Bhopal = new LatLng(23.233243200000000000, 77.434339400000000000);
            //Move the camera instantly to hamburg with a zoom of 15.
            my_map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bhopal, 15));
 
            // Zoom in, animating the camera.
            my_map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
           
           
            my_map.addMarker(new MarkerOptions().position(new LatLng(23.233243200000000000,77.434339400000000000)).title("Hello Bhopal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
           
            polygon = my_map.addPolygon(new PolygonOptions().add( new LatLng(23.226834,77.355309), new LatLng(23.214845,77.42672),
                  new LatLng(23.187707,77.388954),    new LatLng(23.200961,77.31411)).strokeColor(Color.RED).fillColor(Color.parseColor("#51000000")).strokeWidth(2));
      }
 
}