package com.cuyazilim.eksioffline;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.drawable.*;
import android.support.v7.app.*;


public class EksiActivity extends ActionBarActivity {
static ActionBar gb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eksi);
		getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFF009580));
		gb=getSupportActionBar();
    }
public static void setSub(String text){
	gb.setSubtitle(text);
}
	


/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_eksi, menu);
        return true;
    }
*/
/*    @Override
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
    }*/
}
