package com.mbau.miniproject3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class BallView extends View {

    public float mX;
    public float mY;
    private final int mR;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    
    //construct new ball object
    public BallView(Context context, float x, float y, int r) {
        super(context);
        //color hex is [transparency][red][green][blue]
        mPaint.setColor(0xFF00FFFF);  //not transparent. color is green
        this.mX = x;
        this.mY = y;
        this.mR = r;  //radius
    }               
        
    //called by invalidate()
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(mX, mY, mR, mPaint);
    } 
}