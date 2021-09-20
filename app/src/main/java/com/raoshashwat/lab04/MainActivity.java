package com.raoshashwat.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    int[] ids;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        ids = new int[]{R.layout.layout1, R.layout.layout2, R.layout.layout3, R.layout.layout4, R.layout.layout5, R.layout.layout6, R.layout.layout7};

    }

    public void nextLayout(View view)
    {
        count = (++ count) % ids.length;
        setContentView(ids[count]);
    }

    /*@Override
    public boolean onTouchEvent(MotionEvent event)
    {
        if (event.getAction() == MotionEvent.ACTION_DOWN)
        {
            count = (++ count) % ids.length;
            setContentView(ids[count]);
        }
        return true;
    }*/
}