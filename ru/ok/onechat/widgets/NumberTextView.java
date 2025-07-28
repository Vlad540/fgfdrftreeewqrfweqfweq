package ru.ok.onechat.widgets;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Keep;

public class NumberTextView extends View {
    public float a;
    public float b;

    public float getAlpha() {
        return this.b;
    }

    public float getOldTextWidth() {
        return 0.0f;
    }

    @Keep
    public float getProgress() {
        return this.a;
    }

    public float getTextWidth() {
        return 0.0f;
    }

    public final void onDraw(Canvas canvas) {
        throw null;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) 0.0f, 1073741824), i2);
    }

    public void setAlpha(float f) {
        this.b = f * 255.0f;
    }

    public void setBold(boolean z) {
        throw null;
    }

    public void setCenterAlign(boolean z) {
    }

    public void setDuration(long j) {
    }

    public void setOnTextWidthProgressChangedListener(as9 as9) {
    }

    @Keep
    public void setProgress(float f) {
        if (this.a != f) {
            this.a = f;
            invalidate();
        }
    }

    public void setTextColor(int i) {
        throw null;
    }

    public void setTextSize(int i) {
        t97 t97 = dh4.a;
        getContext();
        TypedValue.applyDimension(2, (float) i, dh4.c().getDisplayMetrics());
        throw null;
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }
}
