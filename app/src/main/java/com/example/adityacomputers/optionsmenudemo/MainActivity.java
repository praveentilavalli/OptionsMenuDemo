package com.example.adityacomputers.optionsmenudemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_home_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        TextView txtview=(TextView)findViewById(R.id.textview);
        switch(id)
        {
            case R.id.redmnitem:txtview.setTextColor(Color.RED);
                                return true;
            case R.id.greenmnitem:txtview.setTextColor(Color.GREEN);
                                  return true;
            case R.id.bluemnitem:txtview.setTextColor(Color.BLUE);
                                 return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
}
