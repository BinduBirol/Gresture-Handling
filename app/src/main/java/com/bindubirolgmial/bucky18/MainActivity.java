package com.bindubirolgmial.bucky18;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView tv2;
    private GestureDetectorCompat gestureDetectorCompat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);


       btn1.setOnClickListener(
               new Button.OnClickListener(){
                   public void onClick(View v){
                       TextView tv1 = (TextView) findViewById(R.id.tv1);
                       tv1.setText("Good job!!!");

                   }
               }
       );

        btn1.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        TextView tv1 = (TextView) findViewById(R.id.tv1);
                        tv1.setText("Good long job!!!");
                        tv2.setText("that button was tapped long enough!!!");
                        return false;
                    }
                }
        );

        tv2 = (TextView) findViewById(R.id.tv2);
        this.gestureDetectorCompat= new GestureDetectorCompat(this, this);
        gestureDetectorCompat.setOnDoubleTapListener(this);


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tv2.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tv2.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tv2.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        tv2.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        tv2.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        tv2.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv2.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        tv2.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv2.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
