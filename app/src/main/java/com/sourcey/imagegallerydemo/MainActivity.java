package com.sourcey.imagegallerydemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button galleryButton = (Button) findViewById(R.id.btn_gallery);
        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGalleryActivity();
            }
        });

        startGalleryActivity();
    }

    public void startGalleryActivity() {
        ArrayList<String> images = new ArrayList<String>();
        images.add("http://i.telegraph.co.uk/multimedia/archive/01421/flickr-pix6_1421814c.jpg");
        images.add("http://farm1.staticflickr.com/162/416152814_8f7ffb4bb1_z.jpg");
        images.add("http://a1.dspnimg.com/data/l/1627610726061_S8WvSbhk_l.jpg");
        images.add("https://c4.staticflickr.com/8/7432/10111952905_7e58ecb32f_b.jpg");
        Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
        intent.putStringArrayListExtra(GalleryActivity.EXTRA_NAME, images);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
