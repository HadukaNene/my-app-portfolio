package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    //Enable a pop-up message when Spotify button is pressed
    public void spotyToast(View view) {
        Toast.makeText(getApplicationContext(),"That button will launch my Spotify App!",Toast.LENGTH_SHORT).show();
    }

    //Enable a pop-up message when Scores button is pressed
    public void scoresToast(View view) {
        Toast.makeText(getApplicationContext(),"That button will launch my Scores App!",Toast.LENGTH_SHORT).show();
    }

    //Enable a pop-up message when Library button is pressed
    public void libToast(View view) {
        Toast.makeText(getApplicationContext(),"That button will launch my Library App!",Toast.LENGTH_SHORT).show();
    }

    //Enable a pop-up message when buildIt button is pressed
    public void buildItToast(View view) {
        Toast.makeText(getApplicationContext(),"That button will launch my Super App!",Toast.LENGTH_SHORT).show();
    }

    //Enable a pop-up message when for xyz button is pressed
    public void xyzToast(View view) {
        Toast.makeText(getApplicationContext(), "That button will launch my XYZ Reader!",Toast.LENGTH_SHORT).show();
    }

    //Enable a pop-up message when Capstone button is pressed
    public void capstoneToast(View view) {
        Toast.makeText(getApplicationContext(),"That button will launch my Capstone App!",Toast.LENGTH_SHORT).show();
    }

}
