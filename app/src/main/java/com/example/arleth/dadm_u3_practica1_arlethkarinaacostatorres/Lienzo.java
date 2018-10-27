package com.example.arleth.dadm_u3_practica1_arlethkarinaacostatorres;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {
    Circulo c1, c2, c3, c4, c5;
    public Lienzo(Context context) {
        super(context);

        c1 = new Circulo(150, 200, 80, this, Color.GRAY);
        c1.mover(25);
        c2 = new Circulo(100, 100, 50, this, Color.MAGENTA);
        c2.mover(3);
        c3 = new Circulo(200, 250, 100, this, Color.CYAN);
        c3.mover(8);
        c4 = new Circulo(300, 100, 20, this, Color.RED);
        c4.mover(15);
        c5 = new Circulo(500, 300, 60, this, Color.YELLOW);
        c5.mover(20);



    }

    protected void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();
        c.drawColor(Color.WHITE);
        c1.pintar(c, p);
        c2.pintar(c, p);
        c3.pintar(c,p);
        c4.pintar(c,p);
        c5.pintar(c,p);
    }

    public  boolean onTouchEvent(MotionEvent e)
    {
        return true;
    }
}
