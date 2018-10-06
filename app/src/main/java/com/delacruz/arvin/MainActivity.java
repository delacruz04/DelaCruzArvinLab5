package com.delacruz.arvin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "4ITF ", "onCreate has executed.... "  );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "4ITF ", "onStart has executed.... "  );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "4ITF ", "onResume has executed.... "  );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "4ITF ", "onPause has executed.... "  );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "4ITF ", "onStop has executed.... "  );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "4ITF ", "onRestart has executed.... "  );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "4ITF ", "object is deallocated "  );
    }

    public void act1(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void act2(View v){
        Intent i = new Intent(this,SubActivity.class);
        startActivity(i);
    }

    public void map(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.MapButton) {
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser= Intent.createChooser(i, "Select your Map App");
            startActivity(chooser);
        }

    }


}
