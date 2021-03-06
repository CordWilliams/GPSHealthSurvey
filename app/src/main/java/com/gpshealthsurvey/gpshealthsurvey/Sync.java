package com.gpshealthsurvey.gpshealthsurvey;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Sync extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sync, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        boolean isChecked = item.isChecked();

        if (id==R.id.action_sync_sample){
            //Sample Data
            Intent sampleIntent = new Intent(this,SampleData.class);
            startActivity(sampleIntent);
        }

        if (isChecked) {
            TextView syncHeader = (TextView) findViewById(R.id.syncLabel1);
            syncHeader.setText(R.string.sync_send);
        }
        else{
            TextView syncHeader = (TextView) findViewById(R.id.syncLabel1);
            syncHeader.setText(R.string.sync_receive);
        }

        return super.onOptionsItemSelected(item);
    }
}
