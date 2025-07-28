package ru.ok.messages.settings.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.ok.messages.settings.FrgBaseSettings;

public class LedSeekBar extends qn implements SeekBar.OnSeekBarChangeListener {
    public final int b;
    public fa7 c;
    public final int[] o = vl.b().n().c.u();
    public final ShapeDrawable w0;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.SeekBar, android.widget.SeekBar$OnSeekBarChangeListener, android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View, ru.ok.messages.settings.view.LedSeekBar] */
    public LedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        zg4 b2 = zg4.b();
        int i = b2.n;
        this.b = b2.b;
        int dimension = (int) getResources().getDimension(yhc.d);
        setPadding(dimension, 0, dimension, 0);
        setProgressDrawable(new k6(this));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.w0 = shapeDrawable;
        shapeDrawable.setBounds(0, 0, i, i);
        this.w0.setIntrinsicHeight(i);
        this.w0.setIntrinsicWidth(i);
        setThumb(this.w0);
        setThumbOffset(i / 2);
        setOnSeekBarChangeListener(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.ProgressBar, ru.ok.messages.settings.view.LedSeekBar] */
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int[] iArr = this.o;
        int length = (int) ((((float) iArr.length) / ((float) getMax())) * ((float) i));
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        this.w0.getPaint().setColor(this.o[length]);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.ProgressBar, ru.ok.messages.settings.view.LedSeekBar] */
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = getProgress();
        int[] iArr = this.o;
        int length = (int) ((((float) iArr.length) / ((float) getMax())) * ((float) progress));
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        float max = ((float) getMax()) / ((float) this.o.length);
        setProgress((int) ((max / 2.0f) + (((float) length) * max)));
        e44 e44 = this.c;
        if (e44 != null) {
            int i = this.o[length];
            e44 e442 = e44;
            ga7 ga7 = (ga7) e442.b;
            FrgBaseSettings frgBaseSettings = (FrgBaseSettings) e442.c;
            if (frgBaseSettings != null) {
                frgBaseSettings.v1(ga7.P0.a, Integer.valueOf(i));
            } else {
                ga7.getClass();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.ProgressBar, ru.ok.messages.settings.view.LedSeekBar] */
    public void setColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length) {
                break;
            } else if (i == iArr[i3]) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        float max = ((float) getMax()) / ((float) this.o.length);
        setProgress((int) ((max / 2.0f) + (((float) i2) * max)));
    }

    public void setListener(fa7 fa7) {
        this.c = fa7;
    }
}
