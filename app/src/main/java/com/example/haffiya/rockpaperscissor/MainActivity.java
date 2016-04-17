package com.example.haffiya.rockpaperscissor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static ImageView imgView;
    public static ImageButton r_imgBtn, p_imgBtn, s_imgBtn;
    public static int count = 0;
    public static TextView result_tv, count_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        r_imgBtn = (ImageButton) findViewById(R.id.btnRock);
        p_imgBtn = (ImageButton) findViewById(R.id.btnPaper);
        s_imgBtn = (ImageButton) findViewById(R.id.btnScissor);
        imgView = (ImageView) findViewById(R.id.viewCmp);
        result_tv = (TextView) findViewById(R.id.textResult);
        count_tv = (TextView) findViewById(R.id.textCount);

        //Creating and initializing listener
        Game game = new Game();
        r_imgBtn.setOnClickListener(game);
        p_imgBtn.setOnClickListener(game);
        s_imgBtn.setOnClickListener(game);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
