package com.example.cjwillis.dreammap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homeButton = (Button) findViewById(R.id.home_map_button);
        Button tokyoButton = (Button) findViewById(R.id.tokyo_map_button);
        Button torontoButton = (Button) findViewById(R.id.toronto_map_button);
        Button parisButton = (Button) findViewById(R.id.paris_map_button);
        Button newYorkButton = (Button) findViewById(R.id.new_york_map_button);
        Button londonButton = (Button) findViewById(R.id.london_map_button);

        homeButton.setOnClickListener(this);
        tokyoButton.setOnClickListener(this);
        torontoButton.setOnClickListener(this);
        parisButton.setOnClickListener(this);
        newYorkButton.setOnClickListener(this);
        londonButton.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_map_button:
                break;
            case R.id.tokyo_map_button:
                break;
            case R.id.toronto_map_button:
                break;
            case R.id.paris_map_button:
                break;
            case R.id.new_york_map_button:
                break;
            case R.id.london_map_button:
                break;
            default:
                break;
        }

    }
}
