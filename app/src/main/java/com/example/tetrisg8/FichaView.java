package com.example.tetrisgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.core.content.ContextCompat;


public class FichaView extends View{

        public FichaView(Context context) {
            super(context);
            this.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorDarkBlue));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint p = new Paint();
            p.setColor(Color.BLACK);
            p.setStyle(Paint.Style.FILL);
            canvas.drawRect(500,1000,500,1000, p);
        }
    }

