package com.example.arleth.dadm_u3_practica1_arlethkarinaacostatorres;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo {

    float r, y, x, incrementoy;
    CountDownTimer timer;
    int desplazamiento, color;

    public Circulo(int posx, int posy,int posr, final Lienzo l, int c)
    {
        r= posr;
        x = posx;
        y = posy;
        color = c;

        timer = new CountDownTimer(1000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {

                x+=desplazamiento;

                if(x >= l.getWidth() -40)
                {
                    desplazamiento *=-1;

                }
                if(x <= 80)
                {
                    desplazamiento *=-1;
                }

                y += desplazamiento;
                if(y>= l.getHeight()-40)
                {
                    desplazamiento *=-1;
                }
                if(y<=80)
                {
                    desplazamiento*=-1;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();

            }
        };
    }


    public void pintar(Canvas c, Paint p)
    {
        p.setColor(color);
        c.drawCircle(x, y, r, p);
        c.drawCircle(x, y, r, p);
        c.drawCircle(x, y, r, p);
        c.drawCircle(x, y, r, p);
        c.drawCircle(x, y, r, p);
    }

    public void mover(int desplazar)
    {
        desplazamiento = desplazar;
        timer.start();
    }


}
