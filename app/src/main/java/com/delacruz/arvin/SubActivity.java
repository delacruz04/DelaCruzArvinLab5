package com.delacruz.arvin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void act1(View v){
        Intent i = new Intent(this,MainActivity.class);
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